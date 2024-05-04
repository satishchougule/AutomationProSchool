package autoproschool.testclass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import autoproschool.pom.HomePagePS;

public class TC01HomepageFunctionlity extends BaseClass
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://mycro.news/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		HomePagePS hpage = new HomePagePS(driver);
		Thread.sleep(1000);
	//	hpage.signbutton();
		Thread.sleep(2000);
		
		String expectedtitle="ProSchool";
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		
		{
			System.out.println("Test case is passed");
		}
		
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		System.out.println("end of program");
		
		driver.quit();
		System.out.println("browser is closed");
		
		
		
	}

}
