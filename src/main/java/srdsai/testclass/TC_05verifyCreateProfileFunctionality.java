package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsCreateCourseProfile;

public class TC_05verifyCreateProfileFunctionality extends BaseClass

{
	@Test
	
	public void verifyCreateProfileFunctionality() throws InterruptedException
	{
		
		SrdsCreateCourseProfile createcoursepage=new SrdsCreateCourseProfile(driver);
		createcoursepage.createcousebutton();
		createcoursepage.coursename();
		createcoursepage.selectsub();
		//createcoursepage.selectsubjectm();
		createcoursepage.selectleve();
       //createcoursepage.selectlevelm();
		createcoursepage.selecttoleve();
        //createcoursepage.selecttolevem();
        //createcoursepage.clickpurposeusedm();
		createcoursepage.Coursesd();
		createcoursepage.Coursedecri();
		createcoursepage.ecdhyperlink();
		createcoursepage.generateusingaiM();
      //createcoursepage.uploadimage();
		createcoursepage.CreatCButton();
	
		
		
	}
	
}
	
	
	

