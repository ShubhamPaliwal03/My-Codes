#include<iostream>
using namespace std;

int getSum(int arr[],int index)
{
	int sum=0;
	if(index<=5)//if(index==0)
//	return arr[index];
	{	
		sum=getSum(arr,index+1);
		sum=sum+arr[index];
	}
	return sum;
}
int main()
{
	int arr[]={10,20,30,40,50};
	int s = getSum(arr,0);
	cout<<"The Sum of elements of the array arr is : "<<s;
	return 0;
}