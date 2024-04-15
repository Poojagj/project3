package String;

public class LS_String1 {

	public static void main(String[] args) {
		
//2.	Java Program to Remove special Characters from the Input String which are Present
		
	     String str= "This#is%my^String*program...1234&.";   
	     str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	     System.out.println(str);  
	     }  		

	

}
