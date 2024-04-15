package Strings;

public class Reverse {

	public static void main(String[] args) {
		String s = "Java Program";
		String[] words = s.split(" ");

		for (String w : words) {
			for (int i = w.length() - 1; i >= 0; i--) {

				System.out.print(w.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
