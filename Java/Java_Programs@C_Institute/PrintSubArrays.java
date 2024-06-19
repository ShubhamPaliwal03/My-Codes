import java.util.Scanner;

class PrintSubArrays
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int n = kb.nextInt();

		int arr[] = new int[n];

		System.out.print("\nEnter "+n+" values into the array : ");

		for(int i=0;i<n;i++)
		{
			arr[i] = kb.nextInt();
		}

		System.out.println("\nThe Sub-arrays of the array entered are :\n");

		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}