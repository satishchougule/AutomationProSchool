package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import autoproschool.pom.TeacherProfileEditingPS;

public class TC08TeacherProfileEditing extends BaseClass1
{
	
	@Test
	public void VerifyTeacherProfileEditing() throws InterruptedException
	{
		
		TeacherProfileEditingPS teacherprofilrediting=new TeacherProfileEditingPS(driver);
		teacherprofilrediting.settingsm();
//		teacherprofilrediting.dropM();
//		teacherprofilrediting.profileem();
		teacherprofilrediting.Editm();
		teacherprofilrediting.aboutteacherm();
//		teacherprofilrediting.linkedinsm();
//		teacherprofilrediting.addsubjectsm();
//		teacherprofilrediting.suggestsm();
//		teacherprofilrediting.Submitsm();
//		teacherprofilrediting.titleSm();
//		teacherprofilrediting.settingname();
//		teacherprofilrediting.settinggenderm();
//		teacherprofilrediting.settingenterlocationm();
		teacherprofilrediting.Savebutton();
			
    }
	}
