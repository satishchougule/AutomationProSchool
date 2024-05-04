package autoproschool.testclass;

import org.testng.annotations.Test;

public class TC16verifyStudentSignupFunctinality extends BaseClass2

{
	@Test
	public void verifyStudentSignupFunctinality()
	{
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Revolutionise Learning with ProSchool.ai - AI-Powered Education";
		
        System.out.println("actual title:"+ actualtitle );
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is fail");
		}
		
	}
	
	
	}
