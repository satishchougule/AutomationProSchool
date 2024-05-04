package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsStudentViewResult 
{
	
	WebDriver driver;
	
	   public SrdsStudentViewResult(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
		 private WebElement SearchForSubject;
		 
		 
		     public void searchforsubjectm() throws InterruptedException
		 {
			
			 
			    Thread.sleep(5000);
			    SearchForSubject.click();
		 	    Thread.sleep(1000);
		 		SearchForSubject.sendKeys("SQL");
		 	    Thread.sleep(1000);
		 		SearchForSubject.sendKeys(Keys.ARROW_DOWN);
		 		SearchForSubject.sendKeys(Keys.ENTER);
		 		System.out.println("click on SQL");
		 		
		 		WebElement Lesson=driver.findElement(By.xpath("(//i[@class='fa-solid fa-angle-right'])[1]"));
		 		Lesson.click();
		 		
		 		WebElement viewresult=driver.findElement(By.xpath("(//button[normalize-space()='View Result'])[1]"));
		 		viewresult.click();
		 		
		 		WebElement viewdeatilresult=driver.findElement(By.xpath("(//button[normalize-space()='View Detailed Result'])[1]"));
		 		viewdeatilresult.click();
		 		
		 		WebElement closepop=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/button/div/div/button"));	
		 		closepop.click();
		 		
		 		Thread.sleep(1000);
		 		WebElement Next1=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next1.click();
		 		Thread.sleep(1000);
		 		WebElement Next2=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next2.click();
		 		Thread.sleep(1000);
		 		WebElement Next3=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next3.click();
		 		Thread.sleep(1000);
		 		WebElement Next4=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next4.click();
		 		Thread.sleep(1000);
		 		WebElement Next5=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next5.click();
		 		Thread.sleep(1000);
		 		WebElement Next6=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next6.click();
		 		Thread.sleep(1000);
		 		WebElement Next7=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next7.click();
		 		Thread.sleep(1000);
		 		WebElement Next8=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next8.click();
		 		Thread.sleep(1000);
		 		WebElement Next9=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next9.click();
		 		Thread.sleep(1000);
		 		WebElement Next10=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[2]/div[3]/button[2]"));
		 		Next10.click();
		 		Thread.sleep(2000);
		 		
		 		
		 		WebElement CloseButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div[1]/div[3]/div/div[1]/span"));
		 		Thread.sleep(1000);
		 		CloseButton.click();
		 		
			 
			 
			}
		 
		}



