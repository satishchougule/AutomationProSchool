package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import autoproschool.pom.TeacherAiAssistantProfileEditingPS;

public class TC09TeacherAiAssistantProfileEditing extends BaseClass1
{

	@Test
	public void verifyingTeacherAiAssistantProfileEditing() throws InterruptedException
	{
		TeacherAiAssistantProfileEditingPS aiassistantprofileediting=new TeacherAiAssistantProfileEditingPS (driver);
		aiassistantprofileediting.settingsmai();
		aiassistantprofileediting.Editm();
//		aiassistantprofileediting.imageuploadingm();
	    //aiassistantprofileediting.aiassitantnamem();
		aiassistantprofileediting.aiassitanttonem();
//		aiassistantprofileediting.aiassitanttonecheckboxm();
//		aiassistantprofileediting.customizewelcomemessagem();
		aiassistantprofileediting.saveaim1();
		
		 
		
//		String expectedMessage = "Hi! I am Mrs. reena AI, how may I help you?";
//		 
//		 
//		 String actualName  =  driver.getPageSource();
//		 System.err.println("actualName"+ actualName);
//		 
//		 Assert.assertEquals(actualName, "Mr.satish.ai", "The AI assistant's name should be set to the expected value.");
    }

		
		

	}
	
	
	
	


