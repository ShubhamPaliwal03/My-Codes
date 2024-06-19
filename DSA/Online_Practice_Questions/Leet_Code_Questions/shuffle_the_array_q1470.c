#include<stdio.h>
int main()
{ 
    int i,j=0,nums[1000],shuffle[1000],numsSize;
    scanf("%d",&numsSize);
    for(i=0;i<2*numsSize;i++)
    {
        scanf("%d",&nums[i]);
    }
    for(i=0;i<2*numsSize;i++)
    {
    	shuffle[j++]=nums[i];
        shuffle[j++] = nums[i+numsSize];
    }
	for(i=0;i<2*numsSize;i++)
    {
        printf("%d ",shuffle[i]);
    }    
    return 0;
}