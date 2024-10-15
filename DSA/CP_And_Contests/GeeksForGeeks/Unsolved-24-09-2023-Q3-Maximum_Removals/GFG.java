// Maximum Removals
// Accuracy: 16.94%Submissions: 617+Points: 40
// There are N houses on the Geekstreet where the population of ith house is given by Ai. 
// Let there are m distinct subsequences of houses whose sum of population adds upto X. Two subsequences are different if there is atleast one house which is not common in both subsequences.
// Geek wants to remove maximum number of houses such that the number of distinct subsequences of houses whose sum of population adds upto X remains same i.e. m.
// Find maximum number of houses Geek can remove.

// Example 1: 

// Input:
// N = 6, X = 4
// A[] = {1, 3, 2, 3, 4, 5}
// Output:
// 2
// Explanation: 
// Geek can remove 3rd and 6th house.
// Example 2: 

// Input: 
// N = 4, X = 4 
// A[] = {3, 3, 3, 3} 
// Output: 
// 4
// Explanation: 
// Geek can remove all houses.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function maxRemoval( ) which takes N, A[ ], and X as input parameters and returns maximum number of houses Geek can remove.

// Expected Time Complexity: O(N * X)
// Expected Auxiliary Space: O(X)

// Constraints:
// 1 ≤ N ≤ 500
// 1 ≤ X ≤ 10000
// 1 ≤ Ai ≤ 100

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            int A[]= new int[N];
            input_line = read.readLine().trim().split("\\s+");
            for(int i = 0; i < N; i++){
                A[i] = Integer.parseInt(input_line[i]);
            }
            Solution ob = new Solution();
            int ans = ob.maxRemoval(N, A, X);
            System.out.println(ans);
        }
    } 
} 


// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    int maxRemoval(int N, int A[], int X) 
    { 
        // code here
    }
} 

//{ Driver Code Starts.

// } Driver Code Ends