package String;

public class stringMethods5 {

	public static void main(String[] args) {
		//equals() method
				String s1="javaClass";  
				String s2="JAVACLASS";  
				String s3="MorningJava";  
				String s4="javaClass";  
				
				System.out.println(s1.equals(s2));//f
				System.out.println(s1.equals(s3));//f
				System.out.println(s1.equals(s4)); //t

				System.out.println("");
				
	   //equalsIgnoreCase() method
				String j1="javaClass";  
				String j2="JAVACLASS";  
				String j3="MorningJava";  
				String j4="javaClass";  
				
				System.out.println(j1.equalsIgnoreCase(j2));//t
				System.out.println(j1.equalsIgnoreCase(j3));//f
				System.out.println(j1.equalsIgnoreCase(j4)); //t
			}

	

}
