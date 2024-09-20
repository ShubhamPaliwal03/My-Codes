#include<iostream>
using namespace std;
int main()
{
	int a,b,i,lim1,lim2,s1=0,s2=1,sum=0,c;
	
	cout<<"Enter range seperated by spaces : ";
	cin>>a>>b;
	
	if(a==1)
	{
		cout<<s1<<" "<<s2<<" ";
		c=b-2;
	}
	else
	{
		c=b;
	}
	for(i=a;i<c;i++)
	{
		sum	= s1+s2;
		cout<<sum<<" ";
		s1=s2;
		s2=sum;
	}
	return 0;
}