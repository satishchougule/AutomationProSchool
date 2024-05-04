package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.StudentViewResultPS;

public class TC18verifyStudentViewResultFunctionality extends BaseClass4
{
	
	@Test
	public void verifyStudentViewResultFunctionality() throws InterruptedException 
	{
		
		StudentViewResultPS studentviewresult=new StudentViewResultPS(driver);
		studentviewresult.searchforsubjectm();

	}

}
