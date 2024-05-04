package autoproschool.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentCreateProfilePS 
{
	
	WebDriver driver;
	
	public StudentCreateProfilePS (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[contains(@class,\"begin-journey-btn\")]")
	private WebElement createProfile;
	
	public void CreateProfile() throws InterruptedException
	{
		createProfile.click();
		
		WebElement studentname=driver.findElement(By.xpath("(//input[contains(@name,\"name\")])[1]"));
		studentname.sendKeys("Satish");
		
		Thread.sleep(1000);
		
		WebElement selectgrade=driver.findElement(By.xpath("(//select[@id='gendar-select-feild'])[7]"));
		
		Select Studentgrade=new Select(selectgrade);
		Studentgrade.selectByVisibleText("Grade 3");
		
		Thread.sleep(1000);
		
		WebElement Gender=driver.findElement(By.xpath("(//select[@id='gendar-select-feild'])[8]"));
		Select studentgender=new Select(Gender);
		studentgender.selectByIndex(1);
		
		    WebElement StudentDateofbirth=driver.findElement(By.xpath("(//input[@class=\"form-control\"])[3]"));
		    Thread.sleep(3000);
		    StudentDateofbirth.click();
		    Thread.sleep(3000);
		    WebElement clickonmonth =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table/thead/tr[1]/th[2]"));
		    clickonmonth.click();	
		    System.out.println("click on month");
		    Thread.sleep(3000);
		   // WebElement againclickonmonth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[1]/thead/tr/th[2]"));
		    WebElement againclickonmonth =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table[1]/thead/tr/th[2]"));
		    againclickonmonth.click();	
		    System.out.println("again click on month");
		    Thread.sleep(3000);
		   // WebElement clickonprearrow = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[1]/thead/tr/th[1]"));
		    WebElement clickonprearrow = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table[1]/thead/tr/th[1]/span"));
		    clickonprearrow.click();	
		    System.out.println(" click on pre");
		    Thread.sleep(3000);
		    WebElement SelectYear =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table[2]/tbody/tr[1]/td[1]"));
		    SelectYear.click();	
		    System.out.println("Select Year 2009");				
		    Thread.sleep(3000);
		    WebElement SelctMonth =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table[2]/tbody/tr[1]/td[4]"));
		    SelctMonth.click();
		    System.out.println("Month is Select");
		    Thread.sleep(3000);
		    WebElement Selectdate =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[5]/div[1]/div/div/table/tbody/tr[1]/td[5]"));
		    Selectdate.click();
		    System.out.println("Date is Selected");
		    
		      WebElement language=driver.findElement(By.xpath("(//select[@id='gendar-select-feild'])[9]"));
		      
		      Select Language=new Select(language);
		      Language.selectByIndex(1);
		    
		     Thread.sleep(2000);
		    
		      WebElement enterlocation= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div[7]/input"));
		   
		      Thread.sleep(2000);
		      enterlocation.click();
		      enterlocation.sendKeys("Mumbai");
			  Thread.sleep(2000);
			  enterlocation.sendKeys(Keys.ARROW_DOWN);
			  enterlocation.sendKeys(Keys.ENTER);
			  
			  Thread.sleep(1000);
			  
			  WebElement studentprofiledetailsNext=driver.findElement(By.xpath("(//button[@class='form-buttons dashboard-form-next-btn'][normalize-space()='Next'])[3] "));
			  studentprofiledetailsNext.click();
			  
			  Thread.sleep(1000);
			  
//			  WebElement studentupadteprofile=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/div"));
//			  studentupadteprofile.click();
			  
			  Thread.sleep(1000);
			  WebElement Introduceyourself=driver.findElement(By.xpath("(//textarea[contains(@class,\"introduce-yourself-text\")])[1]"));
			  Introduceyourself.sendKeys("I am Student");
			  
			  Thread.sleep(1000);
			  WebElement introduceyourselfnextbutton=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[3]/button[2]"));
			  introduceyourselfnextbutton.click();
			  
			  Thread.sleep(1000);
			  WebElement enterinterestedsubject=driver.findElement(By.xpath("(//input[contains(@name,\"interest_names\")])[1]"));
			  enterinterestedsubject.sendKeys("SQL");
			  
			  Thread.sleep(1000);
			  WebElement clickonaddbutton=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[1]/button"));
			  clickonaddbutton.click();
			  
			  
			  Thread.sleep(2000);
			  WebElement addingsubject=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div[3]/div/a[1]"));
			  addingsubject.click();
			   
			  WebElement Finishbutton=driver.findElement(By.xpath("(//button[@class='update-profile-image finish-button'][normalize-space()='Finish'])[3]"));
			  Finishbutton.click();
			  

		
	}
	

}
