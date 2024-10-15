#include<iostream>
using namespace std;
int getSum(int arr[],int index,int size)
{
	int sum=0;
	if(index<=size)
	{	
		sum=getSum(arr,index+1,size);
		sum=sum+arr[index];
	}
	return sum;
}

int main()
{
	int arr[100],size,i;
	printf("Enter the size of the array : ");
	scanf("%d",&size);
	printf("Enter the elements in the array : ");
	for(i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
	int s = getSum(arr,0,size);
	cout<<"The Sum of elements of the array arr is : "<<s;
	return 0;
}