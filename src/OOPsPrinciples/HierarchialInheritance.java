package OOPsPrinciples;

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Child1 c1= new Child1();
		c1.show();
		c1.display();
//		c1.print();
		
		Child2 c2 = new Child2();
		c2.show();
		c2.print();
		

	}

}

class Parent{
	
	void show(){
		System.out.println("This is common code");
		
	}
	
}


class Child1 extends Parent{
	
	void display(){
		System.out.println("This is child1 code");
		
	}
}

class Child2 extends Parent{
	
	void print(){
		System.out.println("This is child2 code");
		
	}

	
}

