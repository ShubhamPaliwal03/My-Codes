/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* buildArray(int* nums, int numsSize, int* returnSize)
{
    int* ans = (int*) malloc (sizeof(int) * numsSize);
    
    *returnSize = numsSize;
    
    int i;
    
    for(i=0;i<numsSize;i++)
    {
        scanf("%d",&nums[i]);
    }

    for(i=0;i<numsSize;i++)
    {
        ans[i]=nums[nums[i]];
    }

    return ans;
}