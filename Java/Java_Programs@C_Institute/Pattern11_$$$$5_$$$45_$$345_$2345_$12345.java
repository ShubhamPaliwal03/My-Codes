class Pattern11_$$$$5_$$$45_$$345_$2345_$12345
{
	public static void main(String args[])
	{
		int i,j;

		for(i=5;i>=1;i--)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=5;j++)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}