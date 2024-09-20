import java.util.Scanner;

public class ProblemAYougurtSale
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			int a = kb.nextInt();

			int b = kb.nextInt();

			if(b < a * 2)
			{
				int products_with_price_b = (int)Math.floor(n / 2);

				int products_with_price_a = n  - (products_with_price_b * 2);

				int total_a = products_with_price_a * a;

				int total_b = products_with_price_b * b;

				System.out.println(total_a + total_b);
			}
			else
			{
				System.out.println(n * a);
			}
		}
	}
}