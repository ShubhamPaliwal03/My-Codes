import java.util.Scanner;

public class ProblemAThornsAndCoins
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			String s = kb.next();

			int coins = 0;

			for(int i = 0; i < s.length();)
			{
				if(i+1 < s.length() && s.charAt(i+1) == '@')
				{
					coins++;

					i += 1;
				}
				else if(i+2 < s.length() && s.charAt(i+2) == '@')
				{
					coins++;

					i += 2;
				}
				else if(i+1 < s.length() && s.charAt(i+1) == '.')
				{
					i += 1;
				}
				else if(i+2 < s.length() && s.charAt(i+2) == '.')
				{
					i += 2;
				}
				else
				{
					break;
				}
			}

			System.out.println(coins);
		}
	}	
}