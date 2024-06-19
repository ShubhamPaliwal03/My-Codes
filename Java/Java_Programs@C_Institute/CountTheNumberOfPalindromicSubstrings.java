import java.util.Scanner;

class CountTheNumberOfPalindromicSubstrings
{
	public static boolean isPalindrome(String s)
	{
		for(int i = 0, j = s.length() - 1; i < j; i++, j--)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
		}

		return true;
	}

	public static int countNumberOfPalindromicSubstrings(String s)
	{
		int count = 0;

		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				if(j - i > 0)
				{
					if(isPalindrome(s.substring(i, j+1)))
					{
						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		System.out.print("\nThe number of palindromic substrings in the string '"+s+"' are : "+countNumberOfPalindromicSubstrings(s));
	}
}