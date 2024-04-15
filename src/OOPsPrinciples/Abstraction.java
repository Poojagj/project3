package OOPsPrinciples;

public class Abstraction {
	
	
	public static void main(String[] args) {
		Animal a = new Cat();
        a.eat();
		
		Animal d = new Dog();
		d.eat();

		Cat c = new Cat();
		c.eat();
		
	}

}

abstract class Animal{
	
	Animal(){
		
		System.out.println("All Animal eat food");
	}
	 
	 public abstract void eat();
	
}
 
 class Cat extends Animal{
	 
	 public void eat(){
		 
		 System.out.println("Cat Food");
		 
	 }
	 
 }
 
 class Dog extends Animal{
 public void eat(){
		 
		 System.out.println("Dog Food");
		 
	 }
	 
 }
