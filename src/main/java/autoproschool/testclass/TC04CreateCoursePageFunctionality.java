package autoproschool.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import autoproschool.pom.CreateCoursePagePS;

public class TC04CreateCoursePageFunctionality extends BaseClass1

{
       
	
	@Test
	public void CreateCoursePageFunctionality() throws InterruptedException
	{
		
		CreateCoursePagePS createcoursepage=new CreateCoursePagePS(driver);
	
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
