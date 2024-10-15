#include<stdio.h>
int main()
{
    int arr[10],i;
    printf("Enter the ten numbers of the array:\n");
    for(i=0;i<10;i++)
    	scanf("%d",&arr[i]);
    	printf("\nThe values in the array are:\n");
    for(i=0;i<10;i++)
    	printf("arr[%d]=%d\n",i,arr[i]);
    return 0; 
}
