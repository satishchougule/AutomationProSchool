package srdsai.testclass;

import org.testng.annotations.Test;

public class TC_15verifyStudentloginFunctionality extends BaseClass2
{
	
	@Test
	public void verifyStudentloginFunctionality()
	{
		String expectedurl="https://srds.ai/dashboard/home";
		String actualurl=driver.getCurrentUrl();
		
		 System.out.println("actual url:"+ actualurl);
		 
		 if(expectedurl.equals(actualurl))
		 {
			 System.out.println("Test Case is Passed");
		 }
		 else
			 
		 {
			 System.out.println("Test is Case Is Failed");
		 }
			 
		 
		
	}

	

}
