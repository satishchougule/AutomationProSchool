package srdsai.testclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import autoproschool.uitilityclass.TakeScreenshot;

public class TC_01verifyloginfunctionality extends BaseClass
{
	@Test
	
	public void verifyloginfunctionality() throws IOException
	{
		
		String expectedurl="https://srds.ai/login";
		String actualurl=driver.getCurrentUrl();
		System.out.println( actualurl );
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("Test Case is Pass");
			TakeScreenshot.takeScreenshot(driver, "loginsucessful");;
		}
		else
		{
			System.out.println("Test Case is Failed");
			TakeScreenshot.takeScreenshot(driver, "Failed.to.login");
		}
	}
	
	
//	@AfterMethod
//	public void teardown() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.quit();
//	}
//	

}
