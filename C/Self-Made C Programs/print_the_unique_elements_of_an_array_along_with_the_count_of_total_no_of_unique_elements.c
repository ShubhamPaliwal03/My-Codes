#include<stdio.h>
int main()
{
    int arr[100],i,j,size,temp,count,unq=0;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d element(s) into the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    /*implementing bubble sort*/
    for(i=0;i<size-1;i++)
    {
        for(j=0;j<size-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

    printf("\nThe Unique element(s) in the array is/are : ");
    for(i=0;i<size;i++)
    {
        count=0;

        while(arr[i]==arr[i+1])
        {
            count++;
            i++;
        }

        if(count==0)
        {
            unq++;
            printf("%d ",arr[i]);
        }
    }

    printf("\n\nThe Total number of unique element(s) in the array is/are : %d",unq);

    /* Test cases :-
    10 10 10 20 30 50 50
    10 10 10 20 30 30 50*/

    return 0;
}