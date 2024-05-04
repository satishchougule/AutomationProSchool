package autoproschool.pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnalyticsForAssignmentPS 
{
	
	WebDriver driver;
	
	public AnalyticsForAssignmentPS (WebDriver driver)
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

	       Thread.sleep(1000);

		}



	@FindBy(xpath="//i[@class='fa-solid fa-angle-right']")

		private WebElement clickbutton;

		public void clickbuttonmm() throws InterruptedException

		{

			Thread.sleep(1000);

			clickbutton.click();

			Thread.sleep(1000);

			System.out.println("executed1");

		}





	@FindBy(xpath="(//div[@class='View-Progress-btn'])[2]")

		private WebElement AssignmentProgress;

		public void AssignmentProM() throws InterruptedException                                                            

		{  

			Thread.sleep(3000);

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", AssignmentProgress);             

			Thread.sleep(1000); 

			System.out.println("executed2");

	    }



	 @FindBy(xpath="//button[contains(text(),'View analytics')]")

	    private WebElement viewanalytics;

	 	public void viewanalyticsm() throws InterruptedException

	 	{  

	 		Thread.sleep(2000);

	 		viewanalytics.click();

	 		System.out.println("executed3");

	 	}

	}


	


