package Annotations;

import org.testng.annotations.*;

public class Demo2Test {
	@BeforeSuite
	void BeforeSuite() {

		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void AfterSuite() {

		System.out.println("After Suite");
	}
	@BeforeClass
	void BeforeClass2() {

		System.out.println("Before Class 2 ");
	}
	@AfterClass
	void AfterClass2() {

		System.out.println("After Class 2");
	}
	@BeforeMethod
	void BeforeMethod2() {

		System.out.println("Before Method 2");
	}
	
	@AfterMethod
	void AfterMethod2() {

		System.out.println("After Method 2");
	}
	@Test
	void Test3() {
		
		System.out.println("Test 3 Method");
	}
	
	@Test
	void Test4() {
		
		System.out.println("Test 4 Method");
	}
	

}
