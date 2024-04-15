package OOPsPrinciples;

// 1.	WAP to access private variable out side the class using getter and setter method 

public class encapsulation {

	public static void main(String[] args) {
		encapsulation2 e = new encapsulation2();
		e.setValue(100);
		System.out.println(e.getValue());
	
	
	}

}

 class encapsulation2{
	 
	private int num; // data hidden
	
	public void setValue(int a) {
		num=a;
	}
	
	public int getValue() {
		return num;
	}
	
}
