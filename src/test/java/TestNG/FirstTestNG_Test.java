package TestNG;

import org.testng.annotations.Test;

public class FirstTestNG_Test {

	@Test
	void setup_Browser() {

		System.out.println("Browser Setup method");
	}

	@Test
	void Login() {

		System.out.println("Login method");
	}

	@Test
	void close_Browser() {

		System.out.println("Browser close method");
	}

}
