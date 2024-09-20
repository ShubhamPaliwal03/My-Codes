//{ Driver Code Starts
import java.util.*;
import java.io.*;
class WhatMeanDoYouMean{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
        System.out.print("Enter the number of test cases you want to check : ");
        int t = Integer.parseInt(br.readLine().trim());
        Solution soln = new Solution();
        while(t-- > 0){
            System.out.println("\n\nEnter the following data in space seperated format or in new lines : ");
            System.out.print("\n\nSize of the array (n)");
            System.out.print("\n\nNumber k that you want to multiply the two selected indices with and replace them in the array and check if the mean of the array becomes equal to x : ");
            System.out.print("\n\nValue x with whom you want to compare the mean of the array\n\n");
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int x = Integer.parseInt(s[2]);
            int arr[] = new int[n];
            System.out.print("\nEnter "+n+" values in the array (space seperated or in new lines ) : ");
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(s[i]);
            ot.println(
                soln.IsMean(n, k, x, arr) ? "\nIt is 'POSSIBLE' to perform the operation in such a way that the the mean (average) of the resulting array is equal to a given value x" : "It is 'NOT POSSIBLE' to perform the operation in such a way that the the mean (average) of the resulting array is equal to a given value x"
            );
        }
        ot.close();
    }
} 
// } Driver Code Ends


class Solution{
    public boolean IsMean(int n, int k, int x, int arr[]) 
    {
        // Code Here.
        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
        }

        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {

                int iVal = arr[i] * k;
                int jVal = arr[j] * k;
                
                double new_sum = sum - (arr[i]+arr[j]) + (iVal+jVal);
                
                double mean = new_sum/n;
                
                System.out.println("new_sum : "+new_sum);
                System.out.println("i : "+arr[i]);
                System.out.println("j : "+arr[j]);
                System.out.println("iVal : "+iVal);
                System.out.println("jVal : "+jVal);
                System.out.println("Mean : "+mean);
                
                if(mean==(double)x)
                { 
                    return true;
                }
            }
        
        }
        
        return false;
        
    }
}

/* TEST CASES */

/*

1.  10 10 16
    2 2 5 7 3 4 5 4 8 6

    O/P : 0 or NOT POSSIBLE

2.  6 3 26
    9 4 3 2 1 2

    O/P : O or NOT POSSIBLE

3.  3 5 6
    1 2 3
    
    O/P : POSSIBLE

4.      

 */