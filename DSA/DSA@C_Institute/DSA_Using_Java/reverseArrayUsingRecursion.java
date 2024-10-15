import java.util.Scanner;

class reverseArrayUsingRecursion
{
	public static void reverseArray(int[] arr, int i, int j)
	{
		if(i == j)
		{
			return;
		}

		int temp = arr[i];

		arr[i] = arr[j];

		arr[j] = temp;

		reverseArray(arr, i + 1, j - 1);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter "+n+" elements into the array : ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = kb.nextInt();
		}

		reverseArray(arr, 0, arr.length - 1);

		System.out.print("\nThe reversed array is : ");

		for(int val : arr)
		{
			System.out.print(val+" ");
		}
	}
}