import java.util.Scanner;

class PrintTableOfANum
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the number whose table you want to print : ");

		int num = kb.nextInt();

		kb.close();

		System.out.println("The table of "+num+" is as follows :\n");

		int i=1;
		while(i<=10)
		{
			System.out.println(num+" x "+i+" = "+(num*i));
			i++;
		}
	}
}