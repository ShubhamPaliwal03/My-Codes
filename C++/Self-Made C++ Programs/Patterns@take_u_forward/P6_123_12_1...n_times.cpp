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
		int k=1;
		for(int j=n;j>=i;j--)
		{
			cout<<k;
			k++;
		}
		cout<<endl;
	}
	
	// Solution 2	
	
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=n-i+1;j++)
//		{
//			cout<<j;
//		}
//		cout<<endl;
//	}
	
	return 0;
}