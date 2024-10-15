/* You have been given  */

// we will be using bit magic / bit manipulation here, Bitwise XOR (^)
// since we know that bitwise xor gives 1 as the resultant bit if the two bits are different, and 
// 0 as the resultant bit if the two bits are same, so we obtain the element only once in the array
// at the end, as the result.

// Dry Run for test case : N = 3, arr[] = {1, 10, 1} =>

// initially :   result = 0
// i = 0     :   arr[0] = 1,  result = 0 ^ 1  => result = 1
// i = 1     :   arr[1] = 10, result = 1 ^ 10 => result = 11
// i = 2     :   arr[2] = 1,  result = 11 ^ 1 => result = 10

// note that appraoch-1 (M1) will work even if other digits have a frequency greater than 2

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

				// if(j == a.length-1 && count == 1)
				// {
				// 	single_num = a[i];

				// 	break label_outer;
				// }
			}

			// simplified upper logic by eliminating checking one condition,
			// and instead of checking again and again that if the innner loop is successfully completed,
			// we can directly check the remaining condition after the complete execution of the inner loop,

			// note that the inner loop is bound to run fully, as there is no break statement inside it.

			if(count == 1)
			{
				single_num = a[i];

				break label_outer;
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

		int single_num = singleNumM1(arr);

		// int single_num = singleNumM2(arr);

		System.out.print("\nThe single number of the array is : "+single_num);
	}
}