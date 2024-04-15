package OOPsPrinciples;

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading();
		co.display();
		
		ConstructorOverloading co1 = new ConstructorOverloading(100,200);
		
		
	}
	
	int x;
	int y;

	void display(){
		int z=x+y;
		
		System.out.println(z);
	}
	
	
	ConstructorOverloading(){
		x=10;
		y=20;
		
	}
	
	ConstructorOverloading(int x , int y){
		 int z;
		System.out.println(z=x+y);
		
	}
}
