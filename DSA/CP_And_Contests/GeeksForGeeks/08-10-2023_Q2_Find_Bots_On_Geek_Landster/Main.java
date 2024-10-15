//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class Main{
 
    public static BufferedReader br;
    public static PrintWriter ot;

	public static void main (String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        
        while(t-->0){
            String usernames[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(usernames[0]);
            usernames  = br.readLine().trim().split(" ");
            int ans[] = new Solution().findBots(usernames , n);
            for(int x : ans)
                ot.print(x + " ");
            ot.println();
        }
        ot.close();
    }
     
  
}

// } Driver Code Ends
//User function Template for Java

class Solution
{
    public boolean checkPrime(int num)
    {
        if(num == 1) // corner case in this logic
        {
            return false; 
            
            // 1 is non-prime because it has only one factor, ie., 1 itself
            // but, for a number to be prime, it should exactly have 2 divisors, ie., 1 and the number itself
        }
        
        int i = 2;
        
        while(i * i <= num)
        {
            if(num % i == 0)
            {
                return false;
            }
            
            i++;
        }
        
        if(i * i > num)
        {
            return true;
        }
        
        return false;
    }
    
    public int[] findBots(String usernames[], int n)
    {
        // Code Here. 
        
        int[] result = new int[n]; 
        
        int ind = 0;
        
        for(String str : usernames)
        {
            int count = 0;
            
            HashMap <Character, Integer> frequencyMap = new HashMap <>();
            
            for(int i = 0; i < str.length(); i++)
            {
                if(i % 2 == 0) // when the index is even
                {
                    if(!frequencyMap.containsKey(str.charAt(i))) // if the current character is not in the HashMaap
                    {
                        frequencyMap.put(str.charAt(i), 1); // initializing its frequency by 1
                        
                        count++;
                    }
                    else // if we encounter a duplicate character
                    {
                        frequencyMap.put(str.charAt(i), frequencyMap.get(str.charAt(i))+1); // increasing it's frequency by 1
                    }
                }
            }
            
            if(checkPrime(count))
            {
                result[ind] = 1;
            }
            else
            {
                result[ind] = 0;
            }
            
            ind++;
        }
        
        return result;
    }
}



//{ Driver Code Starts.

// } Driver Code Ends