#include<stdio.h>
int main()
{
    int arr[100],odd[100],even[100],i,j,k,size;

    printf("Enter the size of the array : ");
    scanf("%d",&size);

    printf("\nEnter the %d elements in the array : ",size);
    for(i=0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=0,j=0,k=0;i<size;i++)
    {
        if(arr[i]%2==0)/*in case of an even value*/
        {
            even[j]=arr[i];
            j++;
        }
        else/*in case of an odd value and zero*/
        {
            odd[k]=arr[i];
            k++;
        }
    }

    if(j!=0)
    {
        printf("\nThe Even values present in the array are : ");
        for(i=0;i<j;i++)
        {
            if(i<j-1)
                printf(" %d ,",even[i]);
            else/*in case of last (j-1)th element*/
                printf(" %d",even[i]);
        }
    }
    else
    {
        printf("\nNo Even values present in the array !");
    }

    if(k!=0)
    {
        printf("\n\nThe Odd values present in the array are : ");
        for(i=0;i<k;i++)
        {
            if(i<k-1)
                printf(" %d ,",odd[i]);
            else/*in case of last (k-1)th element*/
                printf(" %d",odd[i]);
        }
    }
    else
    {
        printf("\n\nNo Odd values present in the array !");
    }

    return 0;
}