#include<stdio.h>
int main()
{
	int i,j,nums[1024],ans[1024],n;
	
	scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&nums[i]);
    }
    for(i=0;i<n;i++)
    {
        ans[i]=nums[i];
        printf("%d ",ans[i]);
    }
    for(i=n,j=2;i<2*n-1;i++,j++)
    {
        ans[i]=nums[n-j];
        printf("%d ",ans[i]);
    }
	return 0;
}