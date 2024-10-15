import java.util.Scanner;

class FindPivotIndexOfArray
{
    static int PivotIndexOfArray()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = kb.nextInt();

        int array[] = new int[size];

        System.out.print("\nEnter "+size+" values into the array : ");

        for(int i=0;i<size;i++)
        {
            array[i] = kb.nextInt();
        }

        kb.close();

        int k=0;
        while(k<size)
        {
            int i=k-1,l_sum=0,j=k+1,r_sum=0;

            while(i>=0)
            {
                l_sum+=array[i];
                i--;
            }

            while(j<size)
            {
                r_sum+=array[j];
                j++;
            }

            // for verifying the logic
            // System.out.println(k+" "+l_sum);
            // System.out.println(k+" "+r_sum);

            if(l_sum==r_sum)
            {
                return k;
            }

            k++;
        }
        
        return -1;
    }

    public static void main(String args[])
    {
        int pivot_index = PivotIndexOfArray();

        String result =  pivot_index==-1 ? "\nNo Pivot Index exists for the Array entered!" : "\nThe Pivot Index of the Array entered is : "+pivot_index;

        System.out.print(result);
    }
}