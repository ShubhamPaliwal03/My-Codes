import java.util.Scanner;

class rotateAMatrixBy90Degrees
{
	public static void printArray(int[][] mat)
	{
		for(int[] rows : mat)
		{
			for(int val : rows)
			{
				System.out.print(val+" ");
			}

			System.out.println();
		}
	}

	public static int[][] rotateArray(int[][] mat)
	{
		int rows = mat.length;

		int cols = mat[0].length;

		// create a matrix for storing the rotated array, having rows in cols in opposite order

		int[][] rotated = new int[cols][rows];

		int r = 0, c = 0;

		int j = 0;

		for(int col = 0; col < cols; col++)
		{
			int i = rows - 1;

			c = 0;

			while(i >= 0)
			{
				rotated[r][c] = mat[i][j];

				c++;

				i--;
			}

			j++;

			r++;
		}

		return rotated;
	}

	public static int[][] createMatrix(int rows, int cols)
	{
		Scanner kb = new Scanner(System.in);

		int[][] mat = new int[rows][cols];

		System.out.println("\nEnter "+rows*cols+" elements into the matrix of order "+rows+"x"+cols+"\n");

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		return mat;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the number of rows in the matrix : ");

		int rows = kb.nextInt();

		System.out.print("\nEnter the number of cols in the matrix : ");

		int cols = kb.nextInt();

		int[][] mat = createMatrix(rows, cols);

		int[][] rotatedArray = rotateArray(mat);	

		System.out.println("\nThe Rotated Array is :\n");

		printArray(rotatedArray);
	}
}