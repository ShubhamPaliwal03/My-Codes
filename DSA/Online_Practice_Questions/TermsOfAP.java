import java.util.* ;

// public class Solution
// Error, if filename is not same as classname when we set visibility mode of the class as public
// Error : class Solution is public, should be declared in a file named Solution.java
// It's generally a good practice to have a public class in a file named after that class.
// However, this is more of a convention than a strict requirement, so it depends on our coding standards.

class TermsOfAP
{
	public static void main(String[] args)
	{
		int x = 2;

		int term_no = 1;
		int count = 1;

		int[] terms = new int[x];

		while(count<=x)
		{
			int term = 3*term_no+2;

			if(term%4!=0)
			{
				terms[count-1] = term;
				count++;
			}

			term_no++;
		}

		for(int val : terms)
		{
			System.out.print(val+" ");
		}
	}
}