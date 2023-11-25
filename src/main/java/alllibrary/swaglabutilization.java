package alllibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class swaglabutilization 
{
	public static String gettd (int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
	//	FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\javaselenium\\testdata\\New XLS Worksheet.xls");
		FileInputStream file=new FileInputStream( System.getProperty("user.dir")+"\\testdata\\New XLS Worksheet.xls");
		Sheet sh = WorkbookFactory.create(file).getSheet("ddf");
		
		String value = sh.getRow(rowindex).getCell(cellindex).toString();
		
		return value;
	}
	
	public static void cpaturess(WebDriver driver ,int tcd) throws IOException
	
	{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//File dest=new File("C:\\Users\\HP\\eclipse-workspace\\javaselenium\\filledtcss\\TestCaseId"+tcd+".jpg");
	File dest=new File(System.getProperty("user.dir")+"\\filledtcss\\TestCaseId"+tcd+".jpg");
	
	
	org.openqa.selenium.io.FileHandler.copy(src,dest);
		
	}
	
	public static String getdatafrompf(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Propertyfile.properties");
		
		Properties p=new Properties();
		
		p.load(file);
		
		 String value = p.getProperty(key);
		 
		 return value;
		
		
	}

}