package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SrdsSetupProfilePage 
{
	  WebDriver driver;
		
		public SrdsSetupProfilePage(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}

	@FindBy(xpath="//button[contains(@class,\"begin-journey-btn\")]")
	private WebElement Setupprofilebutton;
	public void Setupprofile() throws InterruptedException
	{
		    Setupprofilebutton.click();
		
		    WebElement TitleSP=driver.findElement(By.xpath("//div[4]//div[2]//div[1]//div[1]//div[1]//div[2]//select[1]"));
		    Thread.sleep(1000);
		    Select titlesp=new Select(TitleSP);
		    titlesp.selectByVisibleText("Mr.");
		
		    WebElement fullname=driver.findElement(By.xpath("(//input[@id=\"teacher-create-profile-input\"])[1]"));
		    fullname.sendKeys("Satish18");
		
		    WebElement birtthdate=driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
		    Thread.sleep(1000);
		    birtthdate.click();
		    Thread.sleep(3000);
		    WebElement clickonmonth1=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table/thead/tr[1]/th[2]"));
		    clickonmonth1.click();	
		    System.out.println("click on moth");
		    Thread.sleep(3000);
		    WebElement againclickonmonth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[1]/thead/tr/th[2]"));
		    againclickonmonth.click();	
		    System.out.println("again click on moth");
		    Thread.sleep(3000);
		    WebElement clickonprearrow = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[1]/thead/tr/th[1]"));
		    clickonprearrow.click();	
		    System.out.println(" click on pre");
		    Thread.sleep(3000);
		    WebElement SelectYear =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[2]/tbody/tr[1]/td[4]"));
		    SelectYear.click();	
		    System.out.println("Select Year 1992");				
		    Thread.sleep(3000);
		    WebElement SelctMonth =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table[2]/tbody/tr[3]/td[1]"));
		    SelctMonth.click();
		    System.out.println("Moth is Select");
		    Thread.sleep(3000);
		    WebElement Selectdate =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[2]/div[1]/div[3]/div[1]/div/div/table/tbody/tr[1]/td[7]"));
		    Selectdate.click();
		    System.out.println("Date is Selected");
		    
		      WebElement Gender=driver.findElement(By.xpath("(//select[contains(@id,\"gendar-select-feild\")])[1]"));
		      Select ch=new Select(Gender);
			  ch.selectByIndex(1);
			  Thread.sleep(2000);
			  
			  WebElement enterlocation=driver.findElement(By.xpath("//div[4]//div[2]//div[1]//div[5]//input[1]"));
			  Thread.sleep(2000);
			  enterlocation.click();
			  enterlocation.sendKeys("Mumbai");
			  Thread.sleep(2000);
			  enterlocation.sendKeys(Keys.ARROW_DOWN);
			  enterlocation.sendKeys(Keys.ENTER);
			  
			  
			 WebElement language= driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/a[1]"));
			 Thread.sleep(1000);
			 language.click(); 
			
			 WebElement NextButton=driver.findElement(By.xpath("//div[4]//div[3]//button[1]"));
			 NextButton.click();
		
			 WebElement introduceyourself=driver.findElement(By.xpath("//div[4]//div[2]//textarea[1]"));
			 introduceyourself.sendKeys("I am Teacher");
			
			 WebElement Nextbutton=driver.findElement(By.xpath("//div[4]//div[3]//button[2]"));
			 Nextbutton.click();
			
			 WebElement Suggestion=driver.findElement(By.xpath("//div[4]//div[2]//div[3]//div[1]//a[1]"));
			 Suggestion.click();
			
			 WebElement nextButton=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[3]/button[2]"));
			 nextButton.click();
			
			 WebElement clickonimageicon=driver.findElement(By.xpath("(//input[@type='file' and @name='ai_avatar'])[1]"));
			 String filepath="C:\\DummyImage\\teacher1.jpg";
	    	 Thread.sleep(3000);
	    	 clickonimageicon.sendKeys(filepath);
	    	 Thread.sleep(3000);
	    	 WebElement Saveimage=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]"));
	    	 Saveimage.click();
	    	 
	    	 WebElement tone=driver.findElement(By.xpath("//div[4]//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//input[1]"));
	    	 Thread.sleep(1000);
	    	 tone.click();
	    	 Thread.sleep(3000);
	    	 
	    	 WebElement selectone=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	    	 Thread.sleep(3000);
	    	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	 executor.executeScript("arguments[0].click();", selectone);
	    	 
	    	 
	    	  Thread.sleep(3000);
	    	  WebElement otherclick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[1]/h2"));
	    	  otherclick.click();
	    	  
	    	  WebElement Welcomemessage=driver.findElement(By.xpath("//div[4]//div[2]//div[1]//div[1]//div[2]//div[3]//div[1]//input[1]"));
	    	  Thread.sleep(1000);
	    	  Welcomemessage.click();
	    	  
	    	  WebElement selectradio=driver.findElement(By.xpath("(//input[@type='radio'])[13]"));
	    	  Thread.sleep(3000);
	    	  selectradio.click();
	    	  
	    	  
	    	  WebElement updateprofile=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[2]"));
	    	  Thread.sleep(5000);
	    	  updateprofile.click();
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	 
	    	 
	    	 
			 
			 
			 
		    
		    
		    
		    
		    
		
	}

}
