#include<stdio.h>
int main()
{
    int arr[]={1,2,3,4},arrSize,low,high,mid,k=2,missing;

	arrSize=sizeof(arr)/sizeof(arr[0]);
	
	low=0;
	high=arrSize-1;
	
    while(low<=high)
    {
        mid=low+(high-low)/2;

		missing = arr[mid] - (mid+1);
		
		if(missing>=k)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
     	}
    }

	printf("%d",high+k+1);
	
    return 0;
}