package TestNG;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestNG_Invocation_Count {

	@Test(invocationCount = 3)
	public void testcase1(ITestContext testContext) {
		System.out.println("Running testcase 1");
		int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing count: " + currentCount);
	}

	@Test(invocationCount = 4)
	public void testcase2(ITestContext testContext) {
		System.out.println("Running testcase 2");
		int currentCount = testContext.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing count: " + currentCount);
	}
}
