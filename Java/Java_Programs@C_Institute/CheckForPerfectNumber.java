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

		int div=1,divSum=0;
		
		while(div<=num/2)
		{
			if(num%div==0)
			{
				divSum+=div;
			}
			div++;
		}

		if(divSum==num)
		{
			System.out.println(num+" is a Perfect Number");
		}
		else
		{
			System.out.println(num+" is Not a Perfect Number");
		}
	}
}