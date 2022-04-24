package week2.day1;

public class FindTypes {
	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		// Assigning String to char array
		char[] charArray = test.toCharArray();

		// iterating each character using for loop
		for (int i = 0; i < charArray.length; i++) {

			// If character is letter then adding +1 count to letter variable.
			if (Character.isLetter(charArray[i])) {
				letter++;
			}

			else if (Character.isDigit(charArray[i])) {
				// If character is Number then adding +1 count to num variable.
				num++;
			}

			else if (Character.isSpaceChar(charArray[i])) {
				// If character is Space then adding +1 count to space variable.
				space++;
			}

			else {

				// If No condition matched then adding +1 count to speacialChar variable.
				specialChar++;
			}

		}

		System.out.println("The Sentence is " + test);
		System.out.println("No.of.letter: " + letter);
		System.out.println("No.of.Numbers: " + num);
		System.out.println("No.of.Spaces: " + space);
		System.out.println("No.of.SpecialCharacters: " + specialChar);
	}

}
