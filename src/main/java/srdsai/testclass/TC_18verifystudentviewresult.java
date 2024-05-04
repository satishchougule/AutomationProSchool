package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsStudentViewResult;

public class TC_18verifystudentviewresult extends BaseClass3
{
	
	@Test
	public void verifystudentviewresult() throws InterruptedException
	{
		SrdsStudentViewResult studentviewresult= new SrdsStudentViewResult(driver);
		studentviewresult.searchforsubjectm();
		
		
		
	}
	
	

}
