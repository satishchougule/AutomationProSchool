package srdsai.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import srdsai.pom.SrdsAnalyticsForLesson;

public class TC_06verifyAnalyticsForLesson extends BaseClass
{
	@Test
	
	public void verifyAnalyticsForLesson() throws InterruptedException
	{
		
		SrdsAnalyticsForLesson analtyticslesson=new SrdsAnalyticsForLesson(driver);
		analtyticslesson.ViewCourseM();
		
		
		String expectedcoursetitle="Revolutionise Learning with ProSchool.ai - AI-Powered Education";
		String acutalCoursetitle=driver.getTitle();
		System.out.println("ActualCouseTitle"+acutalCoursetitle);
		
		if(expectedcoursetitle.equals(acutalCoursetitle))
		{
			System.out.println("Test Case is passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		
		Assert.assertEquals(acutalCoursetitle, expectedcoursetitle);
}
		
		
	}


