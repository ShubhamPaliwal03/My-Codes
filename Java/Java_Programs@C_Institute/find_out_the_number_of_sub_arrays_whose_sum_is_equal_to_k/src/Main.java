import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the value of k : ");
        int k = kb.nextInt();

        System.out.print("\nEnter the size of the array : ");

        int[] arr = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements in the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        kb.close();

        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int sum = 0;

                for(int l=i;l<=j;l++)
                {
                    sum = sum + arr[l];
                    // System.out.print(arr[l]+" ");
                }
                
                // System.out.println();
                
                if(sum==k)
                {
                    count++;
                }
            }
            // System.out.println();
        }

        System.out.print("\nThere are "+count+" sub arrays whose sum is equal to "+k);

    }
}