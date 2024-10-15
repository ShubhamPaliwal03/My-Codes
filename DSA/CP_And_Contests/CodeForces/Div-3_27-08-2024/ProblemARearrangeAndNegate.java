import java.util.Scanner;

public class ProblemARearrangeAndNegate
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			int max_sum = 0;

			for(int i = 1; i <= n; i++)
			{
				max_sum += Math.abs(kb.nextInt());
			}

			System.out.println(max_sum);
		}
	}
}