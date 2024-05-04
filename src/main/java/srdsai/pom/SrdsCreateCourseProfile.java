package srdsai.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsCreateCourseProfile 
{
	WebDriver driver;
	
	public SrdsCreateCourseProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 @FindBy(xpath="//p[text()='Create Course']")
     private WebElement createcousebutton;
     
     public void createcousebutton() throws InterruptedException
     {	
     	Thread.sleep(1500);
     	createcousebutton.click();
     
     }
     @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
     private WebElement coursename;
     
     public void coursename()
     {
     	coursename.sendKeys("SQL");
     }
     
     @FindBy(xpath="//input[contains(@id,'subjects-autocomplete')]")
     private WebElement subject;
    
   public void selectsub() throws InterruptedException 
     {

          Thread.sleep(2000);
		  subject.click();

          subject.sendKeys("English");      		  
          Thread.sleep(2000);
		  subject.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(3000);
		  subject.sendKeys(Keys.ENTER);
		  Thread.sleep(1000);
     
 
  }
     
    
     
     @FindBy(xpath="//input[@id='from-grade-autocomplete']") 
     private WebElement level;
     
     public void selectleve() throws InterruptedException
     {
     	
     	Thread.sleep(1000);
     	level.click();
     	level.sendKeys(Keys.ARROW_DOWN);
     	Thread.sleep(3000);
     	level.sendKeys(Keys.ENTER);
     	Thread.sleep(1000);
     	
     	
     	
//     	level.click();
//     	Thread.sleep(1000);
//     	level.sendKeys("Grade4");
//     	Thread.sleep(1000);
    }
    
//     @FindBy(xpath="//li[@id='from-grade-autocomplete-option-4']")
//     private WebElement selectlevel;
//     
//     public void selectlevelm() throws InterruptedException
//     {
//     	Thread.sleep(1000);
//     	selectlevel.click();
//     	
//     }

     
     
     
     @FindBy(xpath="//input[@id='to-grade-autocomplete']")
     private WebElement Tolevel;
     
     public void selecttoleve() throws InterruptedException 
     {
     	
     	
     	Thread.sleep(1000);
     	Tolevel.click();
     	Tolevel.sendKeys(Keys.ARROW_DOWN);
     	Thread.sleep(3000);
     	Tolevel.sendKeys(Keys.ENTER);
     	Thread.sleep(1000);
     	
//     	Tolevel.click();
//     	Thread.sleep(1000);
//     	Tolevel.sendKeys("Grade5");
//     	Thread.sleep(1000);
     
           }
     
//     @FindBy(xpath="//li[@id='to-grade-autocomplete-option-3']")
//     private WebElement selecttolevel1;
//     
//     public void selecttolevem() throws InterruptedException
//     {
//     	selecttolevel1.click();
//     	Thread.sleep(1000);
//     				
//     }
     
//     @FindBy(xpath="//html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/span[1]")
//     private WebElement clickpurposeused;
//     
//     
//     public void clickpurposeusedm() throws InterruptedException
//     {  
//     	clickpurposeused.click();
//     }
//   
     
       @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
       private WebElement coursedatestart;
     
        public void Coursesd() throws InterruptedException
     {
     	coursedatestart.click();
     	
     	Thread.sleep(3000);
  	    WebElement clickondate =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/button[3]"));
  	    clickondate.click();
          	
}
      
      @FindBy(xpath="//textarea[@id=\"create-course-description\"]")
      private WebElement Cousedecri;
      
      public void Coursedecri() throws InterruptedException 
      {
     	 
          Cousedecri.sendKeys("proschool is one of the best application");
          Thread.sleep(5000);
      }
      
      @FindBy(xpath="//span[text()='Enhance Course Description']")
      private WebElement ecdhyperlink;
      
      public void ecdhyperlink() throws InterruptedException
      {
     	 ecdhyperlink.click();
     	 Thread.sleep(6000);
      }

//       @FindBy(xpath="//label[normalize-space()='Upload Image']")
//       private WebElement uploadimage;
//       
//       public void uploadimage()
//       {
//              
//     	     uploadimage.click();
//              uploadimage.sendKeys("C:\\Users\\Admin\\Desktop\\Untitled.png");
//       }
//       
       
       @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/button[1]")
       private WebElement generateusingai;
       
       
       
       public void generateusingaiM() throws InterruptedException
       {
       	generateusingai.click();
       	Thread.sleep(20000);
       }             

       
       
     
      @FindBy(xpath="(//button[@type='submit'][normalize-space()='Create Course'])[1]")
       private WebElement CreatCButton;
      
      public void CreatCButton() throws InterruptedException 
      {
     	 Thread.sleep(3000);
     	 CreatCButton.click();
     	 Thread.sleep(2000);
     	 
      }
	
	
	

}
