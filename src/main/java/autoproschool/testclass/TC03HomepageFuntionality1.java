package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC03HomepageFuntionality1 extends BaseClass
{
	
	  WebDriver driver;
		@Test
		public void Loginfuctionality() 
		{
			String expectedtitle="https://mycro.news/";
			String actualtitle=driver.getCurrentUrl();
			System.out.println("actualtitle");
			
			if(expectedtitle.equals(actualtitle))
			{
				System.out.println("test case is passed");
			}
			else
			{
				System.out.println("test case is failed");
			}
			
			Assert.assertEquals(actualtitle, expectedtitle);
		}
		
		@AfterMethod
		public void endMethod()
		{
			
			driver.quit();

}
}