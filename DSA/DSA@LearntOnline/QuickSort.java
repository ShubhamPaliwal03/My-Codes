import java.util.Scanner;

class QuickSort {

	public static int partition (int[] arr, int low, int high) {

		int pivot = arr[low];

		int i = low;
		int j = high;

		while (i < j) {

			while (arr[i] <= pivot && i < high) {

				i++;
			}

			while (arr[j] > pivot && j > low) {

				j--;
			}

			if (i < j) {

				swap(arr, i , j);
			}
		}

		swap(arr, low , j);

		return j;
	}

	public static void quickSort (int[] arr, int low, int high) {

		if (low < high) {

			int partitionIndex = partition(arr, low, high);

			quickSort(arr, low, partitionIndex - 1);

			quickSort(arr, partitionIndex + 1, high);
		}
	}

	public static void printArray (int[] arr) {

		System.out.print("\nThe sorted array is as follows : ");

		for (int val : arr) {

			System.out.print(val + " ");
		}
	}

	public static void swap (int[] arr, int i, int j) {

		int temp = arr[i];

		arr[i] = arr[j];

		arr[j] = temp;
	}

	public static int[] inputArray () {

		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter the " + n + " elements into the array : ");

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		kb.close();

		return arr;
	}

	public static void main (String[] args) {

		int[] arr = inputArray();

		quickSort(arr, 0, arr.length - 1);

		printArray(arr);
	}
}