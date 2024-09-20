#include<stdio.h>
int main()
{
    int arr[100],i,j,size,count,freq[100],uniq=0;

    printf("Enter the size of the array you want to enter : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements into the array : ",size);
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

    for(i=0;i<size;i++)
    {
        count=1;/*because every number will be atleast unique*/

        for(j=i+1;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                freq[j]=-1;/*if the element is already visited*/
            }
        }
        if(freq[i]!=-1)
        {
            freq[i]=count;
        }
    }

    printf("\nThe Unique element(s) in the array is/are : ");
    for(i=0;i<size;i++)
    {
        if(freq[i]==1)
        {
            printf("%d ",arr[i]);
            uniq++;
        }
    }

    printf("\n\nThe Total number of unique element(s) in the array is/are : %d",uniq);

    /* Test cases :-
    10 10 10 20 30 50 50
    10 10 10 20 30 30 50*/

    return 0;
}