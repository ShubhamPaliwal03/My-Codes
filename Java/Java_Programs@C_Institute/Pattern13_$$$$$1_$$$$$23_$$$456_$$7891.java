class Pattern13_$$$$$1_$$$$$23_$$$456_$$7891
{
	public static void main(String args[])
	{
		int i,j,k=1;

		for(i=1;i<=6;i++)
		{
			for(j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(k);

				k = k==9 ? 1 : ++k;
				// we need to use pre-increment as it first increases the value by 1 and then assigns it to the variable.
				// we cannot use post-increment as it first assigns the value to the variable and then increases the value by 1.

				// k = k==9 ? 1 : k+1;

				// Error, k = k==9 ? 1 : k+=1;
				// as we cannot assign value to a variable inside the ternary/conditional operator's condition or statement.

				// if(k==9)
				// {
				// 	k=1;
				// }
				// else
				// {
				// 	k++;
				// }
			}

			System.out.println();
		}
	}
}