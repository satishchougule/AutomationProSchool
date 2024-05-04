package autoproschool.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalyticsForLessonPS 
{
	WebDriver driver;
	
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
	}
	
	@FindBy(xpath="//i[@class='fa-solid fa-angle-right']")
	private WebElement clickbutton;
	
	public void clickbuttonmm() throws InterruptedException
	{
		clickbutton.click();
		Thread.sleep(1000);
	}
	
	
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]") 
    private WebElement lessonProgress;
   
    public void lessonProgressM() 
   {
	   lessonProgress.click();
   }
    
    @FindBy(xpath="//input[@placeholder='Search by student name']")
    private WebElement studentname;
    
    public void studentnamem()
    {
    	studentname.sendKeys("Satish");
    }
    
    
	
    public   AnalyticsForLessonPS(WebDriver driver)
    {
  	     this.driver=driver;
  		 PageFactory.initElements(driver, this);
  		 
    }
	
 
}
