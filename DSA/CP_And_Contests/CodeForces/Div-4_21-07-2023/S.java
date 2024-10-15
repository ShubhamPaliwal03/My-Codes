// ToMyCritics

import java.util.Scanner;

public class S
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		int count = 0;

		while(count!=t)
		{
			int a = kb.nextInt();

			int b = kb.nextInt();

			int c = kb.nextInt();

			if(a+b>=10)
			{
				System.out.println("YES");
			}
			else if(a+c>=10)
			{
				System.out.println("YES");
			}
			else if(b+c>=10)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			count++;
		}
	}
}