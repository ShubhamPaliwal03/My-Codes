// Weird Island

// Accuracy: 78.63%Submissions: 5K+Points: 25
// Geek's island has weird rules. The king of the island ordered that if the price of any item is even then, it can only be used by boys, and if the price is odd, it can only be used by girls.
// A person can only buy one type of item else he/she is punished.
// The gender of a person on the island  can be determined by the type of item which he/she bought.
// Geek bought exactly two items, the cost of which is A and B respectively. 
// Return "He" if Geek is a boy, return "She" if Geek is a girl else return "Punished" if Gender cannot be determined.

 

// Example 1:

// Input:
// A = 3, B = 7
// Output: 
// She
// Explanation: 
// Both are odd.
// Example 2:

// Input:
// A = 2, B = 5
// Output: 
// Punished
// Explanation: 
// A is even and B is odd.
// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function solve( ) which takes integers A and B as input parameters and returns the answer as a string.

// Constraints:
// 1 ≤ A , B ≤ 109

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution 
{
    static String solve(int A, int B) 
    {
        //code here
        
        if(A%2==0 && B%2==0) // even prices
        {
            return "He";
        }
        else if(A%2==1 && B%2==1) // odd prices
        {
            return "She";
        }
        else // both
        {
            return "Punished";
        }
    }
}

//{ Driver Code Starts.

public class Main
{
    static FastIO f;
    
    public static void main(String args[]) throws IOException
    {
        f = new FastIO();

        System.out.print("\nEnter the number of test cases you want to check : ");
        
        int t = f.nextInt();
        
        while(t-->0)
        {
        	System.out.print("\n\nEnter the two costs that you want to check, space seperated : ");

            int A = f.nextInt(), B = f.nextInt();
            
            f.out(Solution.solve(A, B) + "\n");
        }
        
        f.flush();
    }
}

class FastIO
{
	BufferedReader br;
	PrintWriter bw, be;
	StringTokenizer st;

	public FastIO()
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new PrintWriter(System.out);
		be = new PrintWriter(System.err);
		st = new StringTokenizer("");
	}

	private void read() throws IOException
	{
		st = new StringTokenizer(br.readLine());
	}

	public String nextLine() throws IOException
	{
		return br.readLine();
	}

	public String next() throws IOException
	{
		while(!st.hasMoreTokens())
			read();
		return st.nextToken();
	}

	public int nextInt() throws IOException
	{
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException
	{
		return Long.parseLong(next());
	}

	public float nextFloat() throws IOException
	{
		return Float.parseFloat(next());
	}

	public double nextDouble() throws IOException
	{
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException
	{
		return next().charAt(0);
	}

	public void out(String s) throws IOException
	{
		bw.print(s);
	}

	public void flush() throws IOException
	{
		bw.flush();
		be.flush();
	}

	public void err(String s) throws IOException
	{
		be.print(s);
	}
}
// } Driver Code Ends