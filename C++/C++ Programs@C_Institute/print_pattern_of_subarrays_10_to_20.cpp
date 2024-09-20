#include<iostream>
using namespace std;
int main()
{
	int arr[]={10,20,30,40,50},i,j,k;
	for(i=0;i<5;i++)
	{
		for(j=i;j<5;j++)
		{
			for(k=i;k<=j;k++)
			{
				cout<<arr[k]<<" ";
			}
			cout<<"\n";
		}
	}
	return 0;
}