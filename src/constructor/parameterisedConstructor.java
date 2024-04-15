package constructor;

public class parameterisedConstructor {
	
	//3.	Java Program to illustrate the parameterized constructor------Lab Sessions

	int a;
	String b;
	
	parameterisedConstructor(int a, String b){
	
		System.out.println(a+ " " + b);
		
	}
	
	void display(){
		
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		parameterisedConstructor d =new  parameterisedConstructor(20,"constructor");
		d.display();
	
	}

}
