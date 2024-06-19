#include<iostream>
using namespace std;
int main()
{
	int nd,n[1000],i,m,r=0;
	cout<<"How many digit number you would like to enter : ";
	cin>>nd;
	
	cout<<"Enter the "<<nd<<" digit number seperated by spaces : ";
	for(i=0;i<nd;i++)
	cin>>n[i];
	
	for(i=nd-2;i>=1;i--)
	{
		m=n[i]%10;
		r=r*10+m;
		n[i]=n[i]/10;
	}
	
	cout<<"\nThe number with it's "<<nd-2<<" middle digits reversed is : "<<n[0]<<r<<n[nd-1];
	return 0;
}
