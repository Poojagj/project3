package TestNG_Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Home_Loan {
	
	
	@BeforeClass
	public void Before_Suite() {
		
		System.out.println("Before Class");  
		
	}
	
	@AfterClass
	public void After_Suite() {
		
		System.out.println("After Class");  
			
	}
	
	
	@Test  
	public void home_loan_1()  
	{  
	  System.out.println("Home Loan_1");  
	}  
	
	@Test  
	public void home_loan_2()  
	{  
	  System.out.println("Home Loan_2");  
	}  

}
