package methods;

public class returnType {
	
	void method1(){
		
		int a=10;
		System.out.println(a);//10
	}
	
	int method2(){//20
		
		int a =1000;
		System.out.println(a);
		return a;
		
	}

	boolean method3(){
		
		boolean f=false;
		return f;
		
	}
	
	String method4(){
		
		String s= "Java";
		return s;
		
	}
	
	int method5(int c){
		
		return c; //10
		
	}
	
	public static void main(String[] args) {
		
		returnType rt = new returnType();
		
		rt.method1();
		
		int r=rt.method2();
		System.out.println(r);//1000
		
		boolean b = rt.method3();
		System.out.println(b);
		
		String d=rt.method4();
		System.out.println(d);
		
		int x=rt.method5(35);
		System.out.println(x);
	}

}
