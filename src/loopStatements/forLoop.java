package loopStatements;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		forLoop fl = new forLoop();
//		fl.method1();
//		fl.method2();
//		fl.method3();
		fl.method4();
		
	}
	
	void method1(){
		
		// Print 1 to 10 numbers
		
		for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
	}
	
	
	
	
	void method2(){
		//Write a program to find sum of natural numbers till 10 using for loop-- Lab Session
		
		int sum=0;
		for(int i=1; i<=10 ; i++){
			
			sum=sum+i;
		}
		System.out.println("The sum of 1 to 10 numbers is :" +sum);
	}
	
	
	
	void method3(){
		
		//Write a program to print Fibonacci Series upto 10 nos using for loop -- Lab Session
		
		int n1=0,n2=1,n3,count=10;

		System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(int i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;  
		  
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
	}
		 
	
		 void method4(){

			 // Write a program to find factorial of  5 using loops -- Lab Session
			 
			
			 int factorial=1;  
			 int number=10;  
			 
			  for(int i=1;i<=number;i++){ 
				  
				  factorial=factorial*i;    
			  } 
			  
			  System.out.println("Factorial of "+number+" is: "+factorial);    
			 
		 }  
	
		
	
		
		
	

}
