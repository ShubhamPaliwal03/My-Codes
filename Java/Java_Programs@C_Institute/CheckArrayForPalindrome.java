import java.util.Scanner;

class CheckArrayForPalindrome
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the size of the array : ");

		int arr[] = new int[kb.nextInt()];

		int i,j;

		System.out.print("Enter "+arr.length+" elements into the array : ");

		for(i=0;i<arr.length;i++)
		{
			arr[i] = kb.nextInt();
		}

		kb.close();

		// Two Pointer Approach

		for(i=0,j=arr.length-1;i<j;i++,j--)
		{
			if(arr[i]!=arr[j])
			{
				break;
			}
		}

		// System.out.println(i+" "+j); // for verifying the logic

		if(i==j)
		{
			System.out.println("\nThe array entered is A Palindrome");
		}
		else
		{
			System.out.println("\nThe array entered is Not a Palindrome");
		}
	}
}