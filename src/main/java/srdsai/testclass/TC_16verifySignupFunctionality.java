package srdsai.testclass;

import org.testng.annotations.Test;

public class TC_16verifySignupFunctionality extends BaseClass3
{
	@Test
	public void verifySignupFunctionality()
	
	{
		String expectedtitle="Revolutionizing learning experiences with innovative features";
		String actualtitle=driver.getTitle();
		
		System.out.println("actualtitle :"+ actualtitle);
		
		if(expectedtitle.equals(actualtitle))
			
		{
			System.out.println("Test is Case is Passed");
		}
		else
		{
			System.out.println("Test is Case is Failed");
		}
		
	}
	
	

}
