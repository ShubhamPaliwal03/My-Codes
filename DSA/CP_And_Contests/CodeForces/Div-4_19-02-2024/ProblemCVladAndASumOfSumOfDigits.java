import java.util.Scanner;

public class ProblemCVladAndASumOfSumOfDigits
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			long sum = 0;

			for(int i = 1; i <= n; i++)
			{
				if(i < 10)
				{
					sum += i;
				}
				else
				{
					int num = i;

					while(num > 0)
					{
						long digit = num % 10;

						sum += digit;

						num /= 10;
					}
				}
			}

			System.out.println(sum);
		}
	}	
}