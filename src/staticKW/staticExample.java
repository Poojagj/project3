package staticKW;

public class staticExample {
	
	//3.	Java Program to show the static variable declaration. --- Lab Sessions
	
	 int a=100;
	static int b=200;
	
	 void m1(){
		 
		 System.out.println("This is my Non Static method");
	 }
	
	 static void m2(){
		 System.out.println("This is my  Static method");

	 }
	 
	

	public static void main(String[] args) {
		
		staticExample s = new staticExample();
	
//		System.out.println(staticExample.a);
		System.out.println(staticExample.b);
		
		System.out.println(s.a);
		System.out.println(s.b);
		
//		staticExample.m1();
		staticExample.m2();
		
		s.m1();
		s.m2();

		

		
		
		



	}

}
