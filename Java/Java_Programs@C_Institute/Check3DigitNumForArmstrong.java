import java.util.Scanner;

class Check3DigitNumForArmstrong
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the number : ");

		int n,num;

		n = num = kb.nextInt();

		int dig,cubed_sum=0;

		while(num!=0)
		{
			dig = num%10;
			cubed_sum = cubed_sum + (dig*dig*dig);
			num = num/10;
		}

		if(cubed_sum==n)
		{
			System.out.print(n+" is an Armstrong Number");
		}	
		else
		{
			System.out.print(n+" is Not an Armstrong Number");
		}
	}
}