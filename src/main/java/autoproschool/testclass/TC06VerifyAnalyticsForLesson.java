package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import autoproschool.pom.AnalyticsForLessonPS;

public class TC06VerifyAnalyticsForLesson extends BaseClass1
{
	
	
	@Test
    public void VerifyAnalyticsforLessonFunctionality() throws InterruptedException 
	{
		
		AnalyticsForLessonPS an =new AnalyticsForLessonPS(driver);
		an.ViewCourseM();
		an.clickbuttonmm();
		an.lessonProgressM();
		an.studentnamem();
		
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
	


