package DemoTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Invocation {
	
	@Test(invocationCount=5)
	void Test1() {
		System.out.println("Test 1");
	}

	@Test
	void Test2() {
		System.out.println("Test 2");
	}

}
