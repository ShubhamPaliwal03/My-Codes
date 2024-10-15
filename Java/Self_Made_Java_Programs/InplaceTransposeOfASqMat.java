import java.util.Scanner;

class InplaceTransposeOfASqMat
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the order of the square matrix (like 2 for matrix of 2x2) : ");

        int rows = kb.nextInt();

        int cols = rows;

        int mat[][] = new int[rows][cols];

        System.out.println("\nEnter the elements into the matrix of "+rows+" x "+cols+" :\n");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j] = kb.nextInt();
            }
        }

        for(int i=0;i<mat.length;i++)
        {   
            for(int j=0;j<=i;j++)
            {
                if(i!=j)
                {
                    int temp  = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        System.out.println("\nThe Transpose of the Matrix is :\n");

        for(int row[]:mat)
        {
            for(int val:row)
            {
                System.out.print(val+"\t");
            }
            System.out.println();
        }

    }
}