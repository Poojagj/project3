package Strings;

public class New2 {

	public static void main(String[] args) {
		String s= "New Java Program";
		int count=0;
		for(int i =1;i<=s.length()-1;i++) {
			
			for(int j = i+1; j<=s.length()-1;j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
					break;
				}
				
			}
			
		}
		
		
	}

}
