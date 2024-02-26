import java.util.Scanner;

class PrintLargestSumSubarray
{
	static int[] createArray()
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array that you want to create : ");

		int n = kb.nextInt();

		int[] a = new int[n];

		System.out.print("\nEnter the "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			a[i] = kb.nextInt();
		}

		System.out.println("\nThe array containing "+n+" elements has been successfully created...");

		return a;
	}

	static void printLargestSumSubarray(int a[])
	{
		int n = a.length;

		int max_sum = Integer.MIN_VALUE;

		int start = 0;

		int end = 0;

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				int sum = 0;

				for(int k = i; k <= j; k++)
				{
					sum += a[k];
				}

				if(sum > max_sum)
				{
					max_sum = sum;

					start = i;

					end = j;
				}
			}
		}

		System.out.println("\nThe Largest Sum Subarray has a Sum of "+max_sum+" is as follows : \n");

		for(int i = start; i <= end; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = createArray();

		printLargestSumSubarray(arr);
	}
}