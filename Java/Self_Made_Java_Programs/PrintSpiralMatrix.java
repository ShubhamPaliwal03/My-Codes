import java.util.Scanner;

class PrintSpiralMatrix
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the no. of rows in the matrix : ");
        int rows = kb.nextInt();

        System.out.print("\nEnter the no. of columns in the matrix : ");
        int cols = kb.nextInt();

        int mat[][] = new int[rows][cols];

        System.out.println("\nEnter the elements in the matrix of "+rows+" x "+cols+" :\n");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j] = kb.nextInt();
            }
        }

        int i=0,j=0;

        while(j<cols)
        {
            System.out.print(mat[i][j]+" -> ");
            j++;
        }

        if(j==cols)
        {
            i++;
            j--;
        }

        while(j<cols)
        {
            System.out.print(mat[i][j]+" -> ");
            i++;
            j++;
        }

        if(j==cols)
        {
            j--;
        }

        while(j>0)
        {
            System.out.print(mat[i][j]+" -> ");
            j--;
        }

        if(j<0)
        {
            j++;
        }

        while(i>rows/2)
        {
            System.out.print(mat[i][j]+" -> ");
            i--;
        }

        while(j<=rows/2)
        {
            System.out.print(mat[i][j]+" -> ");
            j++;
        }
    }
}