package autoproschool.testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import autoproschool.uitilityclass.TakeScreenshot;

public class TC02LoginFunctionality extends BaseClass1
{
	
	@Test
	
	public void VeriyingFunctionality() throws IOException, InterruptedException
	{
		
		Thread.sleep(8000);
		String expectedurl="https://proschool.ai/dashboard/home";
		String actualurl=driver.getCurrentUrl();
		System.out.println("actual url:"+ actualurl );
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("test case is passed");
			TakeScreenshot.takeScreenshot(driver, "loginsucessful");
		}
		else
		{
			System.out.println("test case is fail");
			TakeScreenshot.takeScreenshot(driver, "login.failed");
		}
		
		Thread.sleep(5000);
		//Assert.assertEquals(actualurl, expectedurl);
		
	}	
	
		
    }
	
	
	


