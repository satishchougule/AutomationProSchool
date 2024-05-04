package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsStudentUniversalSearchflow;

public class TC_19verifyUniversalsearchfunctionality extends BaseClass
{
  
	
	@Test
	public void verifyUniversalsearchfunctionality() throws InterruptedException
	{
		SrdsStudentUniversalSearchflow universalsearch=new SrdsStudentUniversalSearchflow(driver);
		universalsearch.studentUniversalSearch();
	}
	

}
