package exceptionHandling;

public class trowKW {

	public static void main(String[] args) throws Exception     {
	     
		int age=2;
		
			if(age<18){
//				try{
				throw new Exception("Ineligible to drive");
//				}
//				catch(Exception e){
					
//					System.out.println("Exception occurred");
//				}
			}
			
			else{
				
				System.out.println("Eligible to drive. Drive Safely");
				
				
			}
		

	}

}
