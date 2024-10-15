import java.util.Scanner;

class InputCharPerformOperation
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		char ch;

		System.out.print("Enter a character : ");
		ch = kb.next().charAt(0);

		// ch = (char)(97 - ch + 90);
		ch = (char)(187 - ch);

		System.out.println("Result : "+ch);
	}
}