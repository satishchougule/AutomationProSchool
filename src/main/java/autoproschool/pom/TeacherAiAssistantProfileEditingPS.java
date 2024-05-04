 package autoproschool.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TeacherAiAssistantProfileEditingPS 
{
	    WebDriver driver;
	    
	    public TeacherAiAssistantProfileEditingPS (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	 
	    @FindBy(xpath="//a[normalize-space()='Settings']")
		private WebElement settingsai;
		
		public void settingsmai() throws InterruptedException 
		{
			settingsai.click();
			Thread.sleep(1000);
			WebElement aissistant=driver.findElement(By.xpath("//a[text()='AI Assistants']"));
			aissistant.click();
			Thread.sleep(1000);
			
		}
		
		@FindBy(xpath="//button[normalize-space()='Edit']")
		private  WebElement Editai;
		
		
		public void Editm() throws InterruptedException 
		{
			Thread.sleep(1000);
			Editai.click();
			Thread.sleep(1000);
			System.out.println("click on edit");
			
			//Assert.assertTrue(Editai.isDisplayed(), "Edit option is not displayed on the page");
		
		}
		
	
	@FindBy(xpath="//input[@id='choos-profile-image']")
	 private WebElement imageuploading;
	
//	public void imageuploadingm() throws InterruptedException
//	{
////		Thread.sleep(1000);
////		imageuploading.click();
////		System.out.println("click on imageupload");
////	//	imageuploading.sendKeys("C:\\sers\\Admin\\Downloads\\teacher1.jpg");
////	
//		
//		
//	 String filepath="C:\\DummyImage\\teacher1.jpg";
//   	 Thread.sleep(3000);
//   	 imageuploading.sendKeys(filepath);
//   	 Thread.sleep(3000);
//   	 WebElement Saveimage=driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/a[2]/span"));
//   	 Saveimage.click();
//   	 System.out.println("click on save button");
//		
//		
//		}
//	
	
	
	
//	@FindBy(xpath="//input[@placeholder='eg: Mr Smith AI']")
//	private WebElement aiassitantname;
//	
//	public void aiassitantnamem() 
//	{
//		aiassitantname.sendKeys("Mr.satish.ai");
//		System.out.println("click on name");
//	}
	
     @FindBy(xpath="//input[@placeholder='Select response']")
     private WebElement aiassitanttone;
     
     public void aiassitanttonem()
     {
    	 aiassitanttone.click();
    	 System.out.println("clcik on tone");
     }
     
//     @FindBy(xpath="//input[@id='1']")
//     private WebElement aiassitanttonecheckbox;
//     
//     public void  aiassitanttonecheckboxm()
//     {
//    	 aiassitanttonecheckbox.click();
//     }
     
//     @FindBy(xpath="//input[@placeholder='E.g. Hi! This is Ms. Synthia’s assistant, how may I help you?']")
//     private WebElement customizewelcomemessage;
//     
//     public void customizewelcomemessagem() 
//     {
//    	 customizewelcomemessage.click();
//     }
     
     @FindBy(xpath="//button[normalize-space()='Save']")
     private WebElement savebutton;
     
     public void saveaim1()
     {
    	 savebutton.click();
    	 Assert.assertTrue(savebutton.isDisplayed(), "The save button should be displayed.");
    	 Assert.assertTrue(savebutton.isEnabled(), "The save button should be enabled.");
     }
     
}
