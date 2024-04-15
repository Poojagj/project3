package String;

public class memory {
	
	
	 int data= 10;
	
	void add(int a, int b){
		
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		int s=35;
		System.out.println(s);
		
		memory m1 = new memory();
		m1.add(100, 200);
		
		memory m2 = new memory();
		m2.add(2, 3);
		
		System.out.println(m1.data);
		
	}

}
