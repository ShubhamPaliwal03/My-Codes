#include<iostream>
using namespace std;
int main()
{
	int n[4],i,m,r=0;
	cout<<"Enter a 4-digit number seperated by spaces : ";
	for(i=0;i<4;i++)
	cin>>n[i];
	
	for(i=2;i>=1;i--)
	{
		m=n[i]%10;
		r=r*10+m;
		n[i]=n[i]/10;
	}
	
	cout<<"\nThe number with it's 2 middle digits reversed is : "<<n[0]<<r<<n[3];
	return 0;
}
