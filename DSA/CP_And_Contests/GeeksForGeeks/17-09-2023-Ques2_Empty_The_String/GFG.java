// Empty the String

// Accuracy: 29.55%Submissions: 8K+Points: 35
// Given a String s, In one operation we can delete any occurences of "geek" as a substring in the String. Find the number of delete operations you have to perform to make the String Empty. 

// Example 1:

// Input:
// s = "gegeekek"
// Output:
// 2
// Explanation:
// gegeekek
// We can first delete the bold characters
// which form "geek", and then delete the
// remaning string "geek" again from the string.
// So, we will need 2 operations

// Example 2:

// Input:
// s = "geekkgee"
// Output:
// -1
// Explanation:
// It's not possible to make the String empty.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function makeStringEmpty() which takes a String s as input and returns the minimum number of operations required to delete the String entirely. If it's not possible to do so return -1.

// Constraints:
// 1 <= |s| <= 105

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution 
{
    static int makeStringEmpty1(String s) 
    {
        // Method - 1, Most Optimised, Using Stack
        
        Stack<Character> stack = new Stack<>();
        
        int count = 0;

        for (char ch : s.toCharArray()) 
        {
            stack.push(ch);

            if (stack.size() >= 4 && stack.peek() == 'k' && stack.get(stack.size() - 2) == 'e' && stack.get(stack.size() - 3) == 'e' && stack.get(stack.size() - 4) == 'g') 
            {
                stack.pop();
                
                stack.pop();
                
                stack.pop();
                
                stack.pop();
                
                count++;
            }
        }

        return stack.isEmpty() ? count : -1;
    }

    // Method - 2, Optimised, Using String Builder

    static int makeStringEmpty2(String s) 
    {
        // code here
        
        StringBuilder string = new StringBuilder();
        
        string.append(s);
        
        int count = 0;
        
        int index = string.indexOf("geek");
        
        if(index==-1)
        
            return -1;
        
        while(index!=-1)
        {
            string.delete(index, index+4);
            
            count++;
            
            index = string.indexOf("geek");
        }
        
        if(string.length()==0)
        {
            return count;
        }
        
        return -1;
    }

    // Method - 3, a bit optimised, but stil uses the slow string concatenation method

    static int makeStringEmpty3(String s) 
    {
        // code here
        
        int count = 0;
        
        while(s.contains("geek"))
        {
            s = s.replaceFirst("geek", "");
            
            count++;
        }
        
        return s.isEmpty() ? count : -1;
    }

    // Method - 3, brute-force approach

    // uses string concatenation, which makes the process very slow and memory intensive, because it involves continuous instantization of string objects.

    static int makeStringEmpty4(String s) 
    {
        // code here
        
        int count = 0;
        
        int index = s.indexOf("geek");
        
        if(index==-1)
        
            return -1;
        
        while(index!=-1)
        {
            char[] str = s.toCharArray();
            
            String temp = "";
            
            for(int i=0;i<str.length;i++)
            {
                if(!(i>=index && i<index+4))
                {
                    temp = temp.concat(String.valueOf(str[i]));
                }
            }
            
            count++;
            
            s = temp;
            
            index = s.indexOf("geek");
        }
        
        if(s.length()==0)
        {
            return count;
        }
        
        return -1;
    }
};

//{ Driver Code Starts.
class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nEnter the number of test cases you want to check : ");

        int t = Integer.parseInt(read.readLine());

        while (t-- > 0)
        {
        	System.out.print("\n\nEnter the string you want to check : ");

            String s = read.readLine();

            Solution ob = new Solution();

            System.out.println(ob.makeStringEmpty1(s));
        }
    }
}
// } Driver Code Ends