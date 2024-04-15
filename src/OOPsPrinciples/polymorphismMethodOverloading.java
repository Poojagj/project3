package OOPsPrinciples;

public class polymorphismMethodOverloading {

	public static void main(String[] args) {
		polymorphismMethodOverloading pmo = new polymorphismMethodOverloading();
		pmo.add();
		pmo.add(30);
		pmo.add(100, 200);
		
	}
	
	void add(){
		
		int a =10 , b=20;
		int c= a+b;
		System.out.println(c);
		
	}
	
	void add(int a1){
		
		int b1=50;
		int c1=a1+b1;
		System.out.println(c1);
	}
	
	void add(int x2 , int y2){
		
		int z2= x2+y2;
		System.out.println(z2);
				
	}

}
