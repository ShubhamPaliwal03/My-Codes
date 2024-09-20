import java.util.Scanner;

class SortAMatrixON4
{
	public static void main(String args[])
	{
		int[][] mat = {{1, 3}, {9, 0}};

		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[0].length; j++)
			{
				for(int k = 0; k < mat.length; k++)
				{
					for(int l = 0; l < mat[0].length; l++)
					{
						if(mat[i][j] < mat[k][l])
						{
							int temp = mat[i][j];

							mat[i][j] = mat[k][l];

							mat[k][l] = temp;
						}
					}
				}
			}
		}

		for(int[] row : mat)
		{
			for(int x : row)
			{
				System.out.print(x+" ");
			}

			System.out.println();
		}
	}
}