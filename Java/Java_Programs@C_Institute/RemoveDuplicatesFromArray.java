import java.util.Scanner;

class RemoveDuplicatesFromArray
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int size = kb.nextInt();

        int arr[] = new int[size];

        System.out.print("\nEnter "+size+" elements into the array : ");

        for(int i=0;i<size;i++)
        {
            arr[i] = kb.nextInt();
        }

        kb.close();

        // using a boolean array to store indices of all the duplicate elements as well as the number to whom the duplicates belong
        boolean sieve[] = new boolean[size];

        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {   
                // marking the indices of duplicates as true while rest of the elements remain false by default at the time of memory allocation
                if(arr[i]==arr[j])
                {
                    sieve[j] = true;
                }
            }
        }

		// for verifying the code with the values present in the sieve
        // System.out.println();
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(sieve[i]);
        // }

        System.out.print("\nAfter removing the duplicate elements from the array entered, the array is : ");

        for(int i=0;i<size;i++)
        {
            // to only print the non-duplicate elements
            if(sieve[i]!=true)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}