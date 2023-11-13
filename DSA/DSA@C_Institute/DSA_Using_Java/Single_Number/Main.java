/* You have been given  */

import java.util.Scanner;

class Main
{
	// Brute-Force approach, T.C. => O(N^2), S.C. => O(1)

	static int singleNumM1(int[] a)
	{
		int single_num = -1;

		int count = 0;

		label_outer:
		for(int i = 0; i < a.length; i++)
		{
			count = 0;

			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}

				if(j == a.length-1 && count == 1)
				{
					single_num = a[i];

					break label_outer;
				}
			}
		}

		return single_num;
	}

	// Optimised Approach Using XOR operator (^), T.C. => O(N), S.C. => O(1)

	static int singleNumM2(int a[])
	{
		int single_num = 0;

		for(int i = 0; i < a.length; i++)
		{
			single_num = single_num ^ a[i];
		}

		return single_num;
	}

	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int size = kb.nextInt();

		int[] arr = new int[size];

		System.out.print("\nEnter the "+size+" elements into the array : ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = kb.nextInt();
		}

		kb.close();

		// int single_num = singleNumM1(arr);

		int single_num = singleNumM2(arr);

		System.out.print("\nThe single number of the array is : "+single_num);
	}
}