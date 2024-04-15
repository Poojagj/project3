package loopStatements;

public class whileLoop {

	public static void main(String[] args) {
		whileLoop wl = new whileLoop();
//		wl.method1();
//		wl.method();
//		wl.method2();
		wl.method3();
	}
	
	void method1(){
		
		//1.print “Hello” 5 times.
		
		 int i = 1;
		 while (i <= 10) {
			  System.out.println("Hello");
	 
	            i++;
		 }}
	
	
	void method2(){
		//2.print “ * ” 5 times. 
		 int i = 1;
		 while (i < 6) {
			  System.out.println("*");
	 
	            i++;
	}}
	
	
	void method(){
		// print 1-10
		
		int i =1;
		while(i<=10){
			System.out.println(i);
			
			i++;
			
		}
		
	}
	void method3(){
		//3.find the sum of numbers from 1 to 10
		
		int i=1;
		int sum=0;
		
		while(i<=10){
			
			sum=sum+i;
			i++;
			
		}
		System.out.println("The sum of all numbers from 1 to 10 :"+sum);
	}

}
