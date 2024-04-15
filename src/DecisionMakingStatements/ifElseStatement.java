package DecisionMakingStatements;

import java.util.Scanner;

public class ifElseStatement {

	public static void main(String[] args) {
		
		ifElseStatement ife = new ifElseStatement();
//		ife.method1();
//		ife.method2();
		ife.method3();

	    }
	
	void method1(){

		 int i = 10;
		  
	        if (i > 15) { 
	        	System.out.println("inside if - block");
	        	}
	        else
	        { 
	        	System.out.println("inside else - block");
	        }
	  
	        System.out.println("Outside if-else block");
	}
	
	void method2(){
		//Write a program to check if number is even or odd--- Lab Session
		
		int num;
		System.out.print("Choose number:");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num % 2==0){
			System.out.println(num+ " is even");
		}
		else{
			System.out.println(num+ " is odd");
			
		}
	}
	
	
		 void method3(){
			 
	           //Write a program to find the largest of three numbers -- Lab Sessions
				 int num1 , num2 , num3 ;
				
				 System.out.print("Enter number 1 :");
				 
				 Scanner sc = new Scanner(System.in);
				 num1=sc.nextInt();
				 
				 System.out.print("Enter number 2 :");
				 num2=sc.nextInt();
				 
				 System.out.print("Enter number 3 :");
				 num3=sc.nextInt();
				 
				 if (num1 >= num2 && num1 >= num3)
					 
				 {   System.out.println( num1 + " is the maximum number.");}
				 
			      else if (num2 >= num1 && num2 >= num3)
			    	  
			      {  System.out.println( num2 + " is the maximum number.");}
				 
			      else
			    	  
			      { System.out.println( num3 + " is the maximum number.");}
				 
			 }
	}

	


