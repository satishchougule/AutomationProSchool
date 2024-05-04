package srdsai.pom;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsAnalyticsForAssignment 
{
	WebDriver driver;
	
	public SrdsAnalyticsForAssignment(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")

	private WebElement viewcoursen;

	public void viewcoursenm() throws InterruptedException

		{

	       Thread.sleep(1000);

	       viewcoursen.click();

	       Thread.sleep(1000);

	       viewcoursen.sendKeys("MYSQL");

	       Thread.sleep(2000);

	       viewcoursen.sendKeys(Keys.ARROW_DOWN);

	       viewcoursen.sendKeys(Keys.ENTER);

	       Thread.sleep(2000);
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver; 
  	  		
  	  	   js.executeScript("window.scrollBy(0, 500);");
  	  	   
  	  	   WebElement lessonprogress=driver.findElement(By.xpath("(//div[@class='View-Progress-btn'][normalize-space()='Lesson Progress'])[1]"));
  	  	   lessonprogress.click();
  	  	   
  	  	   Thread.sleep(1000);
  	  	   WebElement assignmentprogress=driver.findElement(By.xpath("//button[text()='Assignment Progress']"));
  	  	   assignmentprogress.click();
  	  	   
  	  	   Thread.sleep(1000);
  	  	   WebElement viewanalytics=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[2]/table/tbody/tr/td[6]/div/button"));
      	   viewanalytics.click();
      	   
      	
}

}

	


	
	
	
	


