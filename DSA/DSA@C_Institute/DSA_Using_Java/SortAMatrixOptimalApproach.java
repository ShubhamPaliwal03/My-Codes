import java.util.Scanner;
import java.util.Arrays;

class SortAMatrixOptimalApproach
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of rows in the matrix : ");

		int m = kb.nextInt();

		System.out.print("\nEnter the no. of columns in the matrix : ");

		int n = kb.nextInt();

		// initializing the matrix

		int[][] mat = new int[m][n];

		System.out.println("\nEnter elements in the matrix of "+m+" x "+n+"\n");

		// taking the matrix as input

		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		// initializing an array of (m + n) size which will contain all the elements of the matrix

		int[] arr = new int[m*n];

		// transferring all the elements of the matrix into the array

		int k = 0;

		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				arr[k] = mat[i][j];

				k++;
			}
		}

		// sort the array

		Arrays.sort(arr);

		// feed the elements of the array back into the matrix

		k = 0;

		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mat[i][j] = arr[k];

				k++;
			}
		}

		// print the sorted matrix

		System.out.println("\nThe Sorted Matrix (in increasing order) is :\n");

		for(int[] row : mat)
		{
			for(int val : row)
			{
				System.out.print(val+" ");
			}

			System.out.println();
		}
	}
}