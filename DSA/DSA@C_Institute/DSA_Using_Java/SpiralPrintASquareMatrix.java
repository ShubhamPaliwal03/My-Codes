import java.util.Scanner;

class SpiralPrintASquareMatrix
{
	Scanner kb = new Scanner(System.in);

	public static void printInSpiralPattern(int[][] mat)
	{
		int cells_traversed = 0;

		int c = 0, r = 0, n = mat.length;

		int x = 0, y = n;

		System.out.print("\nThe Array In Spiral Order is as follows : ");

		while(cells_traversed < n * n)
		{
			// left to right

			while(c < y)
			{
				System.out.print(mat[r][c]+" ");

				c++;

				cells_traversed++;
			}

			c--;

			// right to bottom

			r++;

			while(r < y)
			{
				System.out.print(mat[r][c]+" ");

				r++;

				cells_traversed++;
			}

			r--;

			// right to left

			c--;

			while(c >= x)
			{
				System.out.print(mat[r][c]+" ");

				c--;

				cells_traversed++;
			}

			c++;

			// top to bottom

			r--;

			while(r >= x+1)
			{
				System.out.print(mat[r][c]+" ");

				r--;

				cells_traversed++;
			}

			r++;

			c++;

			x++;

			y--;
		}
	}

	public static int[][] createMatrix(int n)
	{
		Scanner kb = new Scanner(System.in);

		int mat[][] = new int[n][n];

		System.out.print("\nEnter "+n*n+" elements into the matrix of "+n+"x"+n+" :\n\n");

		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		kb.close();

		return mat;
	}

	public static void main(String[] agrs)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the order of the square matrix (2 for 2x2) : ");

		int n = kb.nextInt();

		int[][] mat = createMatrix(n);

		printInSpiralPattern(mat);
	}
}