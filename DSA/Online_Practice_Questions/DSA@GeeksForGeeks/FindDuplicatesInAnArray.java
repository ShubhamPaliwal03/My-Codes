// Find duplicates in an array
// EasyAccuracy: 18.95%Submissions: 522K+Points: 2
// Learn Google Cloud with Curated Lab Assignments. Register, Earn Rewards, Get noticed by experts at Google & Land your Dream Job! 
// Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

// Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array. 

// Example 1:

// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: 
// -1
// Explanation: 
// There is no repeating element in the array. Therefore output is -1.
// Example 2:

// Input:
// N = 5
// a[] = {2,3,1,2,3}
// Output: 
// 2 3 
// Explanation: 
// 2 and 3 occur more than once in the given array.
// Your Task:
// Complete the function duplicates() which takes array a[] and n as input as parameters and returns a list of elements that occur more than once in the given array in a sorted manner. 

// Expected Time Complexity: O(n).
// Expected Auxiliary Space: O(n).

// Constraints:
// 1 <= N <= 105
// 0 <= A[i] <= N-1, for each valid i

//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class FindDuplicatesInAnArray
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number of test cases you want to process : ");

        int t = sc.nextInt();

        while (t-- > 0) 
        {
        	System.out.print("\nEnter the size of the array : ");

            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.print("\nEnter the "+n+" elements into the array : ");

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Solution g = new Solution();

            ArrayList<Integer> ans = g.duplicates(a, n);

            System.out.print("\nThe Duplicate elements of the array are : ");

            for (Integer val : ans) System.out.print(val + " ");

            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution 
{
    public static ArrayList<Integer> duplicates(int arr[], int n) 
    {
        // code here
        
        ArrayList<Integer> duplicates = new ArrayList <>();
        
        // to store the elements and thier respective frequency as key-value pairs
        
        HashMap<Integer, Integer> frequencyMap = new HashMap <>();
        
        for(int i = 0; i < n; i++)
        {
            if(!frequencyMap.containsKey(arr[i])) // if the element is unique and doesn't exist in the frequencyMap
            {
                frequencyMap.put(arr[i], 1); // adding the element to the frequencyMap and assigning it's freq as 1
            }
            else // if the element is a duplicate and it already exits in the frequencyMap
            {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1); // increasing the frequency of the element by 1
            }
        }
        
        for(Map.Entry<Integer, Integer> e : frequencyMap.entrySet())
        {
            // if the frequency(value) of an element(key) is greater than or equal to 2., ie it is a duplicate
            
            if(e.getValue() >= 2)
            {
                duplicates.add(e.getKey()); // adding the duplicate element to the list of duplicates
            }
        }
        
        if(duplicates.size() == 0) // ie., if no element is a duplicate, then add -1 to the list
        {
            duplicates.add(-1);
        }
        
        Collections.sort(duplicates); // sorting the list of duplicates in ascending order before returning them
        
        return duplicates;
    }
}