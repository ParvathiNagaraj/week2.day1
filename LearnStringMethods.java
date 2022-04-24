package week2.day1;

public class LearnStringMethods {

	public static void main(String[] args) {
		String text1 = "testleaf";
		int a = 0;

		char[] charAt = text1.toCharArray();
		for (int i = 0; i < charAt.length; i++) {

			if (charAt[i] == 'e') {

				a = a + 1;

			}
		}

		System.out.println("First Question --> No. of letter e in word " + text1 + " = " + a);
		System.out.println("===================================");

		String text2 = " Testleaf is situated in twin towers teynampet";

		String[] split = text2.split(" ");
		System.out.println("Second Question --> Words starts with T ot t");
		for (int i = 0; i < split.length; i++) {
			if (split[i].startsWith("T") || split[i].startsWith("t")) {
				System.out.println(split[i]);

			}
		}

	}

}
