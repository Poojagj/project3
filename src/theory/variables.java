package theory;

public class variables {
	
	//1.	Java Program to show the local variable declaration --- Lab Sessions
	//2.	Java Program to show the instance variable declaration --- Lab Sessions
	

	
	int a=100; // global/instance variable
	
	void method1(){
		
		int b=30;                  //Local V
		System.out.println(b);
		System.out.println(a);     // global V
//		System.out.println(c);
	}
	
	void method2()
	{
		int c=30;                  //Local V
//		System.out.println(b);
		System.out.println(a);     // global V
		System.out.println(c);
	}
	
	void method3(int d){             //Local V
		
		System.out.println(d);
		System.out.println(a);       // global V
//		System.out.println(b);
//		System.out.println(c);
		
		
	}
	public static void main(String[] args) {
		
		
		variables v = new variables();
		v.method1();
		v.method2();
		
		v.method3(50);
		v.method3(100);
		v.method3(2);
		
		
		

	}

}
