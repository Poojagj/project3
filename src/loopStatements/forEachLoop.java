package loopStatements;

public class forEachLoop {

	public static void main(String[] args) {
		
		forEachLoop fe = new forEachLoop();
		
//		fe.method1();
		fe.method2();
	}
	
	void method1(){
		
		
		int arr[] = { 10, 50, 60, 80, 90 };
		  
        for (int a : arr)
  
            System.out.print(a + " ");

	}
	
	void method2(){
		
		int arr[] = { 10, 50, 60, 80, 90 };
		
		int sum=0;
		
		for(int a:arr){
			
			sum=sum+a;
		}
		
		System.out.println("The sum of given array elements is: "+sum);
		
		
	}


     
     
     
}
