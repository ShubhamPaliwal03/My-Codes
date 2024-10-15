import java.util.Scanner;

class MergeTwoSortedArrays
{
	public static void mergeSortedArrays(int[] a, int[] b, int[] merged_array)
	{
		int i = 0, j = 0, k = 0;

		while(i < a.length && j < b.length)
		{
			if(a[i] < b[j])
			{
				merged_array[k++] = a[i++];
			}
			else // if(b[j] <= a[i])
			{
				merged_array[k++] = b[j++];
			}
		}

		// method - 1

		// if(i < a.length && j >= b.length)
		// {
		// 	while(i < a.length)
		// 	{
		// 		merged_array[k++] = a[i++];
		// 	}
		// }
		// else if(i >= a.length && j < b.length)
		// {
		// 	while(j < b.length)
		// 	{
		// 		merged_array[k++] = b[j++];
		// 	}
		// }

		// method - 2

		// adding the leftover elements of a (if any) into the merged array

		while(i < a.length)
		{
			merged_array[k++] = a[i++];
		}

		// adding the leftover elements of a (if any) into the merged array, although only one of the two arrays will have some elements left in the array

		while(j < b.length)
		{
			merged_array[k++] = a[j++];
		}
	}

	public static void inputArray(int[] a)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter "+a.length+" elements in the array : ");

		for(int i = 0; i < a.length; i++)
		{
			a[i] = kb.nextInt();
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of 1st sorted array : ");

		int n1 = kb.nextInt();

		int[] arr1 = new int[n1];

		inputArray(arr1);

		System.out.print("\nEnter the size of 2nd sorted array : ");

		int n2 = kb.nextInt();

		int[] arr2 = new int[n2];

		inputArray(arr2);

		kb.close();

		int[] merged_array = new int[n1+n2];

		mergeSortedArrays(arr1, arr2, merged_array);

		System.out.print("\nThe merged array is : ");

		for(int val : merged_array)
		{
			System.out.print(val+" ");
		}
	}
}