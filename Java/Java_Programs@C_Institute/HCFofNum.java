import java.util.Scanner;

class HCFofNum
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

		int factor = n1<n2 ? n1 : n2;// the first common factor will be the min among n1 and n2

		while(true)
		{
			if(n1%factor==0 && n2%factor==0)
			{
				System.out.println("The HCF of "+n1+" and "+n2+" is : "+factor);
				break;
			}
			else
			{
				factor--;
			}
		}
	}
}