import java.util.Scanner;

class CreateAndPrintJaggedOrRaggedMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the first dimension (no. of rows) : ");
		int rows = kb.nextInt();

		int m[][] = new int[rows][];

		for(int i=0;i<m.length;i++)
		{
			System.out.printf("\nEnter the second dimension (no. of columns) you want in %dth row : ",i+1);

			int cols = kb.nextInt();

			m[i] = new int[cols];

			System.out.print("\nEnter "+cols+" elements into the "+(i+1)+"th row : ");
			
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = kb.nextInt();
			}
		}	

		System.out.println("\nThe Matrix is :\n");

		// for(int i=0;i<m.length;i++)
		// {
		// 	for(int j=0;j<m[i].length;j++)
		// 	{
		// 		System.out.print(m[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }

		for(int r[]:m)
		{
			for(int val:r)
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
}