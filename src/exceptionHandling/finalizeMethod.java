package exceptionHandling;

public class finalizeMethod {

	public static void main(String[] args) throws Throwable {
		finalizeMethod fm = new finalizeMethod();
		fm.finalize();
	}
	
	public void finalize() throws Throwable{
		 try{
				int a=1000 , b=0;
				int c=a/b;
				System.out.println(c);
				} 
				catch(ArithmeticException ae){
					System.out.println("Arithmetic  Exception Occured");	
				} finally{
					
			         System.out.println("finally block executed");	
			         super.finalize();
			}
	}

}
