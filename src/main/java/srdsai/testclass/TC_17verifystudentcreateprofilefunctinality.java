package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsStudentCreateProfile;

public class TC_17verifystudentcreateprofilefunctinality extends BaseClass3
{
	
	@Test
	public void verifystudentcreateprofilefunctinality() throws InterruptedException
	{
		SrdsStudentCreateProfile createprofile=new SrdsStudentCreateProfile(driver);
		createprofile.CreateProfile();
		
		
	    
		
		
		
	}

}
