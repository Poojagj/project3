package Strings;

public class repetition {

	public static void main(String[] args) {

		String s = "My Java Program";

		char array[] = s.toCharArray();

		int count = 0;

		for (int i = 0; i < array.length - 1; i++) {

			count = 1;

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j] && array[i] != ' ') {
					System.out.println(array[i]);
					count++;
					break;
				}

			}

		}

	}
}
