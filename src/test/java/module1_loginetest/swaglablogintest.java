package module1_loginetest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import alllibrary.swaglabbaseclass;
import alllibrary.swaglabutilization;
import module1_logine.swaglabhomepage2;
import module1_logine.swaglabloginpage2;
import module1_logine.swaglabmenupage2;

public class swaglablogintest extends swaglabbaseclass 
{
	swaglabloginpage2 login;
	swaglabhomepage2 home;
	swaglabmenupage2 menu;
	int tcd;
	
	
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		initilization();	
         login=new swaglabloginpage2(driver);
         home=new swaglabhomepage2(driver);
         menu=new swaglabmenupage2(driver);
		
		
		
	}
	
	@BeforeMethod
	public void logingtoaap() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.username(swaglabutilization .getdatafrompf("UN"));
		login.password(swaglabutilization.getdatafrompf("PWd"));
		login.clicklog();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifiedtital() throws EncryptedDocumentException, IOException, InterruptedException
	{
		tcd=101;
		String actTitle=home.getSwagLabHomePageTitle();
		 String exptital =(swaglabutilization.gettd(0, 2));
		 Assert.assertEquals(actTitle, exptital);
		 Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logoutapp(ITestResult s1) throws IOException, InterruptedException
	{
		if(s1.getStatus() == ITestResult.FAILURE)
		{
			 swaglabutilization.cpaturess(driver, tcd);
		}
		home.clickmenu();
		menu.clicklogout();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	

}
