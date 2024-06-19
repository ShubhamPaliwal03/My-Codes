import java.util.Scanner;

class CheckIfAStringIsPalindrome
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

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		String result = isPalindrome(s) ? "\nThe string '"+s+"' is a palindrome!" : "\nThe string is not a palindrome!";

		System.out.print(result);
	}
}