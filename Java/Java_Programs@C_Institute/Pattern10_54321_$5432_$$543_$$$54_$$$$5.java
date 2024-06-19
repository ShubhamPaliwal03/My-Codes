class Pattern10_54321_$5432_$$543_$$$54_$$$$5
{
	public static void main(String args[])
	{
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}