#include<iostream>
using namespace std;
int main()
{
	int arr[]={1,2,3,2,-2,1},n,i,j,k,sum=0,count=0;
	cout<<"Enter the value of n : ";
	cin>>n;
	cout<<"The subarrays which have sum equal to "<<n<<" are : ";
	for(i=0;i<6;i++)
	{
		for(j=i;j<6;j++)
		{
			for(k=i;k<=j;k++)
			{
				sum=arr[i]+arr[j];
				if(sum==n)
				{
					cout<<arr[i]<<" ";
					cout<<arr[j];
					cout<<endl;
					count++;
				}
			}
		}
	}
	cout<<"The number of subarrays which have sum equal to "<<n<<" are : ";
	return 0;
}