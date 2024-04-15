package TestNG;

import org.testng.annotations.Test;

public class Grouping_TC {

	
	 @Test  (groups= {"Regression"})
	 public void Test_Case_1()  
	 {  
	     System.out.println("Test Case 1");  
	 }  
	 
	 @Test  (groups= {"Regression","Sanity"})
	 public void Test_Case_2()  
	 {  
	     System.out.println("Test Case 2");  
	 }  
	 
	 @Test  (groups= {"Sanity"})
	 public void Test_Case_3()  
	 {  
	     System.out.println("Test Case 3");  
	 }  
	 
	 @Test (groups= {"Sanity","Smoke","Regression"}) 
	 public void Test_Case_4()  
	 {  
	     System.out.println("Test Case 4");  
	 }  
}
