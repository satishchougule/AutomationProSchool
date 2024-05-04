package srdsai.testclass;

import java.awt.AWTException;

import org.testng.annotations.Test;

import srdsai.pom.SrdsFileUploading;

public class TC_04verifyFileUploading extends BaseClass
{
	@Test
	public void verifyFileUploading() throws InterruptedException, AWTException
	{
		
		SrdsFileUploading fileuploading=new SrdsFileUploading(driver); 
		fileuploading.viewcourseFileuploadM();
		fileuploading.addlessonfileuploadM();
		fileuploading.lessonnamefileuploadM();
		//fileuploading.uploadiconM();
		fileuploading.yourpromptsm();
		fileuploading.SendIconbuttonM();
		fileuploading.LessonclickbuttonM();
		
		
	}
	

}
