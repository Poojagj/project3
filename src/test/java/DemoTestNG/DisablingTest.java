package DemoTestNG;

import org.testng.annotations.Test;

public class DisablingTest {
	@Test(priority=10)
	void setupBrowser() {
		System.out.println("Browser Setup method");
	}

	@Test(enabled=false)
	void Login() {
		System.out.println("Login Method");
	}
	

	@Test(priority=-3, enabled=false)// by default enabled=true is the value for all test
	void closeBrowser() {
		System.out.println("Close Browser method");
	}
	
	@Test(priority=-2)
	void Demo() {
		System.out.println("Demo method");
	}

}
