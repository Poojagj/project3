package exceptionHandling;

public class tryCatchBlock {

	public static void main(String[] args) {
	
		tryCatchBlock tce = new tryCatchBlock();
//		tce.AEexception(10 , 10);
//		tce.NPexception(null);
//		tce.multipleCatchBlock(null);
		tce.finallyBlock(20, 0);
		
	}
	
	void AEexception(int a , int b){
		
		try{
			
			int c=a/b;
			System.out.println(c);
			} 
			catch(ArithmeticException ae){
				System.out.println("Arithmetic  Exception Occured");	
			}
		
	}
	
	void NPexception(String s){
	
             try{
	           System.out.println(s.toUpperCase());
			     } 
			 catch(Exception e){
				System.out.println("NullPointer Exception Occured");		
			}
	}
	
	void multipleCatchBlock(String s){
		
        try{
          System.out.println(s.toUpperCase());
		     } 
		 catch(ArithmeticException ae){
			System.out.println("ArithmeticException Occured");		
		}
        catch(NullPointerException npe){
			System.out.println("NullPointer Exception Occured");		
		}
        catch(Exception e){
			System.out.println(" Exception Occured");		
		}
}
	
	void finallyBlock(int a , int b){
		
           try{
		          int c=a/b;
		          System.out.println(c);
	           } 
          catch(Exception ArithmeticException){
	
				System.out.println("Arithmetic  Exception Occured");	
			   }
          finally{
	
	         System.out.println("finally block executed");	
	
                 }
		
		
	}

}
