package autoproschool.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TeacherProfileEditingPS 
{
	
	public WebDriver driver;
	
	public TeacherProfileEditingPS (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[normalize-space()='Settings']")
	private WebElement settings;
	
	public void settingsm() 
	{
		settings.click();
	}
	
//	@FindBy(xpath="//div[@id='demo-customized-button']//div//*[name()='svg']")
//	private WebElement drp;
//	
//	public void dropM() 
//	{
//		drp.click();
//		
//	}
//	
//	@FindBy(xpath="//p[normalize-space()='Profile']")
//	private WebElement profilee;
//	
//	public void profileem()
//	{
//		profilee.click();
//	}
	
	@FindBy(xpath="//button[contains(@class,\"edit_btn_set\")]")
	 WebElement Edits;
	
	public void Editm() 
	{
		
		Edits.click();
		Assert.assertTrue(Edits.isDisplayed(), "Edit option is not displayed on the page");
	}
	
	@FindBy(xpath="//textarea[@class='introduce-yourself-text']") ///html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/textarea[1]
	private WebElement aboutteacher;
	
	 public void aboutteacherm()
	{
		 aboutteacher.sendKeys("I am Tester");
	}
	
//	@FindBy(xpath="//input[@placeholder='linkedin']")
//	private WebElement linkedins;
//	
//	public void linkedinsm()
//	{
//		linkedins.click();
//	}
//	
//	@FindBy(xpath="//button[normalize-space()='Add Subject']")
//	private WebElement addsubjects;
//	
//	public void addsubjectsm() 
//	{
//		 addsubjects.click();
//		
//	}
//	
//	@FindBy(xpath="//a[normalize-space()='english']")
//	private WebElement suggests;
//	
//	public void  suggestsm()
//	{
//		suggests.click();
//	}
//	
//	@FindBy(xpath="//button[normalize-space()='Submit']")
//	private WebElement SubmitS;
//	
//	public void Submitsm() 
//	{
//		SubmitS.click();
//		
//	}
//	
//	@FindBy(xpath="//select[@name='title']")
//	private WebElement titleS;
//	
//	public void titleSm() throws InterruptedException 
//	{    
//        Thread.sleep(1000);
//		Select ts=new Select(titleS);
//		ts.deselectByVisibleText("Mr.");
//	}
//	
//	@FindBy(xpath="//input[@id='teacher-create-profile-input']")
//	private WebElement snames;
//	
//	public void settingname() 
//	{
//		snames.sendKeys("satish18");
//		
//	}
//	
////	@FindBy(xpath="")
////	private WebElement settingdateofbrith;
//	
//	@FindBy(xpath="//select[@name='gender']")
//	private WebElement settinggender;
//	
//	public void settinggenderm()
//	{
//		Select sg=new Select(settinggender);
//	    sg.selectByVisibleText("Male");
//	}
//	
//	@FindBy(xpath="//input[@placeholder='Enter a location']")
//	private WebElement settingenterlocation;
//	
//	public void settingenterlocationm()
//	{
//		settingenterlocation.sendKeys("Mumbai,Maharashtra,india");
//	}
	 
	 
	 @FindBy(xpath="//button[contains(@class,'save_btn_set')]")
	 private WebElement savebutton;
	 
	 public void Savebutton() throws InterruptedException 
	 {
		 Thread.sleep(1000);
		 savebutton.click();
	 }
    

}
