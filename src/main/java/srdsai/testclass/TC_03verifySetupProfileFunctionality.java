package srdsai.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import srdsai.pom.SrdsSetupProfilePage;

public class TC_03verifySetupProfileFunctionality extends BaseClass1
{
	
	@Test
	public void verifySetupProfileFunctionality() throws InterruptedException
	{
		
		SrdsSetupProfilePage setupprofilepage=new SrdsSetupProfilePage(driver);
		setupprofilepage.Setupprofile();
		
		String expectedurl="https://srds.ai/dashboard/home";
		String actualurl=driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl))
			
			System.out.println("Test case is passed");
		
		else
			
			System.out.println("Test case is Failed");
	
		    Assert.assertEquals(expectedurl, actualurl);
		
	}
	

}
