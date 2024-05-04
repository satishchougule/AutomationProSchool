package srdsai.testclass;

import org.testng.annotations.Test;

import srdsai.pom.SrdsInactiveToActive;

public class TC_10verifyInactivetoActiveFunctionality extends BaseClass
{
	
	@Test
	public void verifyInactivetoActiveFunctionality()
	{
		
		SrdsInactiveToActive inactivetoactivepage=new SrdsInactiveToActive(driver);
		inactivetoactivepage.InactiveCourseDashboard();
		
	}
	
	

}
