import java.util.Scanner;

public class ProblemBMaximumMultipleSum
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			int max_sum = Integer.MIN_VALUE;

			int optimal_x = 2;

			for(int x = 2; x <= n; x++)
			{
				int k = n / x;

				int sum = (int)((k / 2.0) * (x + (k * x)));

				if(sum > max_sum)
				{
					max_sum = sum;

					optimal_x = x;
				}
			}

			System.out.println(optimal_x);
		}
	}
}