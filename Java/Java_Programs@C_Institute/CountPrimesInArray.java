import java.util.Scanner;

class CountPrimesInArray
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int []arr =  new int[kb.nextInt()];

		System.out.print("\nEnter "+arr.length+" elements into the array : ");

		int count=0;

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = kb.nextInt();

			int j=2;
			while(j*j<arr[i])
			{
				if(arr[i]%j==0)
				{
					break;
				}
				j++;
			}
			if(j*j>arr[i])
			{
				count++;
			}
		}

		System.out.println("The array you entered has a total of "+count+" prime numbers");
	}
}