import java.util.Scanner;

class PrintSpiralMatrix
{
    static void printSpiralMatrix(int[][] mat)
    {
        int top = 0;
        int left = 0;
        int right = mat[0].length-1;
        int bottom = mat.length-1;

        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++) // for moving towards the right (left to right)
            {
                System.out.print(mat[top][i]+" -> ");
            }
            top++;

            for(int i=top;i<=bottom;i++) // for moving towards the bottom (top to bottom)
            {
                System.out.print(mat[i][right]+" -> ");
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--) // for moving towards the left (right to left)
                {
                    System.out.print(mat[bottom][i]+" -> ");
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)// for moving towards the top (bottom to top)
                {
                    System.out.print(mat[i][left]+" -> ");
                }
                left++;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the no. of rows in the matrix : ");
        int rows = kb.nextInt();

        System.out.print("\nEnter the no. of columns in the matrix : ");
        int cols = kb.nextInt();

        int mat[][] = new int[rows][cols];

        System.out.println("\nEnter elements in the matrix of "+rows+" x "+cols+" :\n");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j] = kb.nextInt();
            }
        }

        System.out.println("\nThe Matrix printed in spiral form is :\n");

        printSpiralMatrix(mat);
    }
}