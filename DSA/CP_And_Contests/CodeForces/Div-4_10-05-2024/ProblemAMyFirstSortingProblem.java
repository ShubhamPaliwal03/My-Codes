import java.util.Scanner;

public class ProblemAMyFirstSortingProblem
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int a = kb.nextInt();
			int b = kb.nextInt();

			int min = a < b ? a : b;
			int max = a > b ? a : b;

			System.out.println(min+" "+max);
		}
	}
}