package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int a = 0;
		
		//assigning String to character array
		char[] charArray = str.toCharArray();
		
		// iterating each character using for loop
		for (int i = 0; i < charArray.length; i++) {

			//checking all character matches with given condition
			if (charArray[i] == 'e') {

				//if matched --> adding count 1 
				a = a + 1;
			}
		}

		System.out.println("The Number of occurence of letter e is " + a);

	}

}
