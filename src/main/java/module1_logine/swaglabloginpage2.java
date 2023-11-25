package module1_logine;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class swaglabloginpage2 
{
	@FindBy(xpath = "//input[@type='text']") private WebElement un;
	
	@FindBy(xpath = "//input[@type='password']")private WebElement pass;
	
    @FindBy(xpath = "//input[@type='submit']")	private WebElement login;
    
    public swaglabloginpage2(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void username(String user)
    {
    	un.sendKeys(user);
    }
    public void password(String passwording)
    {
    	pass.sendKeys(passwording);
    }
    public void clicklog()
    {
    	login.click();
    }
    


}
