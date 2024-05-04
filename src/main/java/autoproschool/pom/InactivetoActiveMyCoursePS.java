package autoproschool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InactivetoActiveMyCoursePS 
{
	

	WebDriver driver;
	 
	 public  InactivetoActiveMyCoursePS (WebDriver driver)
    {
  	     this.driver=driver;
  		 PageFactory.initElements(driver, this);
    }
	 
	 
	 @FindBy(xpath="(//a[normalize-space()='My Courses'])[1]")	
	 private WebElement inactiveCourseDashboard;
	 
	 public void InactiveCourseDashboard()
	 {
		 inactiveCourseDashboard.click();
		 WebElement inactivetab=driver.findElement(By.xpath("//button[contains(text(),'Inactive Courses')]"));
		 inactivetab.click();
		 WebElement inactiveradiobutton=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/span[1]"));
		 inactiveradiobutton.click();
		 WebElement clickonYes=driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
		 clickonYes.click();
		 
	 }

}
