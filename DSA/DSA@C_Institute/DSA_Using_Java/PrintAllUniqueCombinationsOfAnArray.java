import java.util.*;
import java.util.HashMap;

class PrintAllUniqueCombinationsOfAnArray
{
	private static HashMap<Integer, Integer> fMap = new HashMap<>();

	// public static int getFrequency(HashMap<Integer, Integer> map, int key)
	// {
	// 	return fMap.getOrDefault(key, 0);
	// }

	public static void printArray(int[] arr)
	{
		System.out.println();

		for(int val : arr)
		{
			System.out.print(val+" ");
		}

		System.out.println();
	}

	public static void printAllSubsequences(int[] res, int i, int size, int[] arr, HashMap<Integer, Integer> tempMap)
	{
		if(i == size) // if the desired solution is reached (subarray of desired size is found)
		{
			printArray(res); // print the subarray

			return; // if the desired solution is reached (subarray of desired size is found), then we backtrack
		}

		// at index i, pick the different choices from the available set of choices present in the array arr

		for(int j = 0; j < arr.length; j++)
		{
			if(!tempMap.containsKey(arr[j]))
			{
				tempMap.put(arr[j], 1);

				res[i] = arr[j];

				printAllSubsequences(res, i+1, size, arr, tempMap); // go to index (i+1)

				tempMap.remove(arr[j]);
			}
			else
			{
				int frequency = tempMap.get(arr[j]);

				if(frequency < fMap.get(arr[j]))
				{
					tempMap.put(arr[j], frequency + 1);

					res[i] = arr[j];

					printAllSubsequences(res, i+1, size, arr, tempMap); // go to index (i+1)

					tempMap.put(arr[j], frequency);
				}
			}
		}

		return;
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter "+n+" elements in the array : ");

		for(int i = 0; i < n; i++)
		{
			arr[i] = kb.nextInt();

			if(!fMap.containsKey(arr[i]))
			{
				fMap.put(arr[i], 1);
			}
			else
			{
				fMap.put(arr[i], fMap.get(arr[i]) + 1);
			}

			// fMap.put(arr[i], fMap.getOrDefault(arr[i], 0) + 1);
		}

		for(int size = 1; size <= n; size++)
		{
			int[] res = new int[size];

			HashMap<Integer, Integer> tempMap = new HashMap<>();

			printAllSubsequences(res, 0, size, arr, tempMap);
		}	
	}
}