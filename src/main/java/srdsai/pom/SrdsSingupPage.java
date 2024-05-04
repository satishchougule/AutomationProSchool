package srdsai.pom;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsSingupPage 
{
	
	 WebDriver driver;
	 
	   public SrdsSingupPage  (WebDriver driver)
     {
   	     this.driver=driver;
   		 PageFactory.initElements(driver, this);
     }
     
	 @FindBy(xpath="//button[text()='Teacher']")
	 
	 private WebElement Teacherbutton;
	 
	 public void Teacherbutton() throws InterruptedException
	 {
		    Teacherbutton.click();
		 
		    WebElement email=driver.findElement(By.xpath("//input[@id=':r0:']"));
		    SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
	        String currentTime = dateFormat.format(new Date());
	        String dynamicEmail = "satish+" + currentTime + "@webarcitech.com";
	        email.sendKeys(dynamicEmail);
	        
	        WebElement password=driver.findElement(By.xpath("//input[@id=':r1:']"));
	        password.sendKeys("Sat@12345");
	        
	        WebElement Registerbutton = driver.findElement(By.xpath("//button[text()='Register']"));
	        Registerbutton.click();
	        Thread.sleep(3000);
	        
	        WebElement ConfirmRegister=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/button[2]"));
	        Thread.sleep(1000);
	        ConfirmRegister.click();
	        Thread.sleep(12000);
	        
	        WebElement Confirmbutton=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]"));
	        Thread.sleep(13000);
	        Confirmbutton.click();
	        
	        
	        
	        
	        
	     
		 
	 }
	 
	 

}
