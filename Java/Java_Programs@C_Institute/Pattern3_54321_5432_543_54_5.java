class Pattern3_54321_5432_543_54_5
{
	public static void main(String args[])
	{
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}