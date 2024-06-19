#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cin>>n;
	
	cout<<endl;
	
	// Printing the upper triangular half of the pattern
	for(int i=1;i<=n;i++)
	{
		// Space(s)
		for(int j=n-1;j>=i;j--)
		{
			cout<<" ";
		}
		
		// Star(s)
		for(int j=1;j<=2*i-1;j++)
		{
			cout<<"*";
		}
		
		// Space(s)
		for(int j=n-1;j>=i;j--)
		{
			cout<<" ";
		}
		
		cout<<endl;
	}
	
	// Printing the lower triangular half of the pattern
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
		
		for(int j=1;j<=i;j++)
		{
			cout<<" ";
		}
		
		cout<<endl;
	}
	
	return 0;
}