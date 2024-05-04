package srdsai.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SrdsHomePage 
{
	
    WebDriver driver;
	 
	 public SrdsHomePage  (WebDriver driver)
     {
   	     this.driver=driver;
   		 PageFactory.initElements(driver, this);
     }
	 
	      @FindBy(xpath="//a[@class=\"login_btn\"]")
	      private WebElement Loginpage;
	      
	      public void Loginpagem()
	      {
	    	  Loginpage.click();
	    	
	      }
	 
	      @FindBy(xpath="//a[text()='Sign Up']")
	      private WebElement Singuppage;
	      
	      public void Signupagem()
	      {
	    	  Singuppage.click();
	    	  
	      }
	      
	      
	      
	      
	      
	      
         
}
