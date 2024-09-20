// Silver and Gold
// Accuracy: 33.55%Submissions: 7K+Points: 25
// There are N coins kept in a line. Each coin has two sides - one is colored gold and the other silver. You can flip two adjacent coins any number of times. You need to make the gold-colored side of every coin facing up. You are given the initial status of coins in a binary string s where '1' represents the gold side facing up and '0' represents the silver side facing up. If it is possible to make the gold-colored side of every coin facing up, return "Yes", otherwise return "No".

// Example 1: 

// Input:
// N = 8, s = "11001100"
// Output:
// Yes
// Explanation: 
// Flipping 3rd and 4th coin together and 7th 
// and 8th coin together will do the task.
// Example 2: 

// Input:
// N = 8, s = "10010100"
// Output:
// No
// Explanation: 
// It is not possible to make the gold 
// colored side of every coin facing up.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function flipCoins( ) which takes integer N and string s as input parameters and returns "Yes" or "No".

// Constraints:
// 1 ≤ N ≤ 106

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String S = br.readLine().trim();
            Solution ob = new Solution();
            
            System.out.println(ob.flipCoins(n,S));
                        
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution 
{
    public String flipCoins(int N,String s) 
    {
        // Code here
        
        char[] str = s.toCharArray();
        
        int count = 0;
        
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='0')
            {
                count++;
            }
        }
        
        if(count%2==0)
        {
            return "Yes";
        }
        
        return "No";
    }
}