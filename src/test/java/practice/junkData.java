package practice;

public class junkData {

	public static void main(String[] args) {
		
		String s ="%$%$&^%&*^*(&)This is my Java Class(*(_)(*(&*^&^$^&$^&%&*^(**)((()(*(*^&$%#$%#$%@#!#@#$#%^$";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s1);

	}

}
