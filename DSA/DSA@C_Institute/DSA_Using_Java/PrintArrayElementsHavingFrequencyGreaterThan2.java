import java.util.*;

class Pair {

	private int data;
	private int freq;

	Pair (int data) {

		this.data = data;
		freq = 1;
	}

	int getData() {

		return data;
	}

	int getFreq() {

		return freq;
	}

	void increaseFreq() {

		freq++;
	}
}

class PrintArrayElementsHavingFrequencyGreaterThan2 {

	public static int[] inputArray() {

		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];

		System.out.print("\nEnter the " + n + " elements into the array : ");

		for (int i = 0; i < n; i++) {

			arr[i] = kb.nextInt();
		}

		return arr;
	}

	public static int updateFreqIfExists(int val, LinkedList<Pair> fList) {

		ListIterator iterator = fList.listIterator();

		while (iterator.hasNext()) {

			Pair pair = (Pair)iterator.next();

			if (pair.getData() == val) {

				pair.increaseFreq();

				return 0;
			}
		}

		return -1;
	}

	public static void main (String[] args) {

		int[] arr = inputArray();

		LinkedList<Pair> fList = new LinkedList<Pair>();

		for (int val : arr) {

			if (updateFreqIfExists(val, fList) == -1) {

				fList.addLast(new Pair(val));
			}
		}

		System.out.println("\nThe Elements Having Frequency Greater than 2 are as follows :\n");

		ListIterator iterator = fList.listIterator();

		while (iterator.hasNext()) {

			Pair pair = (Pair)iterator.next();

			if (pair.getFreq() >= 2) {

				System.out.println(pair.getData() + " => " + pair.getFreq());
			}
		}
	}
}