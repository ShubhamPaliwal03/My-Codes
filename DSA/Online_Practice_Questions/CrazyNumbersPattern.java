public class CrazyNumbersPattern
{
	public static void main(String[] args)
	{
		// Write your code here.

		int i = 1, k = 1, n = 4;
		
		while(i<=n)
		{
			int j = n;

			while(j>i) // to print spaces
			{
				System.out.print(" ");

				j--;
			}

			while(j>=1)
			{
				System.out.print(k);

				j--;

				k = k==9 ? 1 : k+1;
			}

			System.out.println();

			i++;
		}
	}
}