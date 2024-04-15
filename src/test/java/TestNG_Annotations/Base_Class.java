package TestNG_Annotations;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class Base_Class {
	
	 @BeforeSuite  
	 public void before_suite()  
	 {  
	     System.out.println("Before Suite");  
	 }  
	 
	 @AfterSuite  
	 public void After_Suite_Method()  
	 {  
	     System.out.println("After Suite");  
	 }  
	 
	

}
