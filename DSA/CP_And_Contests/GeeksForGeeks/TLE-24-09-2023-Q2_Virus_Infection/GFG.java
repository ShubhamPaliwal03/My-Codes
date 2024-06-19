// Virus Infection
// Accuracy: 20.83%Submissions: 4K+Points: 35
// There are N people standing in a row, you are given a string s of length N where s[i] = '1' if ith person is infected with a virus and s[i] = '0' if not infected. Given K, ith person can infect up to K people on his left side and up to K people on his right side. Now the newly infected people can't further spread the virus.
// Find the total number of people who are infected with the virus.

// Example 1:

// Input:
// s = "00100100"
// K = 1
// Output:
// 6
// Explanation: Both third and sixth person
// can infect one person on their left side 
// and one on their right side.
// Example 2:

// Input:
// s = "0010100"
// K = 1
// Output:
// 5
// Explanation: Third person can infect one 
// person on his left side and one on his 
// right side. Fifth person can infect one
// person on his right side, the person on 
// the left side of fifth person already got
// infected by the third person.
// Your Task: You don't need to read input or print anything. Your task is to complete the function virusInfection( ) which takes the string s and integer K as input parameters and returns the total number of people who are infected with the virus.

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            int K = Integer.parseInt(read.readLine().trim());
            
            Solution ob = new Solution();
            int ans = ob.solve(S, K); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends




//User function Template for Java
class Solution 
{ 
    int solve(String s, int K) 
    { 
        // code here
        
        // using a HashSet to store the indices of 1's in the String
        
        HashSet<Integer> onesIndices = new HashSet <>();
        
        char[] str = s.toCharArray();
        
        for(int i = 0; i < str.length; i++)
        {
            if(str[i] == '1')
            {
                onesIndices.add(i);
            }
        }
        
        int count = 0;
        
        for(int index : onesIndices)
        {
            int left = index - 1;
            
            while(left >= 0)
            {
                if(left < index-K)
                {
                    break;
                }
                
                if(str[left] == '0')
                {
                    str[left] = '1';
                    
                    count++;
                }
                
                left--;
            }
            
            int right = index + 1;
            
            while(right < str.length)
            {
                if(right > index+K)
                {
                    break;
                }
                
                if(str[right] == '0')
                {
                    str[right] = '1';
                    
                    count++;
                }
                
                right++;
            }
        }
        
        return count + onesIndices.size();
    }
} 


// Certainly, let's further optimize your code. The key to optimizing this problem is to avoid repeatedly checking and modifying the same indices. You can achieve this by keeping track of the range of indices that each '1' affects. Here's an optimized version of your code:

// java
// Copy code
// import java.util.*;

// class Solution {
//     int solve(String s, int K) {
//         char[] str = s.toCharArray();
//         int n = str.length;

//         int count = 0;
//         int left = -1; // Initialize the left-most index that affects a '1'

//         for (int i = 0; i < n; i++) {
//             if (str[i] == '1') {
//                 // Calculate the range for the current '1'
//                 int start = Math.max(0, i - K);
//                 int end = Math.min(n - 1, i + K);

//                 // Update '0's in the range
//                 for (int j = start; j <= end; j++) {
//                     if (str[j] == '0') {
//                         str[j] = '1';
//                         count++;
//                     }
//                 }

//                 // Update left to the right of the current '1'
//                 left = end + 1;
//             }
//         }

//         // Count any remaining '0's to the right of the last '1'
//         for (int i = left; i < n; i++) {
//             if (str[i] == '0') {
//                 count++;
//             }
//         }

//         return count;
//     }
// }

// In this optimized code:

// We maintain a variable left to keep track of the rightmost index affected by the previous '1'. This avoids redundant iterations over the same indices.

// We calculate the range affected by the current '1' and update all '0's within that range.

// After processing all '1's, we count any remaining '0's to the right of the last '1'.

// This optimized code should have a time complexity of O(N), where N is the length of the input string s. It should be much more efficient than the previous versions of the code and should pass the given time limits.