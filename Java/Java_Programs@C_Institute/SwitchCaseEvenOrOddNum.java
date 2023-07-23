import java.util.Scanner;

class SwitchCaseEvenOrOddNum
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int num;

		System.out.print("Enter a number : ");
		num = kb.nextInt();


		switch(num&1)
		{
			case 1:
				System.out.println("Odd Number");
				break;
				
			default:
			// case 0:	
				System.out.println("Even Number");
		}
	}
}