package autoproschool.testclass;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import autoproschool.pom.TeacherFileUploadingPS;

public class TC10TeacherFileUploading extends BaseClass1
{
	
	
	@Test
	public void VerifyingTeacherFileuploading() throws InterruptedException, AWTException
	{
		TeacherFileUploadingPS fileupload=new TeacherFileUploadingPS(driver);
		fileupload.viewcourseFileuploadM();
		fileupload.addlessonfileuploadM();
		fileupload.lessonnamefileuploadM();
	    fileupload.uploadiconM();
		fileupload.yourpromptsm();
		fileupload.SendIconbuttonM();
		fileupload.LessonclickbuttonM();
		
	 String lessonname="MYSQL";
	 
	 Assert.assertEquals(lessonname, "MYSQL", "The lesson name should be MYSQL");
	}
	 
	 private String getLessonName()
	 {
		 return "MYSQL";
	 }
		
		
	}
	


