package DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Listeners.class)
public class listnrDemo {
	@Test(priority=1 )
	public void OpenBrowser() {
		Assert.assertEquals(true,false);
		System.out.println("Browser Launched");
	}
	
	@Test(priority=2 ,dependsOnMethods= {"OpenBrowser"})
	public void Login() {
		
	}
	
	@Test(priority=3 , dependsOnMethods= {"Login"})
	public void AddToCart() {
			
	}
	
	@Test(priority=4)
	public void Payments() {
			
	}
	
	@Test(priority=5)
	public void Logout() {
		
	}
}
