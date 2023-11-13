#include<stdio.h>
int main()
{
    int arr[100],i,j,temp,size;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements into the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    /*sorting*/
    for(i=0;i<size-1;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    printf("\nThe Sorted array is : ");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}