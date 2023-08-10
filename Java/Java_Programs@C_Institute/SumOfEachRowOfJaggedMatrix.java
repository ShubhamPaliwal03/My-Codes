import java.util.Scanner;

class SumOfEachRowOfJaggedMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of rows of the matrix : ");

		int rows = kb.nextInt();

		int mat[][] = new int[rows][];

		for(int i=0;i<mat.length;i++)
		{
			System.out.print("\nHow many values (no. of columns) do you want to store in the "+i+"th row : ");

			int cols = kb.nextInt();

			mat[i] = new int[cols];

			System.out.print("\nEnter "+cols+" values in the "+i+"th row : ");

			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		System.out.println("\nThe Matrix and it's Row-wise Sum is : ");
		for(int row[]:mat)
		{
			int r_sum=0;
			for(int val:row)
			{
				System.out.print(val+"\t");
				r_sum+=val;
			}
			System.out.println("=\t"+r_sum);
		}
	}
}