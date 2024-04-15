package loopStatements;

public class starPatterns {

	public static void main(String[] args) {
		starPatterns sp = new starPatterns();
		sp.ascTriangle();
		sp.dscTriangle();

	}

	void ascTriangle(){
		
		for (int i = 0; i < 5; i++) {
			
			for(int j=0;j<=i ;j++){
            System.out.print("*");
			}
			System.out.println("");
        }
		System.out.println("");
	}
	
	void dscTriangle(){
          for (int i = 4; i >= 0; i--) {
			
			for(int j=0;j<=i ;j++){
            System.out.print("*");
			}
			System.out.println("");
        }
	}
}
