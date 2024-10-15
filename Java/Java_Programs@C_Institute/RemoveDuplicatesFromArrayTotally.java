import java.util.Scanner;

class RemoveDuplicatesFromArrayTotally
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int n = kb.nextInt();

		int arr[] = new int[n];

		System.out.print("\nEnter the "+n+" elements into the array : ");

		for(int i=0;i<n;i++)
		{	
			arr[i] = kb.nextInt();
		}

		kb.close();

		// using a boolean array to store indices of all the duplicate elements as well as the number to whom the duplicates belong
		boolean sieve[] = new boolean[n]; 

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					// marking the indices of duplicates as well as the number to whom the duplicates belong, as true while rest of the elements remain false by default at the time of memory allocation
					sieve[i] = sieve[j] = true;
				}
			}
		}

		// for verifying the code with the values present in the sieve
		// System.out.println();
		// for(int i=0;i<n;i++)
		// {
		// 	System.out.print(sieve[i]+" ");
		// }

		System.out.print("\nAfter totally removing the duplicate elements from the array entered, the array is : ");

		for(int i=0;i<n;i++)
		{
			// to only print the non-duplicate elements
			if(sieve[i]!=true)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}