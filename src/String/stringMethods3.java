package String;

public class stringMethods3 {

	public static void main(String[] args) {
		
		
		// indexOf() method
		String s1 = "indexOf method";  
		
	    int index1 = s1.indexOf("m"); 
	    System.out.println("index of m is "+index1);  
	    
	    int index2 = s1.indexOf("x"); 
	    System.out.println("index of x is "+index2); 
	    
	    int index3 = s1.indexOf("exOf"); 
	    System.out.println("index of exOf is "+index3); 
	    
	    System.out.println("");
	    
	    
	 // isEmpty() method
	    
	    String e1="";  
	    String e2="java";  
	      
	    System.out.println(e1.isEmpty());  
	    System.out.println(e2.isEmpty());  
	    
	    System.out.println("");
	    
	    
	 // length() method
	    
	    String str1 = " Welcome To Java ";  
	    int size1 = str1.length(); 
	    System.out.println(size1);  
	    
	    String str2 = "Welcome To Java";  
	    int size2 = str2.length(); 
	    System.out.println(size2);  
	    
	    

	}

}
