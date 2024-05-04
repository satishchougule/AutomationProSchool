package autoproschool.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePS {
	
public HomePagePS(WebDriver driver)
{
	
	
	PageFactory.initElements(driver, this);
		
}
	
	@FindBy(xpath="//a[text()='Sign Up']")
	private WebElement signupbutton;
	
	public void signbutton()
	{
		signupbutton.click();
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Loginbutton;
	
	public void Loginbutton()
	{
		Loginbutton.click();
	}
	
	

}
