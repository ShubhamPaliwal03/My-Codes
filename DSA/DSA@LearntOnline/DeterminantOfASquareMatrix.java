import java.util.Scanner;

class DeterminantOfASquareMatrix
{
    public static int calculateDeterminant(int[][] matrix) 
    {
        int n = matrix.length;
        
        if(n == 1)
        {
            return matrix[0][0];
        }
        
        // to store the determinant of the current matrix
        
        int det = 0;
        
        // since we need to form n matrices of (n-1) * (n-1)
        
        for(int i = 0; i < n; i++)
        {
            // every time, we create a new matrix representing the minor of the current matrix
            // of order (n-1) * (n-1)
            
            int[][] minor_matrix = new int[n-1][n-1]; 
            
            for(int j = 1; j < n; j++)
            {
                int l = 0;
                
                for(int k = 0; k < n; k++)
                {
                    if(k != i)
                    {
                        // put the values into the minor matrix
                        
                        minor_matrix[j-1][l] = matrix[j][k];
                        
                        l++;
                    }
                }
            }
            
            // maintainig the alternating sign +, -, +, -, ....
            
            int sign = (i % 2 == 0) ? 1 : -1;
            
            // calling the function recursively to find the minors of the current matrix
            // we do this until the size of the matrix becomes 1
            
            // we will get the determinant of the complete matrix at the end 
            // by adding the determinants of all the minors, and theirs from their minors, and so on...
            
            det += sign * matrix[0][i] * calculateDeterminant(minor_matrix);
        }
        
        return det;
    }

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nEnter the size of the square matrix (like 4 for 4x4 matrix) : ");

        int n = kb.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("\nEnter the elements into the matrix of "+n+" x "+n+"\n");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = kb.nextInt();
            }
        }

        int determinant = calculateDeterminant(matrix);
 
        System.out.println("\nThe determinant of the given matrix is : " + determinant);
    }
}