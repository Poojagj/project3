package keywords;

public class finalMethod {

	public static void main(String[] args) {
		
		CustomerData cd = new BankPersonel();
		cd.name();
		cd.address();
		cd.bankAccountDetails();
		
	}
	
	

}
class CustomerData{
	
	public void name(){
		
		String n="John";
		
		System.out.println(n);
	}
	
	
	public void address(){
		
		String add="xyz city , usa";
		
		System.out.println(add);
		
	}
	
	final void bankAccountDetails(){
		
		String accN= "NYB7465638957";
		int atmPin = 8898;
		
		System.out.println(accN+""+atmPin);
	}
	
}

class BankPersonel extends CustomerData{
	
       public void name(){
		
		String n="John";
		
		System.out.println(n);
	}
	
	
	public void address(){
		
		String add="xyz city , usa";
		
		System.out.println(add);
		
	}
	
//       void bankAccountDetails(){
//		
//		String accN= "NYB7465638957";
//		int atmPin = 8898;
//		
//		System.out.println(accN+""+atmPin);
//	}
	
	
}