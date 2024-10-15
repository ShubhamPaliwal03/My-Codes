import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int[] arr = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements into the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        kb.close();

        int max = 0, start=0, end=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum = 0;

                int k;

                for(k=i;k<=j;k++)
                {
                    sum = sum + arr[k];
                }

                if(sum>max)
                {
                    max = sum;

                    start = i;
                    end = k - 1;
                }
            }
        }

        System.out.print("\nThe Maximum Sum Sub-Array is : ");

        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nThe Sum of the elements of this array is Maximum among the whole array, which is equal to : "+max);
    }
}