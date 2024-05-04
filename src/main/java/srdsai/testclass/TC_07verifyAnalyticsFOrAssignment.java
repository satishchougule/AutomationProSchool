package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsAnalyticsForAssignment;

public class TC_07verifyAnalyticsFOrAssignment extends BaseClass
{
	
	
	@Test
	
	public void verifyAnalyticsFOrAssignment() throws InterruptedException
	{
		SrdsAnalyticsForAssignment viewanalytics=new SrdsAnalyticsForAssignment(driver);
		viewanalytics.viewcoursenm();
		
	}

}
