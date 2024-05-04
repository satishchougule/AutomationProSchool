package autoproschool.testclass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import autoproschool.pom.HomePagePS;
import autoproschool.pom.StudentSignUpPagePS;

public class BaseClass2 
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
     Thread.sleep(1000);
     
     //
     
     StudentSignUpPagePS studentsingnuppage=new StudentSignUpPagePS(driver);
     studentsingnuppage.Studentbutton();
     

}}
