package alllibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabbaseclass 
{
	public WebDriver driver;
	public void initilization() throws InterruptedException, IOException
	{
		driver=new ChromeDriver();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(swaglabutilization.getdatafrompf("URL"));
		
	}

}
