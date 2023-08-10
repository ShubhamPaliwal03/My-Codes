import java.util.Scanner;

class RowWiseMaxOfJaggedMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of rows in the matrix : ");

		int rows = kb.nextInt();

		int mat[][] = new int[rows][];

		for(int i=0;i<mat.length;i++)
		{
			System.out.print("\nEnter the no. of values (columns) you want to store in the "+i+"th row : ");

			int cols = kb.nextInt();

			int mat[i] = new int[cols];

			System.out.print("\nEnter "+cols+" values in the "+i+"th row : ");

			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		System.out.println("\nThe Matrix and Row-Wise Max of each row of the matrix is : ");
		for(int row[]:mat)
		{
			int max = mat[0];

			for(int val:row)
			{
				System.out.print(val+"\t");
				
				if(val>max)
				{
					max = val;
				}
			}
			System.out.println("=\t"+max);
		}
	}
}