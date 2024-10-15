import  java.util.Scanner;

class Main
{
    static void reverseArray(int[] arr)
    {
        int i,j;

        for(i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;
        }
    }

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the matrix : ");

        int[] arr = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements into the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }

        reverseArray(arr);

        System.out.print("\nThe Array after Reversing it is : ");

        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}