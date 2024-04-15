package StringPrograms;

import java.util.Scanner;

public class SwapNumber {
	
	
	public static void main(String[] args) {
		SwapNumber sn = new SwapNumber();
//		sn.method1();
		sn.method2();

	}
	
	void method1(){
	// Swapping numbers using temporary variable	
		
		int a, b , temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		
		System.out.println("Before swap:  a is " +a+ " and b is "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap: a is  " +a+ " and b is "+b);
		
	}
	
	void method2(){
		// Swapping using operators +/- variable
        int a, b ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		
		System.out.println("Before swap: a is  " +a+ " and b is "+b);
 
        a = a + b;
        b = a - b;
        a = a - b;
 
        System.out.println("After swap:   a is  " +a+ " and b is "+b);
    
	}
	
	

}
