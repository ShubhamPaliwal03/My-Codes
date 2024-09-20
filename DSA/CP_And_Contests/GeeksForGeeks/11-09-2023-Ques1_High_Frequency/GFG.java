//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution 
{
    public static int countFreq(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();
        int res = 0;
 
        /* A loop to slide pat[] one by one */
        
        for (int i = 0; i <= N - M; i++) 
        {
            /* For current index i, check for pattern match */
        
            int j;
            
            for (j = 0; j < M; j++) 
            {
                if (txt.charAt(i + j) != pat.charAt(j)) 
                {
                    break;
                }
            }
 
            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            
            if (j == M) 
            {
                res++;
                
                j = 0;
            }
        }
        
        return res;
    }    
    
    public static String solve(int N, String S) 
    {
        // code here
        
        String res = "";
        int max = 0;
        
        for (int i = 0; i < S.length(); i++)
        {
            for (int j = i + 1; j <= S.length(); j++)
            {
                String temp = S.substring(i, j);
                int freq = countFreq(temp, S);
                
                if (freq > max || (freq == max && temp.compareTo(res) < 0))
                {
                    max = freq;
                    res = temp;
                }
            }
        }    
        
        return res;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException
    {
        var sc = new FastReader();
        int test = sc.nextInt();
        while(test-->0){
            int n = sc.nextInt();
            String s = sc.nextString();
            
            System.out.println(Solution.solve(n, s));
        }
    }
    
    public static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        private void read() throws IOException
        {
            st = new StringTokenizer(br.readLine());
        }

        public String nextString() throws IOException
        {
            while(!st.hasMoreTokens())
                read();
            return st.nextToken();
        }

        public int nextInt() throws IOException
        {
            return Integer.parseInt(nextString());
        }

        public long nextLong() throws IOException
        {
            return Long.parseLong(nextString());
        }
    }
}
// } Driver Code Ends