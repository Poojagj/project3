package OOPsPrinciples;

public class simpleInheritance {

	public static void main(String[] args) {
		
        Engineer E1 = new Engineer();
        
        System.out.println("Salary : " + E1.salary + " & bonus : " + E1.bonus);
	}

}
         class Employee {
               int salary = 100000;
        }
  

        class Engineer extends Employee {
        	
              int bonus = 20000;
              }
  
