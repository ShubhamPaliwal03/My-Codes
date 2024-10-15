import java.util.Scanner;

class MergeSort
{
	public static void merge(int[] arr, int low, int mid, int high)
	{
		int[] temp = new int[high-low+1];

		int i = 0;

		int left = low;

		int right = mid + 1;

		while (left <= mid && right <= high)
		{
			if (arr[left] <= arr[right])
			{
				temp[i++] = arr[left++]; 
			}
			else
			{
				temp[i++] = arr[right++];
			}
		}

		while (left <= mid)
		{
			temp[i++] = arr[left++];
		}

		while (right <= high)
		{
			temp[i++] = arr[right++];
		}

		// copy the elements stored in the temporary array, replacing the original array elements within the given range

		for (int k = low; k <= high; k++)
		{
			arr[k] = temp[k - low];
		}
	}

	public static void mergeSort(int[] arr, int low, int high)
	{
		if (low >= high)
		{
			return;
		}

		int mid = (low + high) / 2;

		mergeSort(arr, low, mid);

		mergeSort(arr, mid + 1, high);

		merge(arr, low, mid, high);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter the " + n + " elements into the array : ");

		for (int i = 0; i < n; i++)
		{
			arr[i] = kb.nextInt();
		}

		mergeSort(arr, 0, n - 1);

		System.out.print("\nThe array after performing sorting is : ");

		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}