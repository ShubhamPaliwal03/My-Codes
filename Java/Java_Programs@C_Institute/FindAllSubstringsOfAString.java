import java.util.Scanner;

class FindAllSubstringsOfAString
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		System.out.println("\nAll the possible substrings of given string are as follows :\n");

		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(s.charAt(k));
				}

				System.out.println();
			}

			System.out.println();
		}
	}
}