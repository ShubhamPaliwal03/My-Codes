import java.util.Scanner;

class FindPermutationOfSubstringInAString
{
	public static int howManyPermutations(String str, String substr)
	{
		// create an integer array to store the frequency of the elements in the string

		int[] str_freq = new int[26];

		for(int i = 0; i < str.length(); i++)
		{
			str_freq[str.charAt(i) - 'a']++;
		}

		// create an integer array to store the frequency of the elements in the substring

		int[] substr_freq = new int[26];

		for(int i = 0; i < substr.length(); i++)
		{
			substr_freq[substr.charAt(i) - 'a']++;
		}

		int characters_matched = 0;

		for(int i = 0; i < substr.length(); i++)
		{
			// check if the frequency of the particular character in the string is greater than or equal to the character in the substring

			if(str_freq[substr.charAt(i) - 'a'] > substr_freq[substr.charAt(i) - 'a'])
			{
				characters_matched += (str_freq[substr.charAt(i) - 'a'] - substr_freq[substr.charAt(i) - 'a']);
			}
			else if(str_freq[substr.charAt(i) - 'a'] == substr_freq[substr.charAt(i) - 'a'])
			{
				characters_matched++;
			}
		}

		// System.out.println(characters_matched);

		// check if the number of characters matched, are equal to the number of characters in the substring

		if(characters_matched == substr.length())
		{
			System.out.println(characters_matched);

			if(characters_matched % substr.length() == 0)
			{
				return characters_matched / substr.length();
			}
		}

		return -1;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a String : ");

		String str = kb.nextLine().toLowerCase();

		System.out.print("\nEnter a Substring : ");

		String substr = kb.nextLine().toLowerCase();

		int permutations = howManyPermutations(str, substr);

		if(permutations != -1)
		{
			System.out.print("\nThe Substring '"+substr+"' is a Valid Permutation of the given string '"+str+"', and "+permutations+" Permutations Exist");
		}
		else
		{
			System.out.print("\nThe Substring '"+substr+"' is Not a Valid Permutation of the given string '"+str+"'");
		}
	}	
}