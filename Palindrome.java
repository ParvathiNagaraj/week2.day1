package week2.day1;

public class Palindrome {

	public static void main(String[] args) {

		// Assigning value to Variable
		String Str1 = "Madam";

		// getting string length and assigning to Variable
		int length = Str1.length();

		String revvalue = "";

		// iterating String length usng for loop
		for (int i = (length - 1); i >= 0; i--) {

			revvalue = revvalue + Str1.charAt(i); // adding i count to revvalue
		}

		if (revvalue.equalsIgnoreCase(Str1)) { // if revvalue and Str1 value matched then print below statement
			System.out.println("The given String " + Str1 + " is Palindrome");
		}

		else { // else print below statement
			System.out.println("The given String " + Str1 + " is not Palindrome");
		}
	}

}
