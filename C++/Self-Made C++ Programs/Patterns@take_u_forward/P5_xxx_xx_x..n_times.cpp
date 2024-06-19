#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cin>>n;
	
	cout<<endl;

	// TUF's Solution
	
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
			cout<<"*";
		}
		cout<<endl;
	}
	
	// My Solution

//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n-i+1;j++)
//		{
//			cout<<"*";
//		} 
//		cout<<endl;
//	}
	
	return 0;
}