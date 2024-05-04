package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import autoproschool.pom.AnalyticsForAssignmentPS;

public class TC07VerifyAnalyticsForAssignment extends BaseClass1
{
	
	
	@Test
	public void VerifyAnalyticsForAssignment() throws InterruptedException 
	{
		
		AnalyticsForAssignmentPS viewanalytics=new AnalyticsForAssignmentPS(driver);
		viewanalytics.viewcoursenm();
		viewanalytics.clickbuttonmm();
		viewanalytics.AssignmentProM();
		viewanalytics.viewanalyticsm();
		
		
		
	}

}
