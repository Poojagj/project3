package String;

public class stringMethods1 {

	public static void main(String[] args) {
		
		//charAt() method
		String name="JavaClass";  
		
		char ch=name.charAt(8);//returns the char value at the 4th index  
		
		System.out.println(ch); 
		
		System.out.println("");
		
		
		//concat() method
		// 1.	Java Program to Concatenate Two Strings------Lab Sessions
		String s1="java string";
		
		s1.concat("is immutable");
		
		System.out.println(s1);
		
		s1=s1.concat(" is expilicitly immutable ");
		System.out.println(s1);
		
		System.out.println("");
		
		//contains() method
		
		String s="This is Java Class";  
		System.out.println(s.contains("This is"));  
		System.out.println(s.contains("Java")); 
		System.out.println(s.contains("Cla")); 
		System.out.println(s.contains("Manual"));  
		
		System.out.println("");
		

	}

}
