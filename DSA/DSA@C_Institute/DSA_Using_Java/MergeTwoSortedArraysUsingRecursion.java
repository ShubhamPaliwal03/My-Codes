import java.util.Scanner;

class MergeTwoSortedArraysUsingRecursion
{
	public static int addIfAnyValuesLeftInA(int[] a, int[] b, int[] merged_array, int i, int j, int k)
	{
		if(i == a.length) // base case
		{
			return k;
		}

		// if there are some values still left in the array a

		if(i < a.length && j >= b.length)
		{
			merged_array[k] = a[i];

			addIfAnyValuesLeftInA(a, b, merged_array, i+1, j, k+1);
		}

		return k;
	}

	public static void addIfAnyValuesLeftInB(int[] a, int[] b, int[] merged_array, int i, int j, int k)
	{
		if(j == b.length) // base case
		{
			return;
		}

		// if there are some values still left in the array b

		if(i >= a.length && j < b.length)
		{
			merged_array[k] = b[j];

			addIfAnyValuesLeftInB(a, b, merged_array, i, j+1, k+1);
		}
	}

	public static void mergeSortedArrays(int[] a, int[] b, int[] merged_array, int i, int j, int k)
	{
		if(i == a.length || j == b.length) // base case
		{
			int n = addIfAnyValuesLeftInA(a, b, merged_array, i, j, k);

			addIfAnyValuesLeftInB(a, b, merged_array, i, j, n);

			return;
		}

		if(a[i] < b[j]) // if the current value of array a is less than
		{
			merged_array[k] = a[i];

			mergeSortedArrays(a, b, merged_array, i+1, j, k+1);
		}
		else // if(a[j] <= b[i])
		{
			merged_array[k] = b[j];

			mergeSortedArrays(a, b, merged_array, i, j+1, k+1);
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

		mergeSortedArrays(arr1, arr2, merged_array, 0, 0, 0);

		System.out.print("\nThe merged array is : ");

		for(int val : merged_array)
		{
			System.out.print(val+" ");
		}
	}
}