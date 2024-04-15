package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Reporters_Log_2 {
	 @Test (priority=2 )
	  public void LogIn() {

		  Reporter.log("LogIn Passed", true);
	  }

	 
	 @Test(priority=3)
	  public void AddToCart() {
		
		  Reporter.log("AddToCart Passed", true);
	  }
	 
	 @Test(priority=4)
	  public void Payments() {
		 
		  Reporter.log("Payments Passed", true);
	  }
	 
	  @Test(priority=1)
	  public void OpenBrowser() {
		 
		  Reporter.log("OpenBrowser Passed", true);
	  }
	  

	  @Test (priority=5)
	  public void LogOut() {
		
		  Reporter.log("LogOut Passed", true);
	  }


}
