import java.util.Scanner;

class SumOfRowsOfJaggedMatrix
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of rows of the matrix : ");

		int rows = kb.nextInt();

		int mat[][] = new int[rows][];

		for(int i=0;i<mat.length;i++)
		{
			System.out.print("\nHow many values you want to store in the "+i+"th row : ");

			int col = kb.nextInt();

			mat[i] = new int[col];

			System.out.print("\nEnter "+col+" values in the "+i+"th row : ");

			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j] = kb.nextInt();
			}
		}

		System.out.println("Matrix and it's Row-wise Sum is : ");
		for(int row[]:mat)
		{
			int sum=0;
			for(int val:row)
			{
				System.out.println(val+"\t");
				sum+=val;
			}
			System.out.println("=\t"+sum);
		}
	}
}