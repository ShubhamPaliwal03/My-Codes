#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cin>>n;
	
	cout<<endl;
	
	for(int i=0;i<n;i++)
	{
		// Space(s)
		for(int j=1;j<=i;j++)
		{
			cout<<" ";
		}
		
		// Star(s)
		for(int j=1;j<=2*(n-i)-1;j++)
		{
			cout<<"*";
		}
		
		// Space(s)
		for(int j=1;j<=i;j++)
		{
			cout<<" ";
		}
		
		cout<<endl;
	}
	
	return 0;
}