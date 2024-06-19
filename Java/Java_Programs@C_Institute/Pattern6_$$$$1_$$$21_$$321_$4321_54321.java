class Pattern6_$$$$1_$$$21_$$321_$4321_54321
{
	public static void main(String args[])
	{
		int i,j;

		for(i=1;i<=5;i++)// outer loop for repeating the below inner loops 5 times
		{
			for(j=5;j>i;j--)// for printing spaces
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)// for printing digits
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}