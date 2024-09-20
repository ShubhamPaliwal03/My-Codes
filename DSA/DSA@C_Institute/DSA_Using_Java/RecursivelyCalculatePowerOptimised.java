import java.util.Scanner;

class RecursivelyCalculatePowerOptimised
{
	static int power(int a, int b)
	{
		if(b == 0)
		{
			return 1;
		}

		int apbu2 = power(a, b / 2);

		int apb = apbu2 * apbu2;

		if(b % 2 == 1)
		{
			apbu2 = power(a, (b - 1) / 2);

			apb = apbu2 * apbu2 * a;

			return apb;
		}

		// else
		// {
		// 	int apbu2 = power(a, b / 2);

		// 	int apb = apbu2 * apbu2;

		// 	return apb;
		// }

		return apb;
	}

	public static void main(String[] args)
	{
		// Scanner kb = new Scanner(System.in);

		System.out.println(power(2, 3));
	}
}