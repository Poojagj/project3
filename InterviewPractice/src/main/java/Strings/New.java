package Strings;

public class New {

	public static void main(String[] args) {
		String s = "Java Program";
		
		String [] array=s.split(" ");
		for(String a:array)
		{
		for(int i =a.length()-1; i>=0; i--)
		{
			System.out.print(a.charAt(i));

		}
		System.out.print(" ");
		}
		

	}

}
