import java.util.Scanner;

class MinMaxAmongArrayElements
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array you want to create : ");

		int arr[] =  new int[kb.nextInt()];
		/ystem.out.print("\nEnter "+arr.length+" elements into the array : ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = kb.nextInt();
		}

		kb.close();

		int max,min;

		max = min = arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}

		System.out.println("\nMax value among the values present in the array : "+max);

		System.out.println("\nMin value among the values present in the array : "+min);
	}
}