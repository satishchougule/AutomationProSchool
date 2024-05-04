package srdsai.testclass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import srdsai.pom.SrdsHomePage;
import srdsai.pom.SrdsLoginPage;
import srdsai.pom.SrdsLogoutFunctionality;

public class BaseClass 
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
	driver.get("https://srds.ai/");
    log.info("URL opened");
	String currenturl=driver.getCurrentUrl();
	System.out.println("actual currenturl:"+ currenturl);
	
	SrdsHomePage homepage =new SrdsHomePage(driver);
	homepage.Loginpagem();
	
	SrdsLoginPage loginpage=new SrdsLoginPage(driver);
	loginpage.TeacherButton();
	
	SrdsLogoutFunctionality logoutpage=new SrdsLogoutFunctionality(driver);
//	logoutpage.dropdownlogoutm();
//	logoutpage.logoutm();
	

}}
