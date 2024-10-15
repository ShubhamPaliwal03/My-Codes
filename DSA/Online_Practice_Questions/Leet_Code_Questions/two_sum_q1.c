#include<stdio.h>
int main()
{	
    int nums[100]={3,2,4},target=6,ans[5]={0},i,j,sum=0,numsSize=3;
	
    for(i=0;i<numsSize;i++)
    {
        for(j=i+1;j<numsSize;j++)
        {
            sum=nums[i]+nums[j];

            if(sum==target)
            {
                ans[0]=i;
                ans[1]=j;
            }
        }
    }
    
    for(i=0;i<2;i++)
    {
    	printf("%d ",ans[i]); //two indices which make the sum
	}
	
    return 0;
}