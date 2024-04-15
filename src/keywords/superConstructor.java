package keywords;

public class superConstructor {

	public static void main(String[] args) {
		
		Ram r = new Ram();
	}

}

 class Employee {
	
	
	Employee(){
		
		System.out.println("This is default constructor of Employee class");
	}
	
	Employee(int a){
		
		System.out.println("This is parameterised Constructor on Employee Class taking parameter : " +a);
	}
}
 class Ram extends Employee{
	 
	 
	 Ram(){
		 
//		 super();
		 super(200);

		 System.out.println("This is default constructor of Ram Class");
	 }
 }