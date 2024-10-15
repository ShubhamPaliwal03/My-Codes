import java.util.Scanner;

class MaxInWindowOfK
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter the size of the array : ");

		int n = kb.nextInt();

		int[] arr = new int[n];
		
		System.out.print("\nEnter "+n+" elements into the array : ");

		for(int i = 0; i < n; i++)
		{
			arr[i] = kb.nextInt();
		}

		System.out.print("\nEnter the value of k : ");

		int k = kb.nextInt();

		int[] res = new int[n];

		int ind = 0;

		for(int i = 0; i <= n-k; i++)
		{
			int max = arr[i];

			int j = i+1;

			for(j = i+1; j < i+k; j++)
			{
				if(arr[j] > max)
				{
					max = arr[j];
				}
			}

			res[ind++] = max;
		}

		if(ind < n) // if there are some incomplete or out of bounds windows of size k remaining to be filled
		{
			while(ind < n)
			{
				res[ind++] = -1;
			}
		}

		System.out.print("\nThe Max elements in all windows of "+k+" elements are as follows : ");

		for(int val : res)
		{
			System.out.print(val+" ");
		}
	}
}