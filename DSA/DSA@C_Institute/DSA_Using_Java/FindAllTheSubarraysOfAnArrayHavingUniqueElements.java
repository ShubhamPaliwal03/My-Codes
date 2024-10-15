import java.util.Scanner;

class FindAllTheSubarraysOfAnArrayHavingUniqueElements
{
	public static int[] createArray()
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] a = new int[n];

		System.out.print("\nEnter "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			a[i] = kb.nextInt();
		}

		return a;
	}

	public static boolean containsElement(int target, int[] subarray, int subarray_len)
	{
		for(int i = 0; i < subarray_len; i++)
		{
			if(subarray[i] == target)
			{
				return true;
			}
		}

		return false;
	}

	public static void printSubarray(int[] subarray, int subarray_len)
	{
		for(int i = 0; i < subarray_len; i++)
		{
			System.out.print(subarray[i]+" ");
		}
	}

	public static void printUniqueSubarrays(int[] arr)
	{
		int size = arr.length;

		for(int i = 0; i < size; i++)
		{
			for(int j = i; j < size; j++)
			{
				int[] subarray = new int[j-i+1];

				int ind = 0;

				for(int k = i; k <= j; k++)
				{
					if(ind == 0) // if the subarray is empty as of now
					{
						subarray[ind++] = arr[k];
					}
					else
					{
						if(!containsElement(arr[k], subarray, ind+1)) // if this element does not previously occur in the subarray (it is unique)
						{
							subarray[ind++] = arr[k];
						}
					}
				}

				// print the subarray

				printSubarray(subarray, ind);

				System.out.println();
			}

			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int[] arr = createArray();

		System.out.println("\nAll the Subarrays of the entered array, having unique elements are as follows :");

		printUniqueSubarrays(arr);		
	}
}