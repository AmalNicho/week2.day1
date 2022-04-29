package week2.day1.Assignment;

public class CharOccurance1 {
	public static void main(String[] args) {

		String str = "welcome to chennai";

		int j = 0;

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] == 'e') {
				j++;
			}

		}

		System.out.println("The letter e is available "+j+ " in this sentence");
	}

}
