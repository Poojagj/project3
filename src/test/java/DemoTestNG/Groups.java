package DemoTestNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups = {"Regression"})
	public void Test1() {
		
		System.out.println(" Test Case 1");
	}
	
	@Test(groups = {"Regression" ,"Sanity"})
	public void Test2() {
		
		System.out.println(" Test Case 2");
	}
	
	@Test(groups = {"Sanity"})
	public void Test3() {
		
		System.out.println(" Test Case 3");
	}
	
	@Test(groups = {"Regression" ,"Smoke" ,"Sanity"})
	public void Test4() {
		
		System.out.println(" Test Case 4");
	}

}
