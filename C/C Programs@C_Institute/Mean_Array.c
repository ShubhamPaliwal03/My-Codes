#include<stdio.h>
int main()
{
    int N,K,i,arr[100],j,mean,count,Ai,Aj;
    printf("Enter the size of the array 'A' or the value of N:\n" );
    scanf("%d",&N);
    printf("Enter the value of the average of the two indices or the value of K:\n");
    scanf("%d",&K);
    printf("Enter the elements of the array:\n");
    for(i=0;i<N;i++)
    scanf("%d",&arr[i]);
    for(i=0;i<N;i++)
    {
        for(j=i+1;j<N;j++)
        {
            Ai=arr[i];
            Aj=arr[j];
            mean=(Ai+Aj)/2;
            if(mean>=K)
            count++;
        }
    }
    printf("The number of pairs satisfying the above condition is %d",count);
    return 0;
}