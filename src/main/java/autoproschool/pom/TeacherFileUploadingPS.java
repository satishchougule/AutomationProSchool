package autoproschool.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeacherFileUploadingPS 
{
	
	WebDriver driver;
	
	public TeacherFileUploadingPS (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	     
  	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
  	private WebElement viewcourseFileupload;
  	
  	public void viewcourseFileuploadM() throws InterruptedException
  	{
  		Thread.sleep(1000);
  		viewcourseFileupload.click();
 		Thread.sleep(1000);
 		viewcourseFileupload.sendKeys("MYSQL");
 		Thread.sleep(2000);
 		viewcourseFileupload.sendKeys(Keys.ARROW_DOWN);
 		viewcourseFileupload.sendKeys(Keys.ENTER);
 		System.out.println("click1");
  	}
  	
  	@FindBy(xpath="//button[normalize-space()='Add Lesson']")
  	private WebElement addlessonfileupload;
  	
  	public void addlessonfileuploadM()
  	{
  		addlessonfileupload.click();
  		System.out.println("clcik2");
  	}
     
  	@FindBy(xpath="/html/body/div/div/section/div/div/div/div[1]/div[2]/div[1]/div/div/div/input")
  	private WebElement lessonnamefileupload;
  	
  	public void lessonnamefileuploadM() throws InterruptedException
  	
  	{
  		 Thread.sleep(1000);
  		 lessonnamefileupload.click();
  		 lessonnamefileupload.sendKeys("MYSQL");
  		 System.out.println("click3");
  		 Thread.sleep(3000);
  		

  		 
  	}
  	


@FindBy(xpath="//*[name()='path' and contains(@d,'M16.5 6v11')]")

private WebElement uploadicon;

public void uploadiconM() throws InterruptedException, AWTException

{

Thread.sleep(3000);

JavascriptExecutor js = (JavascriptExecutor) driver;

js.executeScript("window.scrollBy(0, 500);");

Thread.sleep(2000);

uploadicon.click();

Robot rb=new Robot();

rb.delay(2000);

StringSelection ss=new StringSelection("C:\\DummyImage\\SQL.pdf");

Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);



rb.keyPress(KeyEvent.VK_CONTROL);

rb.keyPress(KeyEvent.VK_V);

rb.keyRelease(KeyEvent.VK_CONTROL);

rb.keyRelease(KeyEvent.VK_V);



rb.keyPress(KeyEvent.VK_ENTER);

rb.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);



}
  	

    @FindBy(xpath="//textarea[@id='lesson_promote_flexible']")
  	private WebElement yourprompts;
  	
  	public void yourpromptsm() throws InterruptedException
  	{
  		Thread.sleep(2000);
  		yourprompts.sendKeys("generate the lesson on SQL");
  	}
  	
  	@FindBy(xpath="//button[@class=\"go_cls_btn\"]")
  	private WebElement SendIconbutton;
  	
  	public void SendIconbuttonM() throws InterruptedException 
  	{

  		Thread.sleep(3000);
  		
	    JavascriptExecutor js = (JavascriptExecutor) driver; 
  		
  	    js.executeScript("window.scrollBy(0, 500);");
  		
  		SendIconbutton.click();
		Thread.sleep(12000);
		

		
	}
  	
  	@FindBy(xpath="(//i[@class='fa-solid fa-arrow-right'])[1]")
  	private WebElement lessonclickbutton;
  	
  	
  	      public void LessonclickbuttonM() throws InterruptedException
  	{  
  	    	                                                                  
  	       Thread.sleep(3000);
  	  		
  		   JavascriptExecutor js = (JavascriptExecutor) driver; 
  	  		
  	  	   js.executeScript("window.scrollBy(0, 500);");
  	    	  
  	       Thread.sleep(20000);
  		   lessonclickbutton.click();
  		   System.out.println("click4");
  		      
  		   WebElement clickonProceed=driver.findElement(By.xpath("//button[contains(text(),'Proceed')]"));
  		   clickonProceed.click();
  		      
           Thread.sleep(3000);
  	  		
  		   JavascriptExecutor js1 = (JavascriptExecutor) driver; 
  	  		
  	  	   js1.executeScript("window.scrollBy(500, 0);");
  	  	    
  	  	   WebElement clickonassignment= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]"));
  	  	   clickonassignment.click();
  	  	   System.out.println("click5");
  	  	   
  	  	   
  	  	  Thread.sleep(3000);
	  		
		  JavascriptExecutor js2 = (JavascriptExecutor) driver; 
	  		
	  	  js2.executeScript("window.scrollBy(0, 500);");
	  	  
	  	  Thread.sleep(1000);
	  	  System.out.println("click6");
	  	    
	  	  WebElement assignmentName=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	  	  assignmentName.click();
	  	  assignmentName.sendKeys("My SQL Server");
	  	   
	  	  WebElement clickonpulsicon=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
	  	  clickonpulsicon.click();
  		      
	  	  WebElement againclickonpulsicon=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]"));
	  	  clickonpulsicon.click();
 		        
	  	  WebElement clickonExpirydate =driver.findElement(By.xpath("//div[@class='create-Assignment-container-popup-folder2']//div[2]//div[1]//div[1]//input[1]"));
	  	  clickonExpirydate.click();
	  	  
	  	  WebElement clickondate= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]"));
	  	  clickondate.click();
	  	 
	  	 WebElement chooseassigmenttype=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]"));
	  	 chooseassigmenttype.click();
	  	 Thread.sleep(1000);
	  	 
	  	  WebElement multiplechoicequestion =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/ul[1]/li[1]"));
	  	  multiplechoicequestion.click();
	  	  
