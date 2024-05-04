package autoproschool.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogoutPagePS 
{
	
	WebDriver driver;
	
	@FindBy(xpath="(//*[name()='svg'][@role='img'])[3]")
	private WebElement dropdownlogout;
	
	public void dropdownlogoutm() throws InterruptedException
	{
		Thread.sleep(1000);
		dropdownlogout.click();
		    
		
	}
	
	@FindBy(xpath="(//p[normalize-space()='Logout'])[1]")
	private WebElement logout;
	
	
	public void logoutm() throws InterruptedException 
	{
		Thread.sleep(1000);
		logout.click();
		 ;
	
	}
	
	 public  LogoutPagePS (WebDriver driver)
     {
   	     this.driver=driver;
   		 PageFactory.initElements(driver, this);
   		 
     }

}
