import java.util.Scanner;

public class CheckForArmstrongNumber
{
	
	public static void main(String[] args) 
	{
		// Write your code here
		
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the number which you want to check for being an Armstrong number : ");

		int n = kb.nextInt();

		int num = n;

		int digit, dig_count = 0;

		// code to calculate the number of digits in the number

		while(n!=0)
		{
			n = n / 10;
			dig_count++;
		}

		// code to calculate the powered sum of digits of a number

		int powered_sum = 0;

		n = num;

		while(n!=0)
		{
			digit = n % 10;

			int i=1;
			int pow_res=1;

			// code to calculate digit to the power of dig_count

			while(i<=dig_count)
			{
				pow_res = pow_res * digit;
				i++;
			}			

			powered_sum += pow_res;

			n = n / 10;
		}

		if(powered_sum==num)
		{
			System.out.println("\n"+num+" is an Armstrong number");
		}
		else
		{
			System.out.println("\n"+num+" is Not an Armstrong number");
		}

		// i=1
		// count=3
		// sum=2
		// pow_res=1

		// pow_res = 2

		// i=2
		// pow_res = 4

		// i=3
		// pow_res = 8

		// i=4, i>count
		// break
	}
}