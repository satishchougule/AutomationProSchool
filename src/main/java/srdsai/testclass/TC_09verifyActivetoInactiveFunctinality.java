package srdsai.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.ActivetoInactiveMyCoursePS;

public class TC_09verifyActivetoInactiveFunctinality extends BaseClass
{
	
	@Test
	public void verifyActivetoInactiveFunctinality() throws InterruptedException
	{
		
		ActivetoInactiveMyCoursePS activetoinactive=new ActivetoInactiveMyCoursePS(driver);
		activetoinactive.ActivecourseDashboard();
		
	}
	

}