//	  	 chooseassigmenttype.sendKeys("Multiple Choice Questions");
//	  	 chooseassigmenttype.sendKeys(Keys.ARROW_DOWN);
//	  	 Thread.sleep(1000);
//	  	 chooseassigmenttype.sendKeys(Keys.ENTER);
//	  	 System.out.println("click6");
	  	 
	  	 WebElement clickonsendbutton= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[2]/div[1]/div[1]/button[2]/img[1]"));
	  	 clickonsendbutton.click();
	  	 System.out.println("click7");
	  	 
	  	 Thread.sleep(42000);
	  	 
	  	 WebElement assignmentclickbutton= driver.findElement(By.xpath("(//i[@class='fa-solid fa-arrow-right'])[2]"));
	  	 Thread.sleep(5000);
	  	 JavascriptExecutor js3 = (JavascriptExecutor) driver; 
	  		
 	  	 js3.executeScript("window.scrollBy(0, 500);");
	  	 assignmentclickbutton.click();
	  	 
	  	 Thread.sleep(2000);
	  	 
	  	 WebElement clickonassignmentsave=driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	  	 clickonassignmentsave.click();
	  	 
	  	 
	  	  Thread.sleep(3000);
  		
		  JavascriptExecutor js4 = (JavascriptExecutor) driver; 
	  		
	  	  js4.executeScript("window.scrollBy(500, 0);");
	  	  
	  	  Thread.sleep(1000);
	  	  //create rubric
	  	  WebElement clickonRubric=driver.findElement(By.xpath("(//button[contains(@class,\" completed\")])[3]"));
	  	  Thread.sleep(1000);
	  	  clickonRubric.click();
	  	  
	  	  WebElement promptforrubric=driver.findElement(By.xpath("//textarea[contains(@id,\"lesson_promote_flexible\")]"));
	  	  promptforrubric.click();
	  	   
	  	  Thread.sleep(1000);
	  	  promptforrubric.sendKeys("Create rubric based on assignment");
	  	  
	  	  Thread.sleep(1000);
	  	 
	  	  WebElement clickonrubricsendbutton=driver.findElement(By.xpath("//button[contains(@class,\"go_cls_btn\")]"));
	  	  clickonrubricsendbutton.click();
	  	  //rubric send to worboard
	  	  Thread.sleep(40000);
	  	                                            // System.out.println("click8");
	  	  
	  	 
	  	  
	  	 WebElement sendtorubric=driver.findElement(By.xpath("(//i[contains(@class,'fa-solid fa-arrow-right')])[3]"));
	  	 Thread.sleep(5000);
         JavascriptExecutor js5 = (JavascriptExecutor) driver; 
	     js5.executeScript("window.scrollBy(0, 500);");
	  	 sendtorubric.click();
	  	 
	  	 //click on save on rubric
	  	 
	  	WebElement rubricsavebutton= driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	  	Thread.sleep(1000);
	  	rubricsavebutton.click();
	  	 
	  	//click on Backcoursebutton
	  	
	  	WebElement Backcoursebutton=driver.findElement(By.xpath("//button[contains(text(),'Back to Course')]"));
	  	Backcoursebutton.click();
	  	  
	  	  
	  	  
	  	  
  	}	 
	  	 
	  	 
}
  	
  	


  	

