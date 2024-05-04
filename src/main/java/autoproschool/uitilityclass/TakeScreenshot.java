package autoproschool.uitilityclass;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import autoproschool.testclass.TC05SetupProfileFunctionality;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TakeScreenshot 
{
public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException
		{
	TakesScreenshot ts = (TakesScreenshot) driver;
    File sourceFile = ts.getScreenshotAs(OutputType.FILE);
    
    // Define the destination directory
    String destinationDirectory = "C:\\Users\\Admin\\eclipse-workspace\\automation.pro\\Screenshots\\";
    
    // Get current date and time
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String currentDateAndTime = dateFormat.format(new Date());
    
    // Construct the filename with current date and time
    String fileName = screenshotName  + currentDateAndTime + ".jpg";
    
    File destFile = new File(destinationDirectory + fileName);
    FileHandler.copy(sourceFile, destFile);
    System.out.println("Screenshot is taken and saved as: " + fileName);

		}

}



























































//     public class ListnearClass implements ITestListener
//{
//	
//     private WebDriver driver;
//     
//     public void  onStart(ITestResult result)
//     {
//    	 System.out.println("test case is started");
//     }
//     
//     public void onFinish(ITestResult result)
//     {
//    	 System.out.println("test case is finished");
//     }
//     
//     public void onTestSuccess(ITestResult result)
//     {
//    	 System.out.println("test case is sucessfully passed");
//     }
//     
//     public void OnTestFailure(ITestResult result)
//     {
//     
//      System.out.println("Test case is failed hence we take screenshot");
//    	 
//      this.driver=((TC05SetupProfileFunctionality)result.getInstance()).driver;
//   	  TakesScreenshot ts = (TakesScreenshot)driver;
//   	  File sourcefile=ts.getScreenshotAs(OutputType.FILE);
//  	  File destfile=new File ("C:\\Screenshot\\loginpage.jpg");
//   	  try 
//   	  {
//   		FileHandler.copy(sourcefile, destfile);
//  	  } 
//     
//   	  catch(IOException e)
//   	  
//   	  {
//         e.printStackTrace();
//  	
//   	  }
//   	}
//   	
//   	public void onTestStart(ITestResult result)
//   	{
//   		System.out.println("Sanity test is perfromed");
//   	}
//   	
   	

    	 
     
      
     
      

