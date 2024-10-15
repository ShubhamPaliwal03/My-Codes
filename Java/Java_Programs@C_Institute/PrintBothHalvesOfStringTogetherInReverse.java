import java.util.Scanner;

class PrintBothHalvesOfStringTogetherInReverse
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		System.out.print("\nThe string with its both halves reversed is as follows : ");

		int length = s.length();

		// print the first half in reverse

		int mid = length / 2;

		for(int i = mid - 1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}

		// print the second half in reverse

		for(int i = length - 1; i >= mid; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}