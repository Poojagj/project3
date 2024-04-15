package keywords;

public class thisKW {

	public static void main(String[] args) {
		
		thisKW t = new thisKW(200);
		t.show();
	}
	
	int a;
	
	thisKW(int a){
		
		this.a=a;
//	a=a;	
		
	}
	
	void show(){
		
		System.out.println(a);
	}

}
