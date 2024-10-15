import java.util.Scanner;

class SumOf10Nums
{
	public static void main(String args[])
	{
		int i,sum=0,num;
		
		Scanner kb = new Scanner(System.in);

		for(i=1;i<=10;i++)
		{
			System.out.print("Enter the "+i+"th number : ");

			num = kb.nextInt();

			System.out.println();

			sum += num;
		}

		System.out.println("\nThe sum of the 10 numbers entered above is : "+sum);

	}
}