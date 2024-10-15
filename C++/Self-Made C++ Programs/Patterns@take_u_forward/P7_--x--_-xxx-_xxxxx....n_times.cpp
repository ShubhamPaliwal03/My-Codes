#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cin>>n;
	
	cout<<endl;
	
	// My Solution
	
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
	
	// TUF's Solution
	
//	for(int i=0;i<n;i++)
//	{
//		// Space(s)
//		for(int j=0;j<n-i-1;j++)
//		{
//			cout<<" ";
//		}
//		
//		// Star(s)
//		for(int j=0;j<2*i+1;j++)
//		{
//			cout<<"*";
//		}
//		
//		// Space(s)
//		for(int j=0;j<n-i-1;j++)
//		{
//			cout<<" ";
//		}
//		
//		cout<<endl;
//	}
	
	return 0;
}