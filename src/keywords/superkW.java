package keywords;

public class superkW {

	public static void main(String[] args) {
		
//		A obj1 = new A();
//		obj1.display();
		
		A obj = new B();
		obj.display();

	}

}

class A {
	
	int a=10;
	void display(){
		
		System.out.println(a);
		
	}
	
}

class B extends A{
	
	int a=20;
	void display(){

		System.out.println(a);//20
		System.out.println(super.a);//10
	}
}