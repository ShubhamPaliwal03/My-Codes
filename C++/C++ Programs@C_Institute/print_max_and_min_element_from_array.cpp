#include<iostream>
using namespace std;
int main()
{
	int n,i,a[1024],min,max;
	cin>>n;
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	min=max=a[0];
	for(i=1;i<n;i++)
	{
		
		if(a[i]>max)
		{
			max=a[i];
		}
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	cout<<max<<endl<<min<<endl;
	return 0;
}