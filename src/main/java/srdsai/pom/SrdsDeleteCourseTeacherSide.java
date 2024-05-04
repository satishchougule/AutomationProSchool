package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsDeleteCourseTeacherSide 
{
	
	WebDriver driver;
	
	public SrdsDeleteCourseTeacherSide(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//i[@class='fa-solid fa-ellipsis-vertical'])[1]")
	private WebElement deleteCourse;
	
	public void DeleteCourseM() throws InterruptedException
	{
		deleteCourse.click();
		
		Thread.sleep(1000);
		
		WebElement delete=driver.findElement(By.xpath("(//li[@role='menuitem'])[2]"));
		delete.click();
		
		Thread.sleep(1000);
		
		WebElement DeleteButton=driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]"));
		DeleteButton.click();
		
	
	}
	

}
