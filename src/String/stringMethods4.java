package String;

public class stringMethods4 {

	public static void main(String[] args) {
		
		// replace() method
		
		String s1="This is my Java Class";  
		String replaceStr=s1.replace('a','z');  
		System.out.println(replaceStr); 
		
		System.out.println("");
		
		String s2="This is my Java Class";  
		String replaceStr2=s2.replace("my","our");  
		System.out.println(replaceStr2);  
		
		System.out.println("");
		
		
		// replaceAll() method
		
		String str = "JavaClass";  
		System.out.println(str); 
		
		System.out.println("");
		  
		String space ="";   
		str = str.replaceAll(space, " ");  
		System.out.println(str);
		
		System.out.println("");
		
		String whitespace =" ";   
		str = str.replaceAll(whitespace, ".");  
		System.out.println(str);
		
		System.out.println("");
		
		
		// split() method
		
		String s="Java Split method";  
		
		String[] words=s.split(" ");
		
		for(String w:words){  
			
		System.out.println(w);  
		
		}

	}

}
