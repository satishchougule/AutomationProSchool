package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsAnalyticsForLesson 
{
	WebDriver driver;
	
	public SrdsAnalyticsForLesson(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement ViewCourse;
	
	public void ViewCourseM() throws InterruptedException
	{
		Thread.sleep(1000);
		ViewCourse.click();
		Thread.sleep(1000);
		ViewCourse.sendKeys("MYSQL");
		Thread.sleep(2000);
		ViewCourse.sendKeys(Keys.ARROW_DOWN);
		ViewCourse.sendKeys(Keys.ENTER);
		
		   Thread.sleep(2000);
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver; 
	  		
	  	   js.executeScript("window.scrollBy(0, 500);");
	  	   
	  	   WebElement lessonprogress=driver.findElement(By.xpath("(//div[@class='View-Progress-btn'][normalize-space()='Lesson Progress'])[1]"));
	  	   lessonprogress.click();
		
	}
	
  }
