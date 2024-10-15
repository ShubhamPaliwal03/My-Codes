// Subarray of length 2
// Accuracy: 15.38%Submissions: 13+Points: 35
// Given an array A[ ] of N elements.
// In one operation, you can select any subarray of length 2 and multiply all elements of that subarray by -1. You can do any number of operations (possibly zero).
// Your task is to maximize the sum of all elements of all subarrays of A[ ].

// Example 1:

// Input:
// N = 3
// A[] = {-1, -2, -3}
// Output: 14
// Explanation:
// We can do 1 operation on subarray from 
// index = 2 to index = 3. After performing 
// the operation, modified array A[] = 
// {-1, 2, 3}. All subarrays  of the  modified 
// array A[] are [-1], [2], [3], [-1, 2], [2, 3] 
// and [-1, 2, 3]. Thus total sum of all 
// subarrays is 14. This is the maximum sum 
// which we can get by performing the 
// operations.
// Example 2:

// Input:
// N = 2
// A[] = {0, 1}
// Output: 2
// Explanation: There is no need to do any 
// operation. All subarrays of the array A[] 
// are [0], [1] and [0, 1] and sum of all 
// subarrays = 0 + 1 + 1 = 2.
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function maxSum() which takes the array A[ ] and its size N as input parameters and returns the maximum sum of all subarrays after performing the above operations zero or more times optimally.

// Constraints :
// 1 ≤ N ≤ 105
// -103 ≤ A[i] ≤ 103

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.maxSum(N, A);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long maxSum(int N, int A[]) 
    { 
        // code here
        
        int count=0;
        
        for(int i=0;i<N;i++)
        {
            if(A[i]>=0)
            {
                count++;
            }
        }
        
        if(count!=N)
        {
            Arrays.sort(A);
            
            A[0] = A[0] * -1;
            A[1] = A[1] * -1;
        }
        
        int sum = 0;
        
        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum = sum + A[k];
                }
            }
        }
        
        return sum;
        
    }
} 