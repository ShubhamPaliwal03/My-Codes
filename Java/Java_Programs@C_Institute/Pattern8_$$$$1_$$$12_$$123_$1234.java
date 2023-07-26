class Pattern8_$$$$1_$$$12_$$123_$1234
{
	public static void main(String args[])
	{
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}