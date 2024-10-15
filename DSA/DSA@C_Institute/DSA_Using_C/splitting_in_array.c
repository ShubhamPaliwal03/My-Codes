#include<stdio.h>
int main()
{
    int arr[100],pos[100],neg[100],i,j,k,size;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements in the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=0,j=0,k=0;i<size;i++)
    {
        if(arr[i]<0)/*in case of a negative value*/
        {
            neg[j]=arr[i];
            j++;
        }
        else/*in case of a positive value and zero*/
        {
            pos[k]=arr[i];
            k++;
        }
    }

    printf("\nThe Positive values present in the array are : ");
    for(i=0;i<k;i++)
    {
        printf("%d ",pos[i]);
    }

    printf("\n\nThe Negative values present in the array are : ");
    for(i=0;i<j;i++)
    {
        printf("%d ",neg[i]);
    }

    return 0;
}