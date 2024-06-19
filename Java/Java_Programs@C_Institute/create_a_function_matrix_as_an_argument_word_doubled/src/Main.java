import java.util.Scanner;

class Main
{
    static int[][] doubleArray(int[][] m)
    {
        int[][] matrix = new int[m.length][m[0].length];

       for(int i=0;i<m.length;i++)
       {
           for(int j=0;j<m[i].length;j++)
           {
               matrix[i][j] = m[i][j] * 2;
           }
       }

       return matrix;
    }

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int rows = kb.nextInt();

        System.out.print("\nEnter the number of columns in the matrix: ");
        int cols = kb.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("\nEnter the elements in the matrix of "+rows+" x "+cols+" :\n");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j] =  kb.nextInt();
            }
        }

        int[][] matrix = doubleArray(mat);

        System.out.println("\nThe Matrix after making its every element double is :\n");

        for(int[] row:matrix)
        {
            for(int val:row)
            {
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
}