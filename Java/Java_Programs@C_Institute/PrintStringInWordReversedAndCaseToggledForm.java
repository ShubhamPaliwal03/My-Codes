import java.util.Scanner;

class PrintStringInWordReversedAndCaseToggledForm
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String s = kb.nextLine();

		int n = s.length();

		// "My name is Shubham" => "Ym EMAN SI MAHBUHs"

		int i = 0;

		while(i < n)
		{
			if(s.charAt(i) == ' ')
			{
				int j = i - 1;

				while(j >= 0 && s.charAt(j) != ' ')
				{
					char ch = s.charAt(j);

					// toggle the case

					if(ch >= 'a' && ch <= 'z')
					{
						ch = (char)(ch - 32);
					}
					else if(ch >= 'A' && ch <= 'Z')
					{
						ch = (char)(ch + 32);
					}

					System.out.print(ch);

					j--;
				}

				System.out.print(" ");
			}
			else if(i == n - 1)
			{
				int j = i;

				while(s.charAt(j) != ' ')
				{
					char ch = s.charAt(j);

					// toggle the case

					if(ch >= 'a' && ch <= 'z')
					{
						ch = (char)(ch - 32);
					}
					else if(ch >= 'A' && ch <= 'Z')
					{
						ch = (char)(ch + 32);
					}

					System.out.print(ch);

					j--;
				}
			}

			i++;
		}
	}
}