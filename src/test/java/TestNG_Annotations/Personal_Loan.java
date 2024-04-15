package TestNG_Annotations;

import org.testng.annotations.*;

public class Personal_Loan {
	 
	
	 @BeforeTest
	 public void Before_Test()  
	 {  
	     System.out.println("Before Test");  
	 }  
	
	 @AfterTest
	 public void After_Test()  
	 {  
	     System.out.println("After Test");  
	 }  
	 
	 @BeforeClass
		public void Before_Suite() {
			
			System.out.println("Before Class");  
			
		}
	 
	 @AfterClass
	 public void After_Class()  
	 {  
	     System.out.println("After Class");  
	 }  
	 
	 @BeforeMethod  
	 public void Before_Method()  
	 {  
	     System.out.println("Before Method");  
	 } 
	
	 @AfterMethod  
	 public void After_Method()  
	 {  
	     System.out.println("After  Method");  
	 } 
	 
	 @Test  
	 public void Personal_loan_1()  
	 {  
	     System.out.println("Personal Loan_1");  
	 }  
	 
	 @Test  
	 public void Personal_loan_2()  
	 {  
	     System.out.println("Personal Loan_2");  
	 }  
	 
	
}
