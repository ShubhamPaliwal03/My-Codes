#include<stdio.h>
int  main()
{
    int arr[10],i;
    printf("Enter the ten values of the array:\n");
    for(i=0;i<10;i++)
        scanf("%d",&arr[i]);
        printf("\nThe even values of the array are:\n");    
    for(i=0;i<10;i++)
    if(arr[i]%2==0)
    {
        printf("arr[%d]=%d\n",i,arr[i]);
	}
    return 0;
}
