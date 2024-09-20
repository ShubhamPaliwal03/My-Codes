import java.util.Scanner;

class PrintOnlyPrimesForEachLoop
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int arr[] = new int[kb.nextInt()];

		System.out.print("\nEnter "+arr.length+" values into the array : ");

		for(int i=0;i<arr.length;i++)
		{
			arr[i] = kb.nextInt();
 		}

 		System.out.println("\nThe Prime values among the values present in the array are : ");

 		for(int x:arr)
 		{
 			int i=2;
 			while(i*i<=x)
 			{
 				if(x%i==0)
 				{
 					break;
 				}
 				i++;
 			}
 			if(i*i>x)
 			{
 				System.out.print(x+" ");
 			}
 		}
	}
}