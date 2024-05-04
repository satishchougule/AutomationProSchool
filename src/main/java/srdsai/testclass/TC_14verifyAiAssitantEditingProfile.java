package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.TeacherAiAssitantEditingProfile;

public class TC_14verifyAiAssitantEditingProfile extends BaseClass
{
	
	@Test
	
	public void verifyAiAssitantEditingProfile() throws InterruptedException
	{
		
		TeacherAiAssitantEditingProfile aiprofileediting=new TeacherAiAssitantEditingProfile(driver);
		aiprofileediting.settingsmai();
		aiprofileediting.Editm();
//		aiprofileediting.imageuploadingm();
//	    aiassistantprofileediting.aiassitantnamem();
		aiprofileediting.aiassitanttonem();
//		aiprofileediting.aiassitanttonecheckboxm();
//		aiprofileediting.customizewelcomemessagem();
		aiprofileediting.saveaim1();
		
		
	}

}
