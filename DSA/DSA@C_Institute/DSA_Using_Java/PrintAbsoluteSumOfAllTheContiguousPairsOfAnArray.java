import java.util.Scanner;

class PrintAbsoluteSumOfAllTheContiguousPairsOfAnArray
{
	public static void PrintAbsolutePairSum(int[] a)
	{
		int n = a.length;

		System.out.print("\nThe absolute sums of all the pairs are : ");

		for(int i = 0; i < n - 1; i += 2)
		{
			System.out.print(Math.abs(a[i]) + Math.abs(a[i+1])+" ");
		}

		if(n % 2 == 1)
		{
			System.out.print(a[n-1]);
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

		PrintAbsolutePairSum(arr);
	}
}