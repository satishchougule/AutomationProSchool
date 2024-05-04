package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsEditCourseTeacherSide 
{
	
	
	
WebDriver driver;
	
      public SrdsEditCourseTeacherSide(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
      @FindBy(xpath="(//i[@class='fa-solid fa-ellipsis-vertical'])[1]")
  	  private WebElement EditCourse;
      
      public void EditCourse() throws InterruptedException
      {
    	  
    	  EditCourse.click();
    	  
    	  Thread.sleep(1000);
    	  WebElement datapass=driver.findElement(By.xpath("//textarea[@id=\"create-course-description\"]"));
    	  datapass.sendKeys("Modfiy the Content");
    	  
    	  Thread.sleep(1000);
    	  
    	  WebElement updateandpublish=driver.findElement(By.xpath("(//button[normalize-space()='Update and Publish'])[1]"));
    	  updateandpublish.click();
    	  
    	  
    	  
    	  
      }
	

}
