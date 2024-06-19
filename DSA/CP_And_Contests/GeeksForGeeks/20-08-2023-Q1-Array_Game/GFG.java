// Array Game
// Accuracy: 100.0%Submissions: 2+Points: 25
// You are playing an array game in which you are given two arrays arr and brr, each of size n. Each array is a permutation of n positive integers. 

// In one operation, you can perform either of the following two steps:

// Rotate the array arr anti-clockwise.
// Remove the first element of both the arrays if they are the same.
// Find the minimum number of operations required to make both the arrays empty. 

// Example 1:

// Input:
// n = 3
// arr[] = {1, 2, 3}
// brr[] = {2, 1, 3}
// Output:
// 5
// Explanation:
// operation 1: Rotate arr anti-clockwise. 
// It becomes {2, 3, 1}.
// operation 2: Remove first element {2} from 
// both the arrays. arr = {3, 1} and brr = {1, 3}.
// operation 3: Rotate arr anti-clockwise. arr = {1, 3}.
// operation 4: Remove {1} from both the arrays. 
// operation 5: Remove {3} from both the arrays. 

// Example 2:

// Input:
// n = 2
// arr[] = {1, 2}
// brr[] = {2, 1}
// Output:
// 3
// Explanation:
// Rotate arr once and then remove both elements.

// Your Task:
// You don't need to print or output anything. Complete the function min_operations() which takes integer n, arrays arr and brr as input parameters and returns an integer denoting the minimum number of operations.


// Constraints:

// 1 <= n <= 500
// 1 <= arr[i] <= n
// 1 <= brr[i] <= n
// Both the arrays consists of elements from 1 to n, exactly once.

//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            
            int[] brr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.min_operations(n, arr, brr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution 
{
    public static int min_operations(int n, int[] arr, int[] brr) 
    {
        // code here
        
        int start = 0;
        int count = 0;
        
        while(start<n)
        {
            if(arr[start]==brr[start])
            {
                start++;
                
                count++;
            }
            else
            {
                int temp = arr[start];
                
                int j;
                
                for(j=start;j<=n-2;j++)
                {
                    arr[j] = arr[j+1]; 
                }
                
                arr[j] = temp;
                
                count++;
            }
        }
        
        return count;
    }
}