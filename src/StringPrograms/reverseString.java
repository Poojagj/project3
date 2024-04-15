package StringPrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
	
		reverseString rs = new reverseString();
		rs.method1();
		

	}
	
	void method1(){
	
		String s;
		String rev="";
		
			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Enter String to reverse: ");
//			s=sc.next();
		    
	    	s="Java";
	    	
			System.out.println("Original String is : "+s);
			
			
			for(int i =s.length()-1;i>=0;i--){
				
				rev=rev+s.charAt(i);
			}
			
			System.out.println("Reversed String is : "+rev);

	}
	
	

}
