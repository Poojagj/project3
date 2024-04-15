package DecisionMakingStatements;

import java.util.Scanner;

public class ifElseLadderStatement {

	public static void main(String[] args) {
	
        ifElseLadderStatement ife = new ifElseLadderStatement();
        ife.method();
//        ife.ifelse1();
   
	}
	

	void ifelse1(){
		
        int i = 60;
 
       
        if (i == 10)
        {
            System.out.println("i is 10");
            }
        else if (i == 15)
        {
            System.out.println("i is 15");
            }
        else if (i == 60)
        {
            System.out.println("i is 60");
            }
        else
        {
            System.out.println("i is not present");
            }
        System.out.println("Outside if-else-if");
	}
	
	 //2.Write a program to check if number is positive, negative or a zero -- Lab Session
    
	void method(){
		
    int num;
    
    System.out.print("Choose number:");
    
    Scanner sc= new Scanner(System.in);
    num=sc.nextInt();
    
    if(num>0){
    	System.out.println(num+" is positive");
    }
    else if(num<0){
    	System.out.println(num+" is negative");
    }
    else{
    	System.out.println(num+" is zero");
    }
    
	}
	
	
}
