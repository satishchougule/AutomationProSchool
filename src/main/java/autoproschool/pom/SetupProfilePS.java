package autoproschool.pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupProfilePS 

{
	private static final Duration TIMEOUT_SECONDS = null;
	WebDriver driver;
	@FindBy(xpath="//button[contains(@class,\"begin-journey-btn\")]")
	private WebElement Setupprofilebutton;
	public void Setupprofile()
	{
		Setupprofilebutton.click();
	}
	
	@FindBy(xpath="//div[4]//div[2]//div[1]//div[1]//div[1]//div[2]//select[1]")
    private WebElement Titledropdown;                                                    ////div[4]//div[2]//div[1]//div[1]//div[1]//div[2]//select[1]
	public void TitleSP() throws InterruptedException 
	{    
		Thread.sleep(1000);
		Select Td=new Select(Titledropdown);
		Td.selectByVisibleText("Mr.");
	}
	
	@FindBy(xpath="(//input[contains(@id,\"teacher-create-profile-input\")])[1]")
	private WebElement FullName;
	public void FullName()
	{
	    FullName.sendKeys("Satish18");
	}
 
//Calender Actions	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement inputField ;
	public void calender() throws InterruptedException
	{  
		Thread.sleep(3000);
		inputField .click();
	    Thread.sleep(3000);
	   // WebElement clickonmonth =driver.findElement(By.xpath("(//th[@class='rdtSwitch'])[3]"));
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
	    
	}
	               
	  @FindBy(xpath="(//select[contains(@id,\"gendar-select-feild\")])[1]")
	  private WebElement ChooseGen;
	  public void ChooseGender() throws InterruptedException
	  {
		  Select ch=new Select(ChooseGen);
		  ch.selectByIndex(1);
		  Thread.sleep(2000);
	  }
	  
	  @FindBy(xpath="//div[4]//div[2]//div[1]//div[5]//input[1]")
	  private WebElement Loaction;
	  
	  public void Enterloaction() throws InterruptedException {
		  Thread.sleep(2000);
		  Loaction.click();
		  Loaction.sendKeys("Mumbai");
		  Thread.sleep(2000);
		  Loaction.sendKeys(Keys.ARROW_DOWN);
		  Loaction.sendKeys(Keys.ENTER);
	  }
	  
	  @FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/a[1]")
	  private WebElement Languages;
	  
	  public void Sellanguages() throws InterruptedException
	  {   
		  Thread.sleep(1000);
		  Languages.click();
	  }
	     
	      @FindBy(xpath="//div[4]//div[3]//button[1]")
	      private WebElement NextButton;
	      
	      public void NextB() 
	      {
	    	  NextButton.click();
	      }
	      
	      @FindBy(xpath="//div[4]//div[2]//textarea[1]")
	      private WebElement indroduceYourself;
	      
	      public void indrourself() 
	      {
	    	  indroduceYourself.sendKeys("automation test engineer");
	    	  
	      }
	      
	      @FindBy(xpath="//div[4]//div[3]//button[2]")
	      private WebElement Nextbutton1;
	      
	         public void NextB1() throws InterruptedException
	      {
	    	  Nextbutton1.click();
	          Thread.sleep(1000);
	      }

	         
         //Select English Subject
	         
	      @FindBy(xpath="//div[4]//div[2]//div[3]//div[1]//a[1]")
	      private WebElement Sugesstion;
	      
	      public void SuggestionM() throws InterruptedException
	      {
	    	   
	    	  Sugesstion.click();
	      }
        //Click on Next Button
	     
	      
	      @FindBy(xpath="//div[4]//div[3]//button[2]")
	      private WebElement nextbutton2;
	      
	      public void nextbuttonM() throws InterruptedException 
	      {
	    	  
	    	  nextbutton2.click();
	      }
	      
	     
	      //Image icon action.
	    
	     
	      @FindBy(xpath="(//input[@type='file' and @name='ai_avatar'])[1]")
	      private WebElement Imageicon;
	      
	      public void imageiconmethod() throws InterruptedException
	      {   
	    	 String filepath="C:\\DummyImage\\teacher1.jpg";
	    	 Thread.sleep(3000);
	    	 Imageicon.sendKeys(filepath);
	    	 Thread.sleep(3000);
	    	 WebElement Saveimage=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]"));
	    	 Saveimage.click();
	      }
	      
	      
	     
	      @FindBy(xpath="//div[4]//div[2]//div[1]//div[1]//div[2]//div[2]//div[1]//input[1]")
	      private WebElement tone;
	      
	      public void tonem() throws InterruptedException 
	      {
	    	  Thread.sleep(1000);
	    	  tone.click();
	    	  Thread.sleep(3000);
	      	      }
	      
	      @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	     
	      private WebElement selecttone;
	      
	      public void selecttonem() throws InterruptedException {
	    	  
	    	  Thread.sleep(3000);
	    	  JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	  executor.executeScript("arguments[0].click();", selecttone);
	    	  
	    	  Thread.sleep(3000);
	    	  WebElement otherclick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div[4]/div[1]/h2"));
	    	  otherclick.click(); 	  
	      }
	      
	      
//Select action
	      
	      @FindBy(xpath="//div[4]//div[2]//div[1]//div[1]//div[2]//div[3]//div[1]//input[1]")
	      private WebElement Welcomemsg;
	      
	      public void ClickonWelcomemessage() throws InterruptedException
	      {
	    	  
	    	  Thread.sleep(1000);
	    	  Welcomemsg.click();  
	      }
	      
//Select Radio Button frommoption	      


		@FindBy(xpath="(//input[@type='radio'])[13]")


		private WebElement Selectradio;

public void SelectRadioOption() throws InterruptedException
{
	  Thread.sleep(3000);
	  Selectradio.click();    	  
	
}
	      
	      
	      
	      
//Click on Update Profile >>
	      @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[2]")
	      private WebElement updateprofileB;
	      
	      public void updateprofileB() throws InterruptedException
	      {
	    	  Thread.sleep(5000);
	    	  updateprofileB.click();
	    	 // Thread.sleep(7000);
	      }
	      
	      
//Pagefactory>>	      
	      public  SetupProfilePS (WebDriver driver)
	      {
	    	     this.driver=driver;
	    		 PageFactory.initElements(driver, this);
	    		 
	      }
	      
	      
}


