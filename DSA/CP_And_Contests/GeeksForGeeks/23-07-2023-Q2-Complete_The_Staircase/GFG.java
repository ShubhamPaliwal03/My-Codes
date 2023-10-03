// Complete the Staircase
// Accuracy: 55.36%Submissions: 8K+Points: 25
// Geek has N bricks. He needs to build a staircase consisting of k rows where the ith row has exactly i bricks. If he starts from the first row, find the number of complete rows of the staircase that he will be able to build completely.

// Example 1:

// Input:
// N: 5
// Output: 2
// Explanation: 
// Row 1: X
// Row 2: X X
// Row 3: X X
// Only 2 rows are complete.

// Example 2:

// Input:
// N: 8
// Output: 3
// Explanation:
// X
// X X
// X X X
// X X
// Only 3 rows are complete.

// Your Task:
// You dont need to read input or print anything. Your task is to complete the function completeRows() which takes integer n as input parameter and returns the number of complete rows possible.


// Constraints:
// 1 <= n <= 109

//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
           int ans = ob.completeRows(n);
            
            System.out.println(ans);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution 
{
    public int completeRows(int n) 
    {
        //Your code here
        
        int count=0;
        
        for(int i=1;i<=n;i++)
        {
            if(n>=i)
            {
                count++;
                n = n - i;
            }
        }
        
        return count;
    }
}