package DemoTestNG;

import org.testng.annotations.Test;

public class priorityTest {
	
	@Test(priority=10)
	void setupBrowser() {
		System.out.println("Browser Setup method");
	}

	@Test
	void Login() {
		System.out.println("Login Method");
	}
	

	@Test(priority=-3)
	void closeBrowser() {
		System.out.println("Close Browser method");
	}
	
	@Test(priority=-2)
	void Demo() {
		System.out.println("Demo method");
	}

}
