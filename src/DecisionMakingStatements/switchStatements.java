package DecisionMakingStatements;

import java.util.Scanner;

public class switchStatements {

	public static void main(String[] args) {
		switchStatements ss = new switchStatements();
//		ss.method1();
		ss.method2();
			
			}

	
	
	void method1(){
		
		int day = 9;
		
        String dayString;
 
        switch (day) {
 
        case 1:
            dayString = "Monday";
            break;
 
        case 2:
            dayString = "Tuesday";
            break;
 
        case 3:
            dayString = "Wednesday";
            break;
 
        case 4:
            dayString = "Thursday";
            break;
 
        case 5:
            dayString = "Friday";
            break;
 
        case 6:
            dayString = "Saturday";
            break;
 
        case 7:
            dayString = "Sunday";
            break;
 
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
	}
	
	void method2(){
		//4.Write a program to  make a Simple Calculator using Switch Case--- Lab Sessions
		
		int operator ,num1 , num2 ,result = 0 ;

		System.out.println("1-Addition \n2-Substraction \n3-Multiplication \n4-Division");
		
		System.out.print("Choose Operator:");
		Scanner sc = new Scanner(System.in);
		operator=sc.nextInt();
		
		System.out.print("Enter first number:");
		num1=sc.nextInt();
		
		System.out.print("Enter second number:");
		num2=sc.nextInt();
		
		switch(operator){
		
		case 1 : 
			result =num1 +num2;
			break;
		case 2 : 
			result =num1 -num2;
			break;
		case 3 : 
			result =num1 *num2;
			break;
		case 4 : 
			result =num1 /num2;
			break;
		default : 
			System.out.println("Invalid Operator");
			
		}
		System.out.println("Result is :" +result);
		
}
	}
