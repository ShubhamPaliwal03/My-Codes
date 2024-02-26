import java.util.Scanner; 

class rotateAMatrixBy90DegreesNTimes
{
	public static int[][] getRotatedMatrix(int[][] mat)
	{
		int[][] rotated = new int[mat[0].length][mat.length];

		int r = 0, c = 0;

		for(int j = 0; j < mat[0].length; j++)
		{
			int i = mat.length - 1;

			c = 0;

			while(i >= 0)
			{
				rotated[r][c++] = mat[i--][j];
			}

			r++;
		}

		return rotated;
	}

	public static int[][] rotateMatrixNTimes(int[][] mat, int times)
	{
		for(int i = 1; i <= times; i++)
		{
			mat = getRotatedMatrix(mat);
		}

		return mat;
	}

	public static int[][] createMatrix(int rows, int cols)
	{
		System.out.println("\nEnter "+rows*cols+" elements into the matrix of order "+rows+"x"+cols+"\n");

		Scanner kb = new Scanner(System.in);

		int[][] mat = new int[rows][cols];

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

		System.out.print("\nEnter the number of times you want to rotate the matrix by 90 degrees : ");

		int times = kb.nextInt();

		times = times % 4; // reducing the unnecessary calculations by replacing times by the remainder of times by 4, to reduce overhead

		int[][] rotated = rotateMatrixNTimes(mat, times);

		System.out.println("\nThe Matrix Rotated "+times+" times by 90 Degrees (ie.,"+(90*times)+" degrees) is as follows :\n");

		for(int[] row : rotated)
		{
			for(int val : row)
			{
				System.out.print(val+" ");
			}

			System.out.println();
		}
	}
}