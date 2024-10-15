import java.util.Scanner;

public class ProblemBUpscaling
{
	public static char swapChar(char ch)
	{
		if(ch == '#')
		{
			return '.';
		}
		else
		{
			return '#';
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();

		while(t-->0)
		{
			int n = kb.nextInt();

			char row_char = '#';

			int row_rep = 0;

			for(int i = 0; i < 2 * n; i++)
			{
				if(row_rep == 2)
				{
					row_char = swapChar(row_char);

					row_rep = 0;
				}

				char cell_char = row_char;

				int cell_rep = 0;

				for(int j = 0; j < 2 * n; j++)
				{
					if(cell_rep == 2)
					{
						cell_char = swapChar(cell_char);

						cell_rep = 0;
					}

					System.out.print(cell_char);

					cell_rep++;
				}

				System.out.println();

				row_rep++;
			}
		}
	}
}