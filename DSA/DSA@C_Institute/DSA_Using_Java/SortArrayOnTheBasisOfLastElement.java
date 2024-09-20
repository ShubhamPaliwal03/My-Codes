import java.util.Scanner;

class SortArrayOnTheBasisOfLastElement
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int size = kb.nextInt();

		int[] arr = new int[size];

		System.out.print("\nEnter "+size+" elements in the array : ");

		for (int i = 0; i < size; i++)
		{
			arr[i] = kb.nextInt();
		}

		kb.close();

		// sort the array in ascending order on the basis of the last digit of the array elements

		for (int i = 0; i < size - 1; i++)
		{
			for (int j = i + 1; j < size; j++)
			{
				if(arr[i] % 10 > arr[j] % 10)
				{
					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.print("\nThe array sorted in increasing order, on the basis of last digit is : ");

		for(int val : arr)
		{
			System.out.print(val+" ");
		}
	}	
}