package DemoTestNG;

import org.testng.annotations.Test;

public class FirstTestNGtest {

	@Test
	void setupBrowser() {
		System.out.println("Browser Setup method");
	}

	@Test
	void Login() {
		System.out.println("Login Method");
	}

	@Test
	void closeBrowser() {
		System.out.println("Close Browser method");
	}
}