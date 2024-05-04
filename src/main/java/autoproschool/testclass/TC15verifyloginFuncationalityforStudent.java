package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.StudentLoginPagePS;

public class TC15verifyloginFuncationalityforStudent extends BaseClass1
{
	
	
	
	@Test
	public void verifyloginFuncationalityforStudent()
	{
		
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
             
		
	}
	

}
