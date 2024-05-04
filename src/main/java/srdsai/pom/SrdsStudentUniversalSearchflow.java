package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsStudentUniversalSearchflow 
{
	
	WebDriver driver;
	
	public SrdsStudentUniversalSearchflow(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div/div/div[1]/div/div[1]/div/div/div/div/input")
	private WebElement universalsearch;
	
	public void studentUniversalSearch() throws InterruptedException
	{
		
		universalsearch.sendKeys("Math");
		WebElement Backbutton1=driver.findElement(By.xpath("//span[text()='Back']"));
		Backbutton1.click();
		
		Thread.sleep(1000);
		WebElement mycourse =driver.findElement(By.xpath("//a[@class=\\\"active dashboardlink\\\"]"));
		mycourse.click();
		
		Thread.sleep(1000);
		WebElement searchbutton=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/div/div/input"));
		searchbutton.click();
		
		Thread.sleep(1000);
		WebElement backbutton2=driver.findElement(By.xpath("//span[text()='Back']"));
		backbutton2.click();
		
		Thread.sleep(1000);
		WebElement myteacher=driver.findElement(By.xpath("(//a[@class=\" dashboardlink\"])[1]"));
		myteacher.click();
		
		Thread.sleep(1000);
		WebElement searchbutton1=driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/div/div/input"));
		searchbutton1.click();
		
		Thread.sleep(1000);
		WebElement searchhere=driver.findElement(By.xpath("//i[@class=\"fas fa-search\"]"));
		searchhere.sendKeys("Satish");
		
		
	}
	}
