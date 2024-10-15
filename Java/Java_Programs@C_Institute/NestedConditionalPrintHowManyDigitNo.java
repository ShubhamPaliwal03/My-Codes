import java.util.Scanner;

class NestedConditionalPrintHowManyDigitNo
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the number : ");

		int num = kb.nextInt();

		// Method-1 :-

		System.out.print("\n"+num+" is a ");

		System.out.print 
		(
			num/10==0 ? "1 Digit Number!" :
				num/100==0 ? "2 Digit Number!" :
					num/1000==0 ? "3 Digit Number!" :
								 	"More than 3 Digit Number!"

		);

		// Method-2 (This won't work for negative values, add more conditions to make it work for negative values):-

		// System.out.print
		// (	num<0 ? "You entered a negative number!" :
		// 		num>999 ? "More than 3 Digit Number!" :
		// 			num>99 ? "3 Digit Number!" :
		// 				num>9 ? "2 Digit Number!" :
		// 							"1 Digit Number!"
		// );

	}
}