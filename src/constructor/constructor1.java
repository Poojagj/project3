package constructor;

public class constructor1 {
	
	int a;
	String s;
	boolean b;
	
	 constructor1(){
		 
		a=10;
		s="constructor";
		b=false;
		
	}
	
	void show(){
		a=100;
		s="Java";
		b=true;
		
		System.out.println(a+ " " +s+ " "+b);
	}

	public static void main(String[] args) {
		
		constructor1 c = new constructor1();
		c.show();

	}

}
