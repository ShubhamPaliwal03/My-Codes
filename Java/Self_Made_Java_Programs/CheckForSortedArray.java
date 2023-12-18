import java.util.Scanner;

class CheckForSortedArray
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nEnter the size of the array : ");

        int arr[] = new int[kb.nextInt()];

        System.out.print("\nEnter "+arr.length+" elements into the array : ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=kb.nextInt();
        }
        
        // checking if the array is sorted in ascending order

        boolean asc_flag = false;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] > arr[i]) // if the consecutive elements don't follow the sorted ascending order 
            {
                asc_flag = true;

                break;
            }
        }

        // checking if the array is sorted in descending order

        boolean desc_flag = false;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] < arr[i])
            {
                desc_flag = true;

                break;
            }   
        }

        // checking if all the elements are equal

        boolean equal_flag = false;

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] != arr[i])
            {
                equal_flag = true;

                break;
            }
        }


        if(equal_flag == false)
        {
            System.out.println("\nThe array you entered is sorted and all the elements of the array are equal...");
        }
        else if(asc_flag == false || desc_flag == false)
        {
            if(asc_flag == false)
            {
                System.out.println("\nThe array you entered is sorted in ascending order...");
            }
            else
            {
                System.out.println("\nThe array you entered is sorted in descending order...");
            }
        }
        else
        {
            System.out.print("\nThe array you entered is not sorted in any order!\n\nWould you like to sort it? :\n\n1. Yes\n2. No\n\n(Press the key of your choice (1/2...) !)\n\nYour choice : ");

            int choice = kb.nextInt();

            if(choice == 1)
            {
                System.out.print("\nChoose the order in which you want to sort the array : \n\n1. Ascending Order\n2. Descending Order\n\n(Press the key of your choice (1/2) !)\n\nYour choice : ");

                choice = kb.nextInt();

                switch(choice)
                {
                    case 1: 

                        // using the straight selection sort algorithm to sort the array in ascending order

                        for(int i = 0; i < arr.length - 1; i++)
                        {
                            for(int j = i + 1; j < arr.length; j++)
                            {
                                if(arr[i] > arr[j])
                                {
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }

                        System.out.print("\nThe array in sorted ascending order is : ");

                        for(int i=0;i<arr.length;i++)
                        {
                            System.out.print(arr[i]+" ");
                        }

                        break;

                    case 2:

                        // using the straight selection sort algorithm to sort the array in descending order

                        for(int i = 0; i < arr.length; i++)    
                        {
                            for(int j = i + 1; j < arr.length - 1; j++)
                            {
                                if(arr[i] < arr[j])
                                {
                                    int temp = arr[i];

                                    arr[i] = arr[j];

                                    arr[j] = temp;
                                }
                            }
                        }

                        System.out.print("\nThe array in sorted descending order is : ");

                        for(int i=0;i<arr.length;i++)
                        {
                            System.out.print(arr[i]+" ");
                        }

                        break;

                    default:
                    
                        System.out.print("\nInvalid Choice!...Exiting from the program...");
                }
            }
            else
            {
                System.out.print("\nSuccessfully exited from the program...");

                System.exit(0); // terminate the program
            }
        }

        kb.close();
    }
}