package keywords;

public class thisConstructor {

	public static void main(String[] args) {
//		thisConstructor tc =new thisConstructor();
		thisConstructor tc1 = new thisConstructor(200);
	
	}
	
	thisConstructor(){
		
		System.out.println("default constructor");
	}

	thisConstructor(int a){
		this();
		System.out.println("parametrized constructor taking parameter a: "+a);
		
	}
	
	
}
