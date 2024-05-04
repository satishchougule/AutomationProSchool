package autoproschool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivetoInactiveMyCoursePS 
{
	
	
	WebDriver driver;
	 
	 public  ActivetoInactiveMyCoursePS (WebDriver driver)
    {
  	     this.driver=driver;
  		 PageFactory.initElements(driver, this);
    }
	 
	 @FindBy(xpath="(//a[normalize-space()='My Courses'])[1]")	
	 private WebElement activecourseDashboard;
	 
	 public void ActivecourseDashboard() throws InterruptedException
	 {
		 activecourseDashboard.click();
//		 Thread.sleep(1000);
//		 WebElement searchboxmycourse=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
//		 searchboxmycourse.click();
//		 Thread.sleep(1000);
//		 searchboxmycourse.sendKeys("Unix");
//		 Thread.sleep(1000);
//		 searchboxmycourse.sendKeys(Keys.ARROW_DOWN);
//		 Thread.sleep(1000);
//		 searchboxmycourse.sendKeys(Keys.ENTER);
		 
		 
		 WebElement inactiveRadiobutton=driver.findElement(By.xpath("//span[contains(@class,\"slider round\")]"));
		 inactiveRadiobutton.click();
		 
		 WebElement clickOnconfirmessage=driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
		 Thread.sleep(1000);
		 clickOnconfirmessage.click();
		 
		 
		 
		 
		 
	 }
	 
	 

}
