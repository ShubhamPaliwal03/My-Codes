#include<stdio.h>
int main()
{
    int arr[100],size,i,j;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements into the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    printf("\nThe array is : ");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    /*reversing*/
    for(i=0,j=size-1;i<j;i++,j--)
    {
        //Logic of swapping values of 2 variables

        //We swap the nth first and nth last values using the two pointer approach
        //i and j are two pointers here, one moves forward and the other one moves backwards, 
        //we stop where they meet, so we can either use the condition i<j or i!=j in the loop

        // Swapping without using 3rd variable

        // arr[i]=arr[i]+arr[j];
        // arr[j]=arr[i]-arr[j];
        // arr[i]=arr[i]-arr[j];

        // Swapping with using 3rd variable

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    printf("\n\nThe Reversed array is : ");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}