package module1_logine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabmenupage2 
{
@FindBy(xpath = "//a[text()='Logout']")	private WebElement logout;

public swaglabmenupage2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clicklogout()
{
	logout.click();
}

}
