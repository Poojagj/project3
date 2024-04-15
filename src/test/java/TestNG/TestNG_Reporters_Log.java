package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Reporters_Log {
	
	 @Test (priority=2 )
	  public void LogIn() {
		  System.out.println("User has Logged in successfully");
		  Reporter.log("User has Logged in successfully");
		
	  }

	 
	 @Test(priority=3)
	  public void AddToCart() {
		  System.out.println("Add to Cart performed Succesfully");
		  Reporter.log("Add to Cart performed Succesfully");
	
	  }
	 
	 @Test(priority=4)
	  public void Payments() {
		  System.out.println("Payments performed Succesfully");
		  Reporter.log("Payments performed Succesfully");
	
	  }
	 
	  @Test(priority=1)
	  public void OpenBrowser() {
		  System.out.println("The browser is opened");
		  Reporter.log("The browser is opened");
	
	  }
	  

	  @Test (priority=5)
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
		  Reporter.log("The user logged out successfully");
		 
	  }

}
