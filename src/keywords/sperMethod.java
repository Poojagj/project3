package keywords;

public class sperMethod {

	public static void main(String[] args) {
	
		Animals b = new Cat();
		b.eat();
	}

}
class Animals {

	void eat(){

		System.out.println("this is eat method of Animals class");
	}
	
}

class Cat extends Animals{

	void eat(){
		
		super.eat();
		System.out.println("this is eat method of Cat class");

	}
}