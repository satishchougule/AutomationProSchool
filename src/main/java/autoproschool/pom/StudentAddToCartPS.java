package autoproschool.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StudentAddToCartPS 
{
	   WebDriver driver;
	
	public StudentAddToCartPS(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
}
