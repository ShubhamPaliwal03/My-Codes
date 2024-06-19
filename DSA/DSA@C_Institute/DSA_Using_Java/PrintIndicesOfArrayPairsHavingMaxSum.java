import java.util.Scanner;

class PrintIndicesOfArrayPairsHavingMaxSum
{
	public static void printIndicesWithMaxSum(int[] a)
	{
		int n = a.length;

		int max_pair_sum = 0;

		int pair_index1 = 0;

		int pair_index2 = 0;

		for(int i = 0; i < n - 1; i+=2)
		{
			int pair_sum = Math.abs(a[i]) + Math.abs(a[i+1]);

			if(pair_sum > max_pair_sum)
			{
				max_pair_sum = pair_sum;

				pair_index1 = i;

				pair_index2 = i+1;
			}
		}

		if(n % 2 == 1)
		{
			if(a[n-1] > max_pair_sum)
			{
				System.out.print("\nThe Index having max value, which is equal to "+a[n-1]+" which is even more than the max pair sum ("+max_pair_sum+"), is : "+(n-1));
			}
			else
			{
				System.out.print("\nThe Indices of the pair having max sum, which is equal to "+max_pair_sum+", are : ("+pair_index1+", "+pair_index2+")");
			}
		}
		else
		{
			System.out.print("\nThe Indices of the pair having max sum, which is equal to "+max_pair_sum+", are : ("+pair_index1+", "+pair_index2+")");
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
		int[] arr = createArray();

		printIndicesWithMaxSum(arr);
	}
}	