package methods;

public class parameterisedMethod {

	void method1(){
		int a=100;
		System.out.println(a);
	}
	
	 void method2(int b){
		 System.out.println(b);
		 
	 }
	 
	 void method3(int c , String s , boolean d){
		 
		 System.out.println(c);//50
		 System.out.println(s);//Java
		 System.out.println(d);
		 
		 
	 }
	public static void main(String[] args) {
		
		parameterisedMethod pm = new parameterisedMethod();
		pm.method1();
//		pm.method2();
		pm.method2(200);
		pm.method3(50, "Java" , false);
		
	}

}
