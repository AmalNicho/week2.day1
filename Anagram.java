package week2.day1.Assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String a = "stops";
		String b = "potss";

		if (a.length() == b.length()) {
			char[] charArray = a.toCharArray();
			char[] charArray2 = b.toCharArray();

			Arrays.sort(charArray2);
			Arrays.sort(charArray);

			if (Arrays.equals(charArray, charArray2)) {
				System.out.println("Both String is Anagaram");
			}

			else {
				System.out.println("Both String is not Anagaram");
			}
		}

		else {
			System.out.println("Both String is not Anagaram");

		}

	}

}
