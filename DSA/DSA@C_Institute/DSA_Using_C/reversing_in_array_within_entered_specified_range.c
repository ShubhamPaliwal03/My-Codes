#include<stdio.h>
void Reverse(int arr[],int start,int end)
{
    int i,j;
    for(i=start,j=end;i<j;i++,j--)
    {
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
int main()
{
    int arr[100],i,j,size;

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

    printf("\n\nFrom where do you want to Start reversing ? (0 - %d) : ",size-1);
    scanf("%d",&i);

    printf("\nUpto where you want to reverse the array ? (%d - %d) : ",i+1,size-1);
    scanf("%d",&j);

    Reverse(arr,i,j);

    printf("\nThe Reversed array acc. the entered range of (%d - %d) is : ",i,j);
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}