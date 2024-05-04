package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsDeleteCourseTeacherSide;

public class TC_12verfiyDeleteCourseTeacherSide extends BaseClass
{
	@Test
	
	public void verfiyDeleteCourseTeacherSide() throws InterruptedException
	{
		
	
	SrdsDeleteCourseTeacherSide deleteCourse=new SrdsDeleteCourseTeacherSide(driver);
	deleteCourse.DeleteCourseM();
	
	
		
		
		
	}
			
	

}
