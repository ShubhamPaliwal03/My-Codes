import java.util.Scanner;

class CheckNumForPalindrome
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a number : ");

		int n,num;

		n = num = kb.nextInt();

		System.out.println();

		int m,r=0;
		while(num!=0)
		{
			m=num%10;
			r=r*10+m;
			num=num/10;
		}

		if(r==n)
		{
			System.out.print(n+" is a Palindrome");
		}
		else
		{
			System.out.print(n+" is Not a Palindrome");
		}	
	}
}