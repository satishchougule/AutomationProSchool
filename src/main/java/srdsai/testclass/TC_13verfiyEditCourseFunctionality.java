package srdsai.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import srdsai.pom.SrdsEditCourseTeacherSide;

public class TC_13verfiyEditCourseFunctionality extends BaseClass
{
	
	@Test
	public void verifyEditCourseFunctionality() throws InterruptedException
	{
		
		SrdsEditCourseTeacherSide editcourse=new SrdsEditCourseTeacherSide(driver);
		editcourse.EditCourse();
		
	}
	
	}
