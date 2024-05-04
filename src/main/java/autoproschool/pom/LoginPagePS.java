package autoproschool.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePS 
{
	 WebDriver driver;
	 
	 public  LoginPagePS (WebDriver driver)
     {
   	     this.driver=driver;
   		 PageFactory.initElements(driver, this);
     }
	 
	@FindBy(xpath="//a[text()='Login']")
		private WebElement Loginbutton;
	
		public void Loginbuttonm()
	{
			Loginbutton.click();
		}
	
		
     
	 @FindBy(xpath="//button[text()='Teacher']")
	 
	 private WebElement Teacherbutton;
	 
	 public void Teacherbutton()
	 {
		 Teacherbutton.click();
	 }
	 
	 @FindBy(xpath="//input[@id=':r0:']")
	 private WebElement email;
	 
	 public void email()
	 
	 {
		 email.sendKeys("satish+18@webarcitech.com");
		 
		 
	 }
	 
	 @FindBy(xpath="//input[@id=':r1:']")
	 private WebElement password;
	 
	 public void passoword()
	{
		password.sendKeys("Sat@12345");
	}
	
	 @FindBy(xpath="//button[text()='Login']")
	 private WebElement login;
	 
	 public void login() throws InterruptedException
	 {
		 login.click();
		 Thread.sleep(1500);
	 }
	 
	 
	 
     }
	 

	
	
	


