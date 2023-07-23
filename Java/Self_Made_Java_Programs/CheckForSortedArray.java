import java.util.Scanner;

class CheckForSortedArray
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int arr[] = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements into the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }

        kb.close();
        
        boolean flag = false;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    flag = true;
                }
            }
        }

        if(flag==true)
        {
            System.out.println("\nThe array you entered was not sorted!");
            System.out.println("\nThe array in sorted ascending order is : ");

            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            System.out.println("\nThe array you entered was already sorted!");
        }
    }
}