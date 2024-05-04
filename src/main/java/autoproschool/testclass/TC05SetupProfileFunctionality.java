package autoproschool.testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import autoproschool.pom.SetupProfilePS;
//@Listeners(autoproschool.uitilityclass.ListnearClass.class)
public class TC05SetupProfileFunctionality extends BaseClass

{
	public WebDriver driver;
	
	@Test
	public void SetupProfileFunctionality() throws InterruptedException 
	{
		
		SetupProfilePS setupprofile=new SetupProfilePS(driver);
		setupprofile.Setupprofile();
		setupprofile.TitleSP();
		setupprofile.FullName();
		setupprofile.calender();
		setupprofile.ChooseGender();
		setupprofile.Enterloaction();
		setupprofile.Sellanguages();
		setupprofile.NextB();
		setupprofile.indrourself();
		setupprofile.NextB1();
		setupprofile.SuggestionM();
		setupprofile.nextbuttonM();
		setupprofile.imageiconmethod();
		setupprofile.tonem();
		setupprofile.selecttonem();
		setupprofile.ClickonWelcomemessage();
		setupprofile.SelectRadioOption();
		
		//se.CutMessage();
		//se.Welcomemsg();
		setupprofile.updateprofileB();
		
		
		
		
		
	}
		
		
		
	}
	


