package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import autoproschool.pom.SignupPagePS;
import autoproschool.pom.SetupProfilePS;

public class TC02SignupFunctionality extends BaseClass 

{
	  
	@Test
	public void Signupfuctionality() throws InterruptedException 
	{
		Thread.sleep(8000);
		String expectedurl="https://proschool.ai/dashboard/home";
		String actualurl=driver.getCurrentUrl();
		System.out.println("actual url:"+ actualurl );
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
		Thread.sleep(5000);
		//Assert.assertEquals(actualurl, expectedurl);
		
	}	
	
	}


