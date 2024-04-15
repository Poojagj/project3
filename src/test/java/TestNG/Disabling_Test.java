package TestNG;

import org.testng.annotations.Test;

public class Disabling_Test {
	
		@Test(priority=1,enabled=false)//by default enabled =true for all test.
		void Setup_Browser() {

			System.out.println("Browser Setup method");
		}
		
		@Test(priority=2)
		void Login() throws InterruptedException {
			System.out.println("Login method");

		}
		
		@Test(priority=3)
		void Close_Browser() {
			
			System.out.println("Browser close method");
		}

	

}
