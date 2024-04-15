package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(priority=1 )
	public void OpenBrowser() {
		
		Assert.assertEquals(true,false);
		System.out.println("Browser Launched");
		
	}
	
	@Test(priority=2 ,dependsOnMethods= {"OpenBrowser"})
	public void Login() {
		
		System.out.println("User has Logged In Successfully");
	}
	
	@Test(priority=3 , dependsOnMethods= {"Logout" ,"Login"})
	public void AddToCart() {
		System.out.println("Add to Cart performed Successfully");
		
	}
	
	@Test(priority=4)
	public void Payments() {
		
		System.out.println("Payments performed Successfully");
	}
	
	@Test(priority=5)
	public void Logout() {
		
		System.out.println("User Logged Out Succesfully");
	}

}
