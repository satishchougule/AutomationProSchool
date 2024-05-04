package srdsai.testclass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import autoproschool.pom.HomePagePS;
import autoproschool.pom.StudentLoginPagePS;

public class BaseClass2 
{
	
	WebDriver driver;
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
	driver.get("https://srds.ai");
    log.info("URL opened");
	String currenturl=driver.getCurrentUrl();
	System.out.println("actual currenturl:"+ currenturl);
	
	
	 HomePagePS hp=new HomePagePS(driver);
	     hp.Loginbutton();
	     Thread.sleep(1000);
	  
	    StudentLoginPagePS lp =new StudentLoginPagePS(driver);
	    lp.Studenbutton();
	    System.out.println("click on Student");
	    lp.email();
	    System.out.println("pass the vaild email address");
	    lp.passoword();
	    System.out.println("pass the vaildpassword");
	    lp.login();

	}}



