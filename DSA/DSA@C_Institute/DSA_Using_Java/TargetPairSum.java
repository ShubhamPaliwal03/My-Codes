import java.util.Scanner;

class TargetPairSum
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

		System.out.print("\nEnter the target sum : ");

		int target_sum = kb.nextInt();

		int pairs = 0;

		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i]+arr[j] == target_sum)
				{
					pairs++;
				}
			}
		}

		System.out.print("\nThere are "+pairs+" pairs which can sum up to form the target sum of "+target_sum);
	}
}