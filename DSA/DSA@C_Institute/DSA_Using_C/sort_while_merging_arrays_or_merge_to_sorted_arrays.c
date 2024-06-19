#include<stdio.h>
int main()
{
    int arr1[50],arr2[50],arr[100],size1,size2,size,i,j,k;

    printf("Enter the size of the 1st array : ");
    scanf("%d",&size1);

    printf("\nEnter the %d elements into 1st array : ",size1);
    for(i=0;i<size1;i++)
    {
        scanf("%d",&arr1[i]);
    }

    printf("\nEnter the size of the 2nd array : ");
    scanf("%d",&size2);

    printf("\nEnter the %d elements into 2nd array : ",size2);
    for(i=0;i<size2;i++)
    {
        scanf("%d",&arr2[i]);
    }

    for(i=0,j=0,k=0;j<size1 && k<size2;i++)
    {
        if(arr1[j]<arr2[k])
        {
            arr[i]=arr1[j];
            j++;
        }
        else/*if(arr1[j]>=arr2[k])*/
        {
            arr[i]=arr2[k];
            k++;
        }
    }

    for(;j<size1;i++,j++)
    {
        arr[i]=arr1[j];
    }

    for(;k<size2;k++,i++)
    {
        arr[i]=arr2[k];
    }

    size = size1 + size2;
    printf("\nThe Merged and Sorted array obtained is as follows : ");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}