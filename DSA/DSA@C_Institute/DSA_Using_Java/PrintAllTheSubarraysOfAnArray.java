import java.util.Scanner;

class PrintAllTheSubarraysOfAnArray
{
	public static void printAllSubarrays(int[] a)
	{
		int n = a.length;

		System.out.println("\nThe Subarrays of the given array are as follows : \n");

		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(a[k]+" ");
				}

				System.out.println();
			}

			System.out.println();
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

		printAllSubarrays(arr);
	}
}