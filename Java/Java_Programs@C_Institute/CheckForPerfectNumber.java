import java.util.Scanner;

class CheckForPerfectNumber
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println();

		// a bit optimsed version, Time Complexity O(N/2), ie., O(N)

		// int div=1,divSum=0;

		// while(div<=num/2)
		// {
		// 	if(num%div==0)
		// 	{
		// 		divSum+=div;
		// 	}
			
		// 	div++;
		// }

		// fully optmised version, Time Complexity O(sqrt(N))

		int div = 2;
		int divSum = 1;

		while(div*div<=num)
		{
			if(num%div==0)
			{
				divSum += div + (num/div);
			}

			div++;
		}

		if(divSum==num && num!=1)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is Not a Perfect Number");
		}
	}
}