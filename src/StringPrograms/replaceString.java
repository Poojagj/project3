package StringPrograms;

public class replaceString {

	public static void main(String[] args) {

		replaceString rs = new replaceString();
		rs.method2();
        
	}

	void method(){
		String string = "This is my Java Basics session";    
        System.out.println("Original String: "+string);
        
        char ch = '-';    
            
        string = string.replace(' ', ch);    
            
        System.out.print("Replaced String: ");    
        System.out.println(string); 
	}
	
	void method2(){
		
		String s = "This%^*&(())i@#$$%^%&%s(**()my*((%# Java*&*( Basics*&*)( session";
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
		
		
		
	}
}
