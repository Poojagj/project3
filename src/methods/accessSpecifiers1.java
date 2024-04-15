package methods;

public class accessSpecifiers1 {
	//1.What are the various access specifiers provided in Java --- Lab Sessions
	//2.Write a Java program to illustrate private and public access specifiers.--- Lab Sessions
	
	private void method1(){
		
		System.out.println("this is private method1");
		
	}
	
	
	void method2(){
		
		System.out.println("this is default method2");

	}
	
    protected void method3(){
		
		System.out.println("this is protected method3");

	}
	
	public void method4(){
		
		System.out.println("this is public method4");

	}

	public static void main(String[] args) {
		
		accessSpecifiers1 as = new accessSpecifiers1();
		as.method1();
		as.method2();
		as.method3();
		as.method4();
		
	
		
	}

}
