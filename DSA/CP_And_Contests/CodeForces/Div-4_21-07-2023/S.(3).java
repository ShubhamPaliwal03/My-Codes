import java.util.Scanner;

class S
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		// int t = kb.nextInt();

		// int count = 0;

		// while(count!=t)
		// {
            char mat[][] = new char [8][8];

            for(int i=0;i<8;i++)
            {
                for(int j=0;j<mat.length;j++)
                {
                    mat[i][j] = kb.next().charAt(0);
                }
            }

            for(char row[]:mat)
            {
                for(char c:row)
                {
                    if(c>='a' && c<='z')
                    {
                        System.out.println(c);
                    }
                }
            }

		// 	count++;
		// }
	}
}