package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.StudentCreateProfilePS;

public class TC17verifyStudentCreateProfileFunctionality extends BaseClass2
{
	@Test
	public void verifyStudentCreateProfileFunctionality() throws InterruptedException
	{
		
		StudentCreateProfilePS StudentCreateprofile=new StudentCreateProfilePS(driver);
		StudentCreateprofile.CreateProfile();
	}
}