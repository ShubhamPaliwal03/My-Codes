// Construction of a string
// Accuracy: 64.08%Submissions: 4K+Points: 25
// Given two integers N and K, construct a string of length N such that it contains lowercase english alphabet characters and each substring of length K contains at least 1 vowel and 1 consonant. 
// A substring is a string which can be obtained from other string by removing some (possibly zero) characters from the beginning as well as the end.

// Example 1:

// Input:
// N = 4
// K = 3
// Output: 
// geek
// Explanation: 
// There are two substrings of length 3.
// The substrings of length 3 are "gee" and 
// "eek". Both contains at least 1 vowel and 
// 1 consonant.
// Example 2:

// Input:
// N = 2
// K = 2
// Output: 
// iz
// Your Task: 
// You don't need to read input or print anything. Complete the function construct( ) which takes the integer N and the integer K as input parameters and returns the required string. In case of multiple answers you can return any string S.
// Note: The driver code will print 1 if your string S statisfies all above conditions otherwise it will print 0.

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
            int K = Integer.parseInt(input_line[1]);

            Solution ob = new Solution();
            String ans = ob.construct(N, K); 
            int ok=1;
            if(ans.length()!=N)
            ok=0;
            int lastVowel=-1,lastConsonant=-1;
            for(int i=0;i<ans.length();i++){
                char ch = ans.charAt(i);
                if(ch<'a'||ch>'z')
                    ok=0;
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    lastVowel=i;
                else 
                    lastConsonant=i;
                if(i>=K-1){
                    if(lastVowel>=i-K+1&&lastConsonant>=i-K+1);
                    else
                        ok=0;
                }
            }
            System.out.println(ok);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String construct(int N, int K) 
    { 
        // code here
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 1; i <= N; i++)
        {
            if(i % 2 == 0)
            {
                str.append("g");
            }
            else
            {
                str.append("e");
            }
        }
        
        return str.toString();
    }
} 