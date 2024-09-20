import java.util.Scanner;

class CreateAndPrintMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the first dimension (no. of rows) : ");
		int rows = kb.nextInt();

		System.out.print("\nEnter the second dimension (no. of columns) : ");
		int cols = kb.nextInt();

		int m[][] = new int[rows][cols];

		System.out.println("\nEnter values in a matrix of "+rows+" x "+cols+" : "+"\n");

		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j] = kb.nextInt();
			}
		}

		System.out.println("\nThe Matrix is :\n\n");

		// for(int i=0;i<m.length;i++) // you can also use rows and cols as a condition for the loops here but it will cause problems in jagged/ragged arrays
		// {
		// 	for(int j=0;j<m[i].length;j++)
		// 	{
		// 		System.out.print(m[i][j]+"\t");
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