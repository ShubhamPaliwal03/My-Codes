import java.util.Scanner;

class LCMofNum
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		int n1 = kb.nextInt();
		System.out.println();

		System.out.print("Enter the second number : ");
		int n2 = kb.nextInt();
		System.out.println();

		int multiple = n1>n2 ? n1 : n2; // the first common multiple will be the max among n1 and n2 

		while(true)
		{
			if(multiple%n1==0 && multiple%n2==0)
			{
				System.out.println("The LCM of "+n1+" and "+n2+" is : "+multiple);
				break;
			}
			else
			{
				multiple++;
			}
		}
	}
}