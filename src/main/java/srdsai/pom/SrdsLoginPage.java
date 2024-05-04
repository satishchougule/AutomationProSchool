package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsLoginPage 
{
	

    WebDriver driver;
	 
	 public SrdsLoginPage  (WebDriver driver)
     {
   	     this.driver=driver;
   		 PageFactory.initElements(driver, this);
     }
	 
	 @FindBy(xpath="//button[text()='Teacher']")
	 private WebElement Teacherbutton;
	 
	      public void TeacherButton()
	 {
		 Teacherbutton.click();
		 
		 WebElement email =driver.findElement(By.xpath("//input[@id=':r0:']"));
		 email.sendKeys("satish+88@webarcitech.com");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@id=':r1:']"));
		 password.sendKeys("Sat@12345");
		 
		 WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		 login.click();
		 
		 
		 
		 
		 
	 }
	 
	 

}
