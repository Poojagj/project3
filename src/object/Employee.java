package object;

public class Employee {
	
	
public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id=1;
		e1.salary=10000;
		e1.department="Marketing";
		e1.manager="John";
		e1.show();
		
		Employee e2 = new Employee();
		e2.id=2;
		e2.salary=20000;
		e2.department="Sales";
		e2.manager="Albert";
		e2.show();
		
		

	}
	
	int id;
	int salary;
	String department;
	String manager;
	
	void show(){
		
		System.out.println(id);
		System.out.println(salary);
		System.out.println(department);
		System.out.println(manager);
		System.out.println("");
	}

	

}
