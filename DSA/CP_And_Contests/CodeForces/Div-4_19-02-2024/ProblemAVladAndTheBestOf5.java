import java.util.Scanner;

public class ProblemAVladAndTheBestOf5
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			String s = kb.next();

			int a_count = 0, b_count = 0;
			
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) == 'A')
				{
					a_count++;
				}
				else
				{
					b_count++;
				}
			}

			if(a_count > b_count)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("B");
			}
		}
	}	
}