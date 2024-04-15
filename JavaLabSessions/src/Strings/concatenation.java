package Strings;

public class concatenation {

	public static void main(String[] args) {
		
// 1.	Java Program to Concatenate Two Strings
		 String s = "Java";
	     s = s.concat(" Class");
	     System.out.println(s);
	     
	     
//2.	Java Program to Remove special Characters from the Input String which are Present
	     String str= "This#is%my^String*program...1234&.";   
	     str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	     System.out.println(str);  
	     }  
	       
	 

	}


