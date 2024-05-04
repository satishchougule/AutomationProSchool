package autoproschool.pom;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import autoproschool.testclass.BaseClass;

public class SignupPagePS 
{
         WebDriver driver;
     
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
    		 	SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
    	        String currentTime = dateFormat.format(new Date());
    	        String dynamicEmail = "satish+" + currentTime + "@webarcitech.com";
    	        email.sendKeys(dynamicEmail);
    		 
    		//email.sendKeys("satish+2@webarcitech.com");
          }
    	 @FindBy(xpath="//input[@id=':r1:']")
    	 private WebElement password;
    	 
    	public void passoword()
    	{
    		password.sendKeys("Sat@12345");
    	}
	     	
    	 @FindBy(xpath="//button[text()='Login']")
    	 private WebElement login;
    	 
    	 public void login()
    	 {
    		 login.click();
    	 }
    	@FindBy(xpath="//button[@aria-label='close']//*[name()='svg']") 
    	private WebElement closebutton;
    	
    	public void closebutton()
    	{
    		closebutton.click();
    	}
    	@FindBy(xpath="//i[@class='fa-solid fa-x']")
    	private WebElement closepopup;
    	
    	public void closepopup()
    	{
    		closepopup.click();
    	}
    	 
    	@FindBy(xpath="//button[text()='Register']")
    	private WebElement Register;
    	
    	public void Register() throws InterruptedException
    	{
    	  Register.click();
    	  Thread.sleep(3000);
    	}
    	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/button[2]")
    	private WebElement confirmatioregister;
    	
    	public void confirmatioregisterm() throws InterruptedException
    	{
    		Thread.sleep(1000);
    		confirmatioregister.click();
    		Thread.sleep(12000);
   
    	}
    	
    	@FindBy(xpath="/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]")
    	private WebElement Confirmbutton;
    	
    	public void Confirmbutton() throws InterruptedException
    	{  
    		Thread.sleep(13000);
    		Confirmbutton.click();
    	}
    	    
    	

            public SignupPagePS(WebDriver driver)
    	 {
    		 this.driver=driver;
    		 PageFactory.initElements(driver, this);
    		 
    	 }
	
	}
	

	
	

