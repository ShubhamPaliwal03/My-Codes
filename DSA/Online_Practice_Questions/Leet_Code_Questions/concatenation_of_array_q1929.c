#include<stdio.h>
int main()
{
	int i,nums[1024],ans[1024],n;
//	n=sizeof(nums)/sizeof(nums[0]);
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
    for(i=n;i<2*n;i++)
    {
        ans[i]=nums[i-n];
        printf("%d ",ans[i]);
    }
	return 0;
}