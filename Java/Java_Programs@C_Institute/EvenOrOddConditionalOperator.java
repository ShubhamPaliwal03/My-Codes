
import java.util.Scanner;

class EvenOrOddConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		int num;
		String result;

		System.out.print("Enter a number : ");
		num = kb.nextInt();

		result = num%2==0 ? "Even" : "Odd";

		System.out.println(result);
	}
}