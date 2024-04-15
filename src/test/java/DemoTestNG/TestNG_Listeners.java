package DemoTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listeners implements ITestListener {
	
	public void onStart(ITestContext context) {

		System.out.println("Start Test Execution  ");
	}

	public void onTestStart(ITestResult result) {

		System.out.println("New Test Started : " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test Successfully executed :  " + result.getName());
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test Not Successfully  executed : " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

		System.out.println("Test Skipped : " + result.getName());
	}

	public void onFinish(ITestContext context) {

		System.out.println("End Test Execution");
	}


}
