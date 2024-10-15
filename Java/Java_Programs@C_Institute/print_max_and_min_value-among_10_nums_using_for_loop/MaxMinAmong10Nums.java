import java.util.Scanner;

class MaxMinAmong10Nums
{
	public static void main(String args[])
	{
		int i,min,max,num;

		Scanner kb = new Scanner(System.in);

		for(i=1;i<=10;i++)
		{
			System.out.print("Enter the "+i+"th number : ");

			num = max = min = kb.nextInt();

			// we should not assign min and max to 0, to avoid wrong output
			
			// we can also assign most -ve value to max

			System.out.println();

			if(num>max)
			{
				max=num;
			}

			if(num<min)
			{
				min=num;
			}
		}

		System.out.println("\nThe Minimum value among the 10 values entered above is : "+min);
		System.out.println("\nThe Maximum value among the 10 values entered above is : "+max);
	}
}