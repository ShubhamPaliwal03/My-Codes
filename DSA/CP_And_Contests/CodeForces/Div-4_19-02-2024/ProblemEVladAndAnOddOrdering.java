import java.util.*;

public class ProblemEVladAndAnOddOrdering
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			int k = kb.nextInt();

			int times = 1;

			ArrayList<Integer> arr = new ArrayList<>();

			while(times != n)
			{
				for(int i = 1; i < n; i+=2) // times odd
				{
					arr.add(i*times);
				}

				times++;
			}

			System.out.println(arr.get(k-1));
		}
	}	
}
