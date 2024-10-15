// Question: WAP to input a string and count how many palindromic substrings (Length>=2) exist in it.
// Example:
// Enter string: AAAAA

import java.util.Scanner;
import java.util.ArrayList;


class CountNoOfPalindromicSubstrings
{
	public static boolean isPalindromic(String s)
	{
		int i = 0, j = s.length() - 1;

		for(i = 0, j = s.length() - 1; i < j; i++, j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.next();

		int n = s.length();

		int count = 0;

		StringBuilder sb = new StringBuilder();

		// to store the palindromic substrings

		ArrayList<String> palindromic_substrings = new ArrayList<>();

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{	
				sb.delete(0, sb.length());

				for(int k = i; k <= j; k++)
				{
					sb.append(s.charAt(k));
				}

				if(sb.length() >= 2)
				{
					String string = sb.toString();

					if(isPalindromic(string))
					{
						palindromic_substrings.add(string);

						count++;
					}
				}
			}
		}

		System.out.println("\nThere Are "+count+" Palindromic Substrings In The String "+"'"+s+"'");

		if(count != 0)
		{
			System.out.println("\nThey are as follows:\n");

			for(String string : palindromic_substrings)
			{
				System.out.println(string);
			}

		}
	}
}