package autoproschool.testclass;

import org.testng.annotations.Test;

import autoproschool.pom.InviteforStudentPS;

public class TC14verifyInviteCourseforStudent extends BaseClass1
{
	
	@Test
	public void verifyInviteCourseforStudent() throws InterruptedException 
	{
		InviteforStudentPS invitecourseforStudent=new InviteforStudentPS(driver);
		invitecourseforStudent.SerchingSubject();
        invitecourseforStudent.InviteStudent();
		
		
	}

}
