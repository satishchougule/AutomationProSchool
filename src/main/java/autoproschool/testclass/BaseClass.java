package autoproschool.testclass;



import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import autoproschool.pom.AnalyticsForLessonPS;
import autoproschool.pom.HomePagePS;
import autoproschool.pom.LoginPagePS;
import autoproschool.pom.LogoutPagePS;
import autoproschool.pom.SignupPagePS;
import autoproschool.pom.SetupProfilePS;


public class BaseClass 
{
	WebDriver driver;
	//LoginPagePS login;
	Logger log;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	log=Logger.getLogger("application.log");
	PropertyConfigurator.configure("log4j.properties");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	log.info("apply wait");
	driver.manage().window().maximize();
	log.info("maximize the window");
	driver.get("https://proschool.ai/");
    log.info("URL opened");
	String currenturl=driver.getCurrentUrl();
	System.out.println("actual currenturl:"+ currenturl);
	
	
	
    //Homepage Functionality
	
	 HomePagePS hp=new HomePagePS(driver);
     hp.signbutton();
    // hp.Loginbutton();
     Thread.sleep(1000);
  
    SignupPagePS lp=new SignupPagePS(driver);
    lp.Teacherbutton();
    System.out.println("click on Teacherbutton");
    lp.email();
    System.out.println("pass the vaild email address");
    lp.passoword();
    System.out.println("pass the vaildpassword");
    //lp.login();
    lp.Register();
    lp.confirmatioregisterm();
    lp.Confirmbutton();
   
   
//	lp.closebutton();
//	lp.closepopup();
//	Thread.sleep(2000);

//  System.out.println("click on register button");
//	lp.Confirmbutton();
//  System.out.println("click on Confirmation button");
  
 
//	LogoutPagePS logoutpage=new LogoutPagePS(driver);
//	logoutpage.dropdownlogoutm();
//	logoutpage.logoutm();

	}
	
	
//   @AfterMethod()
//   public void teardown()
// {
//	 driver.quit();
// }

    
 }
	
	

	
	
	
	
		
	
	


