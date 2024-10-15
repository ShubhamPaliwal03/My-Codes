import java.util.Scanner;

class ReturnArrayHavingSumOfAllWindowsOfSizeK
{
	public static void printArray(int[] arr)
	{
		for(int val : arr)
		{
			System.out.print(val+" ");
		}
	}

	public static int[] getWindowSums(int[] arr, int k, int n)
	{
		int[] windowSums = new int[n - k + 1];

		for(int i = 0; i < n - k + 1; i++)
		{
			int sum = 0;

			for(int j = i; j < k + i; j++)
			{
				sum += arr[j];
			}

			windowSums[i] = sum;
		}

		return windowSums;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter the "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			arr[i] = kb.nextInt();
		}

		System.out.print("\nEnter the size of the window (k) : ");

		int k = kb.nextInt();

		if(n - k + 1 <= 0)
		{
			System.out.print("\nNo windows of size "+k+" are possible in an array of size "+n+"!");
		}
		else
		{
			int[] windowSums = getWindowSums(arr, k, n);

			System.out.print("\nThe sums of windows of size "+k+" are : ");

			printArray(windowSums);
		}
	}
}