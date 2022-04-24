package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// Assigning Values to Variables
		String text1 = "stops";
		String text2 = "potss";

		// Checking length of String and assigning to variable
		int length1 = text1.length();
		int length2 = text2.length();

		// if both string length not matches then it will print below statement
		if (length1 != length2) {
			System.out.println(text1 + " and " + text2 + " are not Anagram");
		}

		else {

			// if length matches then assign string to character array
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();

			// Sort both the character Array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if both Character Array matched then print below statement
			if (Arrays.equals(charArray1, charArray2)) {
				System.out.println(text1 + " and " + text2 + " are Anagram");
			}

			else { // else print below statement
				System.out.println(text1 + " and " + text2 + " are not Anagram");
			}

		}

	}

}
