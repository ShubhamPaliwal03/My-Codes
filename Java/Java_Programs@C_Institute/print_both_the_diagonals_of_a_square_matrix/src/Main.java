import java.util.Scanner;

class Main
{
    static int[][] PrintDiagonals(int[][] mat)
    {
        int [][] diag = new int [2][mat[0].length];

        int k=0,l=0,flag=0;

//        for(int i=0;i<mat.length;i++)
//        {
//            for(int j=0;j<mat.length;j++)
//            {
//                if(mat.length%2==1 && i==mat.length-2 && j==mat.length-2 && flag==0) // if the length of the matrix is odd and the conditions are true
//                {
//                    diag[1][mat.length - 2] = mat[mat.length - 2][mat.length - 2];
//                    flag = 1;
//                    l++;
//                }
//
//                if(i==j)
//                {
//                    diag[0][k] = mat[i][j];
//                    k++;
//                }
//                else if((i-j) == mat.length-1 || (j-i) == mat.length-1) {
//                    diag[1][l] = mat[i][j];
//                    l++;
//                }
//            }
//        }

        for(int i=0;i<mat.length;i++) // for diagonal
        {
            diag[0][i] = mat[i][i];
        }

        for(int i=0;i<mat.length;i++) // for anti-diagonal
        {
            diag[1][i] = mat[i][mat.length-i-1];
        }

        return diag;
    }

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the order of the matrix (like 2 for a matrix of 2 x 2) : ");

        int order = kb.nextInt();

        int[][] mat = new int[order][order];

        System.out.println("\nEnter elements into a matrix of order "+order+" x "+order+" :\n");

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j] = kb.nextInt();
            }
        }

        int[][] diag = PrintDiagonals(mat);

        System.out.println("\nThe Diagonals of the Matrix are :\n");

        for(int []row:diag)
        {
            for(int val:row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}