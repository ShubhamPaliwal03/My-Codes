import java.util.Scanner;

class TransposeOf2DMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of rows in the matrix : ");
		int rows = kb.nextInt();

		System.out.print("\nEnter the no. of columns in the matrix : ");
		int cols = kb.nextInt();

		int mat[][] = new int[rows][cols];

		System.out.println("\nEnter the values in the matrix of "+rows+" x "+cols+":\n");

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		System.out.println("\nThe Transpose of the matrix entered is :\n");

		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[j][i]+"\t");	
			}
			System.out.println();
		}

	}
}