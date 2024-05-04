package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.InactivetoActiveMyCoursePS;

public class TC13verifyInactivetoactivecourse extends BaseClass1
{
	
	@Test
	
	public void verifyInactivetoactivecourse()
	{
		InactivetoActiveMyCoursePS inactivecourse=new InactivetoActiveMyCoursePS(driver);
		inactivecourse.InactiveCourseDashboard();
	}

}
