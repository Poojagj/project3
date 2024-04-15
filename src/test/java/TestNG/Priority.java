package TestNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=11)
	void Setup_Browser() {

		System.out.println("Browser Setup method");
	}
	
	@Test
	void Login() throws InterruptedException {
		System.out.println("Login method");

	}
	
	@Test(priority=-3)
	void Close_Browser() {
		
		System.out.println("Browser close method");
	}

}
