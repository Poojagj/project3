package TestNG;

import org.testng.annotations.Test;

public class TestNG_Depends_On {
	
	 @Test (priority=2 , dependsOnMethods = { "OpenBrowser" })
	  public void LogIn() {
		  System.out.println("User has Logged in successfully");
	  }

	 
	 @Test(priority=3)
	  public void AddToCart() {
		  System.out.println("Add to Cart performed Succesfully");
	  }
	 
	 @Test(priority=4 ,dependsOnMethods = { "LogIn","AddToCart" })
	  public void Payments() {
		  System.out.println("Payments performed Succesfully");
	  }
	 
	  @Test(priority=1)
	  public void OpenBrowser() {
		  System.out.println("The browser is opened");
	  }
	  

	  @Test (priority=5 ,dependsOnMethods = { "LogIn" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
	  }

}
