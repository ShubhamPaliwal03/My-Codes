import java.util.Scanner;

class RecursivelyCountNumberOfVowelsInAString {

	public static boolean isVowel(char ch) {

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}

	// public static int countVowelsInString(String s, int i, int vowel_count) {

	// 	if (i == s.length()) {

	// 		return vowel_count;
	// 	}

	// 	if (isVowel(s.charAt(i))) {

	// 		vowel_count++;
	// 	}

	// 	vowel_count = countVowelsInString(s, i + 1, vowel_count);

	// 	return vowel_count;
	// }

	public static int countVowelsInString(String s, int i, int vowel_count) {

		if (i == s.length()) return 0;

		return isVowel(s.charAt(i)) ? countVowelsInString(s, i + 1, vowel_count + 1) + 1 : countVowelsInString(s, i + 1, vowel_count);
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a String : ");

		String s = kb.nextLine();

		int vowel_count = countVowelsInString(s, 0, 0);

		System.out.print("\n"+s+" has "+vowel_count+" vowels...");
	}
}