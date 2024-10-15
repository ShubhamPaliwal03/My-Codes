// First and last occurrences of x
// MediumAccuracy: 37.36%Submissions: 208K+Points: 4
// Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
// Given a sorted array arr containing n elements with possibly duplicate is to find indexes of first elements, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.


// Example 1:

// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  
// 2 5
// Explanation: 
// First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5. 
// Example 2:

// Input:
// n=9, x=7
// arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
// Output:  
// 6 6
// Explanation: 
// First and last occurrence of 7 is at index 6.
// Your Task:
// Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array arr, integer n and integer x as parameters and returns the required answer.

// Expected Time Complexity: O(logN)
// Expected Auxiliary Space: O(1).

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class FirstAndLastOccurencesOfX
{
    int lastBinarySearch(int[] arr, int size, int target)
    {
        int low = 0;
        
        int high = size-1;
        
        int last = -1; // initializing to -1 in case target is not found
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(arr[mid] == target) // ie., a potential occurence has been found
            {
                last = mid; // to store the index of the last potential occurence
                
                low = mid + 1; // to continue searching for the possible last occurence in the right subarray
            }
            else if(target > arr[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return last;
        
    }
    
    int firstBinarySearch(int[] arr, int size, int target)
    {
        int low = 0;
        
        int high = size-1;
        
        int first = -1; // initializing to -1 in case target is not found
        
        while(low <= high)
        {
            int mid = (low + high) / 2;
            
            if(arr[mid] == target) // ie., a potential occurence has been found
            {
                first = mid; // to store the index of the first potential occurence
                
                high = mid - 1; // to continue searching for the possible first occurence in the left subarray
            }
            else if(target > arr[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        
        return first;
        
    }
    
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        
        ArrayList<Integer> indices = new ArrayList <>();
        
        int first = firstBinarySearch(arr, n, x);
        
        int last = lastBinarySearch(arr, n, x);
        
        indices.add(first);
        
        indices.add(last);
        
        return indices;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends