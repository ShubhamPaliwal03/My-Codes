import java.util.Scanner;

class NextGreaterElement
{
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

		int[] res = new int[n];

		int k = 0;

		for(int i = 0; i < n - 1; i++)
		{
			int j;

			for(j = i + 1; j < n; j++)
			{
				if(arr[j] > arr[i])
				{
					res[k++] = arr[j];

					break;
				}
			}

			if(j == n) // if no next greater element is found
			{
				res[k++] = -1;
			}
		}

		// for the last element, the next element will never be present, so it will be -1.

		res[k++] = -1;

		System.out.print("\nThe Next Greater Element Array is as follows : ");

		for(int val : res)
		{
			System.out.print(val+" ");
		}
	}
}