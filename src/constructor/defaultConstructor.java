package constructor;

public class defaultConstructor {
	// 1.	Java Program to illustrate the default constructor------Lab Sessions

	int a;
	String b;
	
	defaultConstructor(){
		a=100;
		b="Java";
		
	}
	
	void display(){
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		
		defaultConstructor d = new defaultConstructor();
		d.display();
		
	}
}
