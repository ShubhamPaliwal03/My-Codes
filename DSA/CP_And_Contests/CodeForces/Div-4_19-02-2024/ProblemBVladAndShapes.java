import java.util.Scanner;

public class ProblemBVladAndShapes
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			char[][] grid = new char[n][n]; 

			for(int i = 0; i < n; i++)
			{
				grid[i] = kb.next().toCharArray();
			}

			int prev_rowwise_1_count = 0;

			for(int i = 0; i < n; i++)
			{
				int curr_rowwise_1_count = 0;

				for(int j = 0; j < n; j++)
				{
					if(grid[i][j] == '1')
					{
						curr_rowwise_1_count++;
					}
				}

				if(prev_rowwise_1_count != 0 && curr_rowwise_1_count != 0)
				{
					if(prev_rowwise_1_count == curr_rowwise_1_count)
					{
						System.out.println("SQUARE");

						break;
					}
					else if(prev_rowwise_1_count > curr_rowwise_1_count || prev_rowwise_1_count < curr_rowwise_1_count)
					{
						System.out.println("TRIANGLE");

						break;
					}
				}

				prev_rowwise_1_count = curr_rowwise_1_count;
			}
		}
	}	
}