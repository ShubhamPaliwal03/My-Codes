import java.util.*;

public class ProblemBDifferentString
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			String s = kb.next();

			char[] str = s.toCharArray();

			int i = 0;

			while(i < str.length - 1 && str[i] == str[i+1])
			{
				i++;
			}

			if(i == str.length - 1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");

				char tmp = str[i];

				str[i] = str[i+1];

				str[i+1] = tmp;

				System.out.println(new String(str));
			}
		}
	}
}