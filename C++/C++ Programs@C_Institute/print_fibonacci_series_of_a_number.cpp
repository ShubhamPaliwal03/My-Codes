#include<iostream>
using namespace std;
int main()
{
	int n,i,s1=0,s2=1,sum=0;
	cout<<"How many terms you want to print : ";
	cin>>n;
	cout<<s1<<" "<<s2<<" ";
	for(i=2;i<=n-2;i++)
	{
		sum=s1+s2;
		cout<<sum<<" ";
		s1=s2;
		s2=sum;
	}
	return 0;
}