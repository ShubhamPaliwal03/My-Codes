// String Matching
// Accuracy: 47.3%Submissions: 4K+Points: 35
// Given an array of words containing n strings of the same lengths.

// In one move, you can choose any position in any one string and change the letter at that position to the previous or next letter in alphabetical order. For example:

// 'c' can be changed to 'd' or 'b'.
// 'a' can only be changed to 'b'.
// 'z' can only be changed to 'y'.
// Find the minimum difference over all the possible pairs of the n strings.

// The difference between the two strings is the minimum number of moves required to make them equal. 

 

// Example 1:

// Input:
// n = 5
// words[] = { "cdd", "zba","dgf","xyz","mnp"}
// Output: 6
// Explanation:
// Among all the pairs, the minimum difference 
// is between the pairs ["cdd", "dgf"].
// Convert 'c' to 'd' in one move.
// Convert 'd' to 'g' in three moves.
// Convert 'd' to 'f' in two moves.
// Example 2:

// Input:
// n = 3
// words[] = {"ab","ab","ab"}
// Output: 0

// Your Task:
// You don't need to print or input anything. Complete the function minimum_difference() which takes integer n and words[ ] as input parameters and returns minimum possible difference.


Constraints:

2 <= n <= 50
1 <= words[i].length() <= 8
All strings are of same length.
Each string consists of lowercase English alphabet.



//{ Driver Code Starts
import java.io.*;
import java.util.*;

class StringArray {
    public static String[] input(BufferedReader br, int n) throws IOException {
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine().trim();
        }
        return s;
    }

    public static void print(String[] a) {
        for (String e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a) {
        for (String e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            String[] words = StringArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimum_difference(n, words);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends




class Solution 
{
    public static int minimum_difference(int n, String[] words) 
    {
        // code here
        
        int[] move = new int[words.length*words.length];
        int k=0;
        
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                int moves=0;
                
                for(int l=0;l<words[0].length();l++)
                {
                    int diff=0;
                    
                    if((words[i].charAt(l))!=(words[j].charAt(l)))
                    {
                        int val1 = (int)words[i].charAt(l);
                        int val2 = (int)words[j].charAt(l);
                        
                        if(val1>val2)
                        {
                            diff = val1 - val2;
                        }
                        else
                        {
                            diff = val2 - val1;
                        }
                        
                        moves = moves + diff;
                    }
                    
                }
                
                move[k] = moves;
                k++;

            }
            
        }
        
        int min=move[0];
        
        for(int i=0;i<move.length;i++)
        {
            if(move[i]<min && move[i]!=0)
            {
                min = move[i];
            }
        }
        
        return min;
    }
}
