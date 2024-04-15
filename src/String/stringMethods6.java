package String;

public class stringMethods6 {

	public static void main(String[] args) {
		
		//substring() method
		String s="javaClass";  
		System.out.println(s.substring(2,7)); // 7th index  is exclusive// vaCla
		System.out.println(s.substring(2)); // from 2nd index //vaClass
		
		//toLowerCase() method
		String s1="JAVA CLASS stRIng";  
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);  
		
		//toUpperCase() method
		String s2="Java ClasS stRIng";  
		String s2UPPER=s2.toUpperCase();  
		System.out.println(s2UPPER); 	
		
		//trim() method
		String s3=" Java Class ";  
		System.out.println(s3); 
		String trim=s3.trim();  
		System.out.println(trim); 

	}

}
