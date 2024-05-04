package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsTeacherProfileEditing;

public class TC_11verifyTeacherProfileeEditingFunctionality extends BaseClass
{
	
	@Test
	
	public void verifyTeacherProfileeEditingFunctionality() throws InterruptedException
	{
		SrdsTeacherProfileEditing Teacherprofile=new SrdsTeacherProfileEditing(driver);
		Teacherprofile.settingsm();
//		Teacherprofile.dropM();
//		Teacherprofile.profileem();
		Teacherprofile.Editm();
		Teacherprofile.aboutteacherm();
//		Teacherprofile.linkedinsm();
//		Teacherprofile.addsubjectsm();
//		Teacherprofile.suggestsm();
//		Teacherprofile.Submitsm();
//		Teacherprofile.titleSm();
//		Teacherprofile.settingname();
//		Teacherprofile.settinggenderm();
//		Teacherprofile.settingenterlocationm();
		Teacherprofile.Savebutton();
		
	}

}
