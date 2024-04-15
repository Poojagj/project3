package StringPrograms;



public class reverseEachWord {

	public static void main(String[] args) {
		reverseEachWord rev = new reverseEachWord();
		
		rev.method1();
	
}
	
	void method1(){
		
        String s="Java Basics Class";
		
		String reverseString="";
		
		String[] words=s.split(" ");
		
		for(String w:words){
			
			String reverseWord="";
			
			for(int i = w.length()-1;i>=0;i--){
				
				reverseWord = reverseWord + w.charAt(i);
				
			}
			reverseString = reverseString + reverseWord+" ";
			
		}
		
		System.out.println(reverseString);
	}
	
	void method2(){
		
		 String s="Java Basics Class";
			
			String reverseWord="";
			
			String[] words=s.split(" ");
			
			for(String w:words){
			
				
				StringBuilder sb = new StringBuilder(w);
				sb.reverse();
				reverseWord=reverseWord+sb.toString()+" ";

				
			}
			
			System.out.println(reverseWord);
		
		
	}
	
}

