import java.util.Scanner;

class PrintAllNumbersFormedByUsingDigitsPresentInArray
{
	public static void printArray(int[] arr)
	{
		for(int val : arr)
		{
			System.out.print(val+" ");
		}

		System.out.println();
	}

	public static void printAllSubsequences(int[] res, int i, int size, int[] arr)
	{
		if(i == size) // if the desired solution is reached (subarray of desired size is found)
		{
			printArray(res); // print the subarray

			return; // if the desired solution is reached (subarray of desired size is found), then we backtrack
		}

		// at index i, pick the different choices from the available set of choices present in the array arr

		for(int j = 0; j < arr.length; j++)
		{
			res[i] = arr[j];

			printAllSubsequences(res, i+1, size, arr); // go to index (i+1)
		}

		return;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter "+n+" elements in the array : ");

		for(int i = 0; i < n; i++)
		{
			arr[i] = kb.nextInt();
		}

		System.out.println();

		for(int size = 1; size <= n; size++)
		{
			int[] res = new int[size];

			printAllSubsequences(res, 0, size, arr);
		}	
	}
}