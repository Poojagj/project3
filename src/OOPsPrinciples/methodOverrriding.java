package OOPsPrinciples;

public class methodOverrriding {

	public static void main(String[] args) {
//		parent1 p = new parent1();
//		p.animal();
		
		parent1 c = new Child();
		c.animal();
	
	}

}
class parent1{
	
	 void animal(){
		
		System.out.println("I am parent class method Animal");
	}
}

class Child extends parent1{
	

	  void animal(){
		  
		super.animal();
		
		System.out.println("I am Child class method Animal");

	 }
	}
