#include<stdio.h>
int main()
{
    int arr[100],i,j,size,count,temp,dup[100],dupl=0;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements into the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    /*implementing straight selection sort*/
    for(i=0;i<size-1;i++)
    {
        for(j=i+1;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    printf("\nThe duplicate elements is/are : ");
    for(i=0;i<size;i++)
    {
        count=0;

        while(arr[i]==arr[i+1])
        {
            count++;
            i++;
        }

        if(count!=0)/*&& dup[i]!=1*/
        {
            printf("%d ",arr[i]);
            // dup[i]=1;
            dupl++;
        }
    }
    printf("\nThe Total number of duplicate element(s) in the array is/are : %d",dupl);
    
    return 0;
}