package week2.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a Software tester";

		// assigning string to string array
		String[] str = test.split(" ");

		// iterating characters using for loop
		for (int i = 0; i < str.length; i++) {

			if (i % 2 == 1) { // checking it is even position word using Modulous operator

				StringBuilder sb = new StringBuilder(str[i]);
				str[i] = sb.reverse().toString();
				System.out.println(str[i]);
			} else {
				System.out.println(str[i]);
			}

		}

	}
}
