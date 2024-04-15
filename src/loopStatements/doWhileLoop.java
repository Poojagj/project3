package loopStatements;

public class doWhileLoop {

	public static void main(String[] args) {
		doWhileLoop  dw = new doWhileLoop();
		dw.method1();

	}
	
	void method1(){
		
		// print hello 5 times using do while loop
		
		int i = 1;
		 
        do {
  
        	System.out.println("Hello");
 
            i++;
        }
 
        while (i > 6);
    }
	

}
