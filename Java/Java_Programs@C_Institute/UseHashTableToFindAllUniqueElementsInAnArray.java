import java.util.*;

class UseHashTableToFindAllUniqueElementsInAnArray
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter "+n+" values in the array : ");

		for(int i = 0; i < n ; i++)
		{
			arr[i] = kb.nextInt();
		}

		Hashtable<Integer, Integer> fTable = new Hashtable<>();

		for(int i = 0; i < n; i++)
		{
			if(!fTable.containsKey(arr[i]))
			{
				fTable.put(arr[i], 1);
			}
			else
			{
				fTable.put(arr[i], fTable.get(arr[i]) + 1);
			}
		}

		System.out.print("\nThe Unique Values in the array are : ");

		for(Integer f : fTable.keySet())
		{
			if(fTable.get(f) == 1)
			{
				System.out.print(f+" ");
			}
		}
	}
}