package autoproschool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InviteforStudentPS 
{
	
	WebDriver driver;
	
	public InviteforStudentPS(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")

	private WebElement SerchingSubjecttab;

	public void SerchingSubject() throws InterruptedException

		{

	       Thread.sleep(1000);

	       SerchingSubjecttab.click();

	       Thread.sleep(1000);

	       SerchingSubjecttab.sendKeys("MYSQL");

	       Thread.sleep(2000);

	       SerchingSubjecttab.sendKeys(Keys.ARROW_DOWN);

	       SerchingSubjecttab.sendKeys(Keys.ENTER);

	       Thread.sleep(1000);

		}


	
	@FindBy(xpath="(//div[@class='view-course-details-edit-and-share-folder view-course-details-share-btn'])[1]")
	private WebElement invitestudent;
	
	public void InviteStudent() throws InterruptedException
	{
		invitestudent.click();
		
		Thread.sleep(1000);
		
		WebElement addStudentmailidtextbox=driver.findElement(By.xpath("//input[contains(@name,\"students\")]"));
		addStudentmailidtextbox.click();
		Thread.sleep(1000);
		addStudentmailidtextbox.sendKeys("satish+19@webarcitech.com");
		
		WebElement Addbutton=driver.findElement(By.xpath("//button[contains(@class,\"add-student-btn\")]"));
		Thread.sleep(1000);
		Addbutton.click();
		
		WebElement invitebutton=driver.findElement(By.xpath("//button[contains(text(),'Invite')]"));
		Thread.sleep(1000);
		invitebutton.click();
		
		
		
		
		
	}
      
	    
	
	
}
