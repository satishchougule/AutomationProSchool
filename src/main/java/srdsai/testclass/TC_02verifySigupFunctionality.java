package srdsai.testclass;

import java.sql.Driver;

import org.testng.annotations.Test;

public class TC_02verifySigupFunctionality extends BaseClass1
{
	
	@Test
        public void verifySigupFunctionality()
    {
		
		String expectedurl="https://srds.ai/signup";
		String actualurl=driver.getCurrentUrl();
		
		if(expectedurl.equals(actualurl))
			
			System.out.println("Test case is passed");
		else
			
			System.out.println("Test Case is Failed");
	
	}
	

}
