import java.util.Scanner;

public class ProblemAStairPeakOrNeither
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int a = kb.nextInt();

			int b = kb.nextInt();

			int c = kb.nextInt();

			if(a < b && b < c)
			{
				System.out.println("STAIR");
			}
			else if(a < b && b > c)
			{
				System.out.println("PEAK");
			}
			else
			{
				System.out.println("NONE");
			}
		}
	}
}