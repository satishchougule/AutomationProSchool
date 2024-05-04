package autoproschool.pom;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentSignUpPagePS 
{
	
	   WebDriver driver;
	   
	   public  StudentSignUpPagePS (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	   
	   
	   @FindBy(xpath="//button[contains(text(),'Student')]")
	   private WebElement studentbutton;
	   
	   
	   public void Studentbutton() throws InterruptedException
	   {
		    studentbutton.click();
		   
		    WebElement email= driver.findElement(By.xpath("//input[@id=':r0:']"));
		    SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
	        String currentTime = dateFormat.format(new Date());
	        String dynamicEmail = "satish+" + currentTime + "@webarcitech.com";
	        email.sendKeys(dynamicEmail);
		 
	        
	        WebElement password=driver.findElement(By.xpath("//input[@id=':r1:']"));
	        password.sendKeys("Sat@12345");
	        
	        WebElement register=driver.findElement(By.xpath("//button[text()='Register']"));
	        register.click();
	        
	        Thread.sleep(3000);
	        
	        WebElement confirmRegister= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/button[2]"));
	        Thread.sleep(1000);
	        confirmRegister.click();
	        Thread.sleep(12000);
	       
	        WebElement Connfirmbutton=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/button[1]"));
	        Thread.sleep(13000);
	        Connfirmbutton.click();
	        
	       
	   }

}
