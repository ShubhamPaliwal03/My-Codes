import java.util.Scanner;

class PrintDiagonalELementsOfAMatrixIfExist
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the number of rows in the matrix : ");
		int rows = kb.nextInt();

		System.out.print("\nEnter the number of columns in the matrix : ");
		int cols = kb.nextInt();

		if(rows!=cols)
		{
			System.out.print("\nMatrix's Dimensions are Not of a Square Matrix, So No Diagonal Elements are Possible!");
		}
		else
		{
			int mat[][] = new int[rows][cols];	

			System.out.println("\nEnter a matrix of "+rows+" x "+cols+" :\n");

			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					mat[i][j]=kb.nextInt();
				}
			}

			System.out.println("\nThe Diagonal Elements of the matrix in matrix form are :\n");

			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<mat[i].length;j++)
				{
					if(i==j)
					{
						System.out.print(mat[i][j]+"\t");
					}
					else
					{
						System.out.print("\t");
					}
				}
				System.out.println();
			}

			// we can optimise the above code from O(N^2) to O(N) for printing the diagonals by just running a single loop of i from 0 upto the length of the matrix
			// and printing the value of mat[i][i], but that won't provide us the pattern of diagonal elements in matrix form.

			// for(int i=0;i<mat.length;i++)
			// {
			// 	System.out.print(mat[i][i]+"\t");
			// }
		}
	}
}