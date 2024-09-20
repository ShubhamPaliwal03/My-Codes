import java.util.Scanner;

class PrintAllTheSubarraysOfAnArrayHavingSumEqualToK
{
	public static void printSubarrayWithSumK(int[] a, int k)
	{
		int n = a.length;

		boolean found = false;

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				int sum = 0;

				for(int l = i; l <= j; l++)
				{
					sum += a[l];
				}

				if(sum == k)
				{
					if(found == false)
					{
						System.out.print("\nThe Subarray(s) having sum equal to "+k+" is / are :");
					}

					System.out.println("\n");

					for(int l = i; l <= j; l++)
					{
						System.out.print(a[l]+" ");
					}

					found = true;
				}
			}
		}

		if(found == false)
		{
			System.out.print("\nNo Subarray found having sum equal to "+k);
		}
	}

	public static int[] createArray()
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array you want to create : ");

		int n = kb.nextInt();

		int[] a = new int[n];

		System.out.print("\nEnter "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			a[i] = kb.nextInt();
		}

		System.out.println("\nArray containing "+n+" elements created successfully...");

		return a;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int[] arr = createArray();

		System.out.print("\nEnter the value of k : ");

		int k = kb.nextInt();

		printSubarrayWithSumK(arr, k);
	}
}