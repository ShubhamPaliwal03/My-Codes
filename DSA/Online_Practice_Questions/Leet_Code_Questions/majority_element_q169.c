#include<stdio.h>
int main()
{
    int i,j,k,key,maj=0,count[1000],temp,max,nums[]={1,3,1,1,4,1,1,5,1,1,6,2,2},numsSize;

    numsSize=sizeof(nums)/sizeof(nums[0]);

    for(i=0;i<numsSize-1;i++)
    {
        for(j=0;j<numsSize-i-1;j++)
        {
            if(nums[j]>nums[j+1])
            {
                temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
    }

    for(j=0;j<numsSize;j++)
    {
        key = nums[j];

        for(i=0;i<numsSize;i++)
        {
            if(nums[i] == key)
            {
                count[i]++;
            }

            if(count[i]>numsSize/2)
            {
            	for(k=0;k<sizeof(count)/sizeof(count[0]);k++)
            	{	
	            	if(count[k]>max)
	            	{
	                	max = count[k];
	                	maj=nums[max];
					}
				}
            }
        }
    }
    
	printf("Count : %d",count);

    printf("\nMajority element = %d",maj);

    return 0;
}  