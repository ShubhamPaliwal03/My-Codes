import java.util.Scanner;

class Find1stAnd2ndMaxMinInArray
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = kb.nextInt();

        int arr[] = new int[size];

        System.out.print("\nEnter "+size+ " elements into the array : ");

        for(int i=0;i<size;i++)
        {
            arr[i] = kb.nextInt();
        }

        int max,min;

        max=min=arr[0];

        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }

            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        int s_max=min,s_min=max;

        for(int i=0;i<size;i++)
        {
            if(arr[i]<max && arr[i]>s_max)
            {
                s_max = arr[i];
            }
            
            if(arr[i]>min && arr[i]<s_min)
            {
                s_min = arr[i];
            }
        }
            
        System.out.println("\nAmong the elements of the array entered :-");
        System.out.print("---------------------------------------");

        System.out.print("\n\nMax        : "+max);

        // if(max==min)
        // {
        //     System.out.print("\n\nMin Does Not Exist!");
        // }
        // else
        // {
            System.out.print("\n\nMin        : "+min);
        // }
        
        // if(max==s_max)
        // {
        //     System.out.print("\n\nSecond Max Does Not Exist!");
        // }
        // else
        // {
            System.out.print("\n\nSecond Max : "+s_max);
        // }

        // if(min==s_min)
        // {
        //     System.out.print("\n\nSecond Min Does Not Exist!");
        // }
        // else
        // {
            System.out.print("\n\nSecond Min : "+s_min);
        // }
    }
}