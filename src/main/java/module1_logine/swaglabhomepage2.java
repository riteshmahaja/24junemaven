package module1_logine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabhomepage2 
{
@FindBy(xpath = "//button[text()='Open Menu']")	private WebElement tape;
WebDriver driver;

public swaglabhomepage2(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	this.driver = driver;
	
}

public String  getSwagLabHomePageTitle()
{
	String act = driver.getTitle();
	return act;
}
public void clickmenu()
{
	tape.click();
}

}
