import java.util.Scanner;

class CreateAndPrint3DArray
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the no. of matrices in the 3D Array : ");
		int matrices = kb.nextInt();

		System.out.print("Enter the no. of rows in the 3D Array : ");
		int rows = kb.nextInt();

		System.out.print("Enter the no. of columns in the 3D Array : ");
		int cols = kb.nextInt();

		int arr3D = new int [matrices][rows][cols];
	}
}