#include<stdio.h>
int main()
{
    int pos[100],neg[100],arr[100],i,j,Psize,Nsize,size;

    printf("Enter the size of the array containing Positive values : ");
    scanf("%d",&Psize);

    printf("\nEnter the %d elements into the array containing Positive values : ",Psize);
    for(i=0;i<Psize;i++)
    {
        scanf("%d",&pos[i]);
    }

    printf("\nEnter the size of the array having Negative values : ");
    scanf("%d",&Nsize);

    printf("\nEnter the %d elements into the array containing Negative values : ",Nsize);
    for(i=0;i<Nsize;i++)
    {
        scanf("%d",&neg[i]);
    }

    /*merging the arrays*/
    for(i=0,j=0;i<Psize;i++,j++)
    {
        arr[i]=pos[j];
    }
    for(j=0;j<Nsize;j++,i++)
    {
        arr[i]=neg[j];
    }

    size = Psize + Nsize;
    // printf("\nThe array obtained after merging both the arrays containing positive and negative values is : ");
    printf("\nThe Merged array is : ");
    for(i=0;i<size;i++)
    {
        printf("%d ",arr[i]);
    }

    return 0;
}