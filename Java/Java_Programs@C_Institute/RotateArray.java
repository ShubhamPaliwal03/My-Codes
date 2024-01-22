import java.util.Scanner;

class RotateArray 
{
    public static void rotate1(int[] nums, int k) 
    {
        int count=0;
        
        while(count!=k)
        {
            int last = nums[nums.length-1];

            int i=nums.length-1;

            while(i>=1)
            {
                nums[i] = nums[i-1];
                i--;
            }

            nums[0] = last;

            count++;
        }

        for(int val:nums)
        {
            System.out.print(val+" ");
        }
    }

    public static void rotate2(int[] nums, int k)
    {
        int arr[] = new int[nums.length];

        // copy the last k elements iinto the array arr at the start

        for(int i=0,j=nums.length-k;i<k;i++,j++)
        {
            arr[i] = nums[j];
        }

        // copy the first arr.length-k elements into the second array

        for(int j=0,i=k;j<arr.length-k;j++,i++)
        {
            arr[i] = nums[j];
        }

        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }

    public static void rotate3(int[] nums, int k)
    {
        // Reverse the first nums.length-k elements

        for(int i=0,j=nums.length-k-1;i<j;i++,j--)
        {
            int t   = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        // Reverse the last k elements

        for(int i=nums.length-k,j=nums.length-1;i<j;i++,j--)
        {
            int t   = nums[i];
            nums[i] = nums[j];
            nums[j] = t;            
        }

        // Reverse the whole array
        
        for(int i=0,j=nums.length-1;i<j;i++,j--)
        {
            int t   = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        for(int val:nums)
        {
            System.out.print(val+" ");
        }
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");

        int arr[] = new int [kb.nextInt()];

        System.out.print("Enter "+arr.length+" values in the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        // rotate1(arr,3);

        // System.out.println();

        // rotate2(arr,3);

        // System.out.println();

        rotate3(arr,2);        
    }
}