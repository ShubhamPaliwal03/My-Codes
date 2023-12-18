import java.util.Scanner;

class TwoSum
{
    static int[] FindTwoSum(int[] arr, int target)
    {
        int[] res = {-1,-1};

        if(arr.length==0 || arr.length==1)
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
                    res[0] = i;
                    res[1] = j;

                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int[] arr = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements in the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        System.out.print("\nEnter the target sum : ");
        int target = kb.nextInt();

        kb.close();

        int[] res = FindTwoSum(arr,target);

        System.out.print("\n"+res[0]+" "+res[1]); // -1,-1 means no such indices exist
    }
}