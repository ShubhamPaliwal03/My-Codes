#include<stdio.h>
int main()
{
	int arr[]={100,-23,-23,404,100,23,23,23,3,404},arrSize,steps=0,i=0,j=0,target;
	
	arrSize = sizeof(arr)/sizeof(arr[0]);
	
	if(arrSize==1)
	{
		steps=0;
		j=0;
	}
	else if(arr[0]==arr[arrSize-1])
	{
		steps=1;
		j=1;
	}
	else
	{
		for(i=1;i<arrSize;i++)
		{	
			if(arr[i-1]==arr[arrSize-1] || arr[i+1]==arr[arrSize-1])
			{
				if(i!=j)
				{
					steps+=1;
					j=i;
				}
			}
			else if(arr[i]==arr[j] && i!=j)
			{
				steps++;
				j=i;
			}
			else
			{
				if(i!=j)
				{				
					steps=steps+(arrSize-1-i);
					j=i;
				}
			}
		}
	}
	
	printf("%d",steps);
	
	return 0;
}