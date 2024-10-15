// Q1. int [] getMaxFromMatrix(int [][])

// The above function takes any matrix as argument and returns an array which contains the maximum value from every row.
// The function getMaxFromMatrix() must use a function int getMaxFromArray(int[]) which takes a 1d array as argument and return max.

import java.util.Scanner;

class TestQ1
{
	public static int[] getMaxFromMatrix(int[][] mat)
	{
		int[] maxes = new int[mat.length];

		for(int i = 0; i < mat.length; i++)
		{
			maxes[i] = getMaxFromArray(mat[i]);
		}

		return maxes;
	}

	public static int getMaxFromArray(int[] arr)
	{
		int max = arr[0];

		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args)
	{	
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the no. of rows in the matrix : ");

		int rows = kb.nextInt();

		System.out.print("\nEnter the no. of cols in the matrix : ");

		int cols = kb.nextInt();

		int[][] mat = new int[rows][cols];

		System.out.println("\nEnter the "+(rows*cols)+" elements into the matrix of order "+rows+"x"+cols+" :\n");

		for(int i = 0; i < rows; i++)		
		{
			for(int j = 0; j < cols; j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		int[] maxes = getMaxFromMatrix(mat);

		System.out.println("\nThe Rowwise maxes are as follows : ");

		for(int i = 0; i < maxes.length; i++)
		{
			System.out.println("\nMax of row "+(i+1)+" is : "+maxes[i]);
		}
	}
}