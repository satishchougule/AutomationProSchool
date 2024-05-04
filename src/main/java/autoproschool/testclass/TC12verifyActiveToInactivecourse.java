package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.ActivetoInactiveMyCoursePS;

public class TC12verifyActiveToInactivecourse extends BaseClass1
{
	
	@Test
	public void verifyActiveToInactivecourse() throws InterruptedException
	{
		
		ActivetoInactiveMyCoursePS activetoinactive=new ActivetoInactiveMyCoursePS(driver);
		activetoinactive.ActivecourseDashboard();
		
		
	}

}
