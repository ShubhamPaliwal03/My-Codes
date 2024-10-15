import java.util.Scanner;

class InsertValuesInSortedOrderInArray
{
	public void insertAtCorrectPosition(int value, int[] a)
	{
		
	}

	public int[] createArray()
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array that you want to create : ");

		int n = kb.nextInt();

		int[] a = new int[n];

		System.out.print("\nEnter the "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			insertAtCorrectPosition(kb.nextInt(), a);
		}

		return a;
	}

	public static void main(String[] args)
	{
		int[] sorted_arr = createArray();
	}
}