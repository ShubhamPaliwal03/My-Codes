// Stickler Thief
// MediumAccuracy: 37.98%Submissions: 201K+Points: 4
// Join the most popular course on DSA. Master Skills & Become Employable by enrolling today! 
// Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. ith house has a[i] amount of money present in it.

// Example 1:

// Input:
// n = 5
// a[] = {6,5,5,7,4}
// Output: 
// 15
// Explanation: 
// Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.
// Example 2:

// Input:
// n = 3
// a[] = {1,5,3}
// Output: 
// 5
// Explanation: 
// Loot only 2nd house and get maximum amount of 5.
// Your Task:
// Complete the functionFindMaxSum() which takes an array arr[] and n as input which returns the maximum money he can get following the rules.

// Expected Time Complexity:O(N).
// Expected Space Complexity:O(N).

// Constraints:
// 1 ≤ n ≤ 105
// 1 ≤ a[i] ≤ 104

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
    public static void main (String[] args)
     {
      
      //taking input using Scanner class
      Scanner sc = new Scanner(System.in);
      
      //taking count of testcases
      int t = sc.nextInt();
      while(t-- > 0){
          
          //taking count of houses
          int n = sc.nextInt();
          int arr[] = new int[n];
          
          //inserting money present in 
          //each house in the array
          for(int i = 0; i<n; ++i)
               arr[i] = sc.nextInt();
          
          //calling method FindMaxSum() of class solve
          System.out.println(new Solution().FindMaxSum(arr, n));
     }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    
    public int helper(int[] houses, int index, int[] memo)
    {
        if(index >= houses.length)
        {
            return 0;
        }
        
        // check if the result for the current index is already calculated
        
        if(memo[index] != -1)
        {
            return memo[index];
        }
        
        int loot = houses[index];
        
        int consider = helper(houses, index + 2, memo) + loot;
        
        int do_not_consider = helper(houses, index + 1, memo);
        
        memo[index] = Math.max(consider, do_not_consider);
        
        return memo[index];
    }
    
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        
        // creating an array named memo to memorise the already calculated values
        // in order to reduce the time complexity drastically, because of the memorization technique.
        
        int memo[] = new int[n];
        
        // initialize the memorization array with -1 to indicate uncalculated valeus
        
        Arrays.fill(memo, -1);
        
        int index = 0;
        
        return helper(arr, index , memo);
    }
}