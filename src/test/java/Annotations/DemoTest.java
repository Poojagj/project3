package Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DemoTest {

	
	
	@BeforeTest
	void BeforeTest() {

		System.out.println("Before Test");
	}
	
	@AfterTest
	void AfterTest() {

		System.out.println("After Test");
	}
	
	@BeforeClass
	void BeforeClass() {

		System.out.println("Before Class");
	}
	
	@AfterClass
	void AfterClass() {

		System.out.println("After Class");
	}
	@BeforeMethod
	void BeforeMethod() {

		System.out.println("Before Method");
	}

	@Test
	void Test1() {
		
		System.out.println("Test 1 Method");
	}
	
	@Test
	void Test2() {
		
		System.out.println("Test 2 Method");
	}
	
	
	@AfterMethod
	void AfterMethod() {

		System.out.println("After Method");
	}
}
