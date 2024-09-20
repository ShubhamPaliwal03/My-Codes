import java.util.Scanner;

class PrintAllTheSubstringsOfAString
{
	static void PrintAllSubstrings(String str)
	{
		int n = str.length();

		System.out.println("\nThe Substrings of the given string are as follows :\n");

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(str.charAt(k)+" ");
				}

				System.out.println();
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the string : ");

		String s = kb.nextLine();

		PrintAllSubstrings(s);
	}
}