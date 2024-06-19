import java.util.Scanner;

public class ProblemACreatingWords
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			StringBuilder a = new StringBuilder(kb.next());
			StringBuilder b = new StringBuilder(kb.next());

			char temp = a.charAt(0);
			a.setCharAt(0, b.charAt(0));
			b.setCharAt(0, temp);

			System.out.println(a+" "+b);
		}
	}
}