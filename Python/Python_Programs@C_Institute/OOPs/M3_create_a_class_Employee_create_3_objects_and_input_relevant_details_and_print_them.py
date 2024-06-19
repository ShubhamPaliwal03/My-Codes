import java.util.Scanner;

class TwoSum
{
    static []int FindTwoSum(int[] arr, int target)
    {
        int[] res = {};

        if(arr.length==0)
        {
            return res; 
        }

        int sum=0;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum = arr[i] + arr[j];

                if(sum==target)
                {
                    res = {i,j};

                    return res;
                }
            }
        }
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int[] arr = new int[kb.nextInt()];

        System.out.print("Enter "+arr.length+" elements in the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        System.out.print("Enter the target sum : ");
        int target = kb.nextInt();

        int[] res = FindTwoSum(arr,target);
    }
}