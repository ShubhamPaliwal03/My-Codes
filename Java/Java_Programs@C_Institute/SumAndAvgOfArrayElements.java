import java.util.Scanner;

class SumAndAvgOfArrayElements
{
	public static void main(String args[])
	{	
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int sum=0,avg;

		int arr[] = new int[kb.nextInt()];

		System.out.print("Enter "+arr.length+" elements into the array : ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = kb.nextInt();
			sum += arr[i];
		}

		kb.close();

		avg = sum/arr.length;

		System.out.println("\nSum of all the values/elements present in the array : "+sum);

		System.out.println("\nAverage of all the values/elements present in the array : "+avg);
	}
}