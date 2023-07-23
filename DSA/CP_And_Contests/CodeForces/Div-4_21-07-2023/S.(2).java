// TenWordsOfWisdom

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
			int n = kb.nextInt();

			int max = 1;

			int res=0,i=0;

			int cnt = 0;

			while(cnt!=n)
			{
				i++;

				int a = kb.nextInt();

				int b = kb.nextInt();

				if(a<=10)
				{
					if(b>max)
					{
						max = b;

						res = i;
					}
				}

				cnt++;
			}

			System.out.println(res);

			count++;
		}
	}
}