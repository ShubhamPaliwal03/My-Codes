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
		for(int j=1;j<=i;j++)
		{
			cout<<i;
		}
		cout<<endl;
	}

	// My Solution
	
//	int k;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<=i;j++)
//		{
//			k=i;
//			cout<<k;
//		}
//		k++;
//		cout<<endl;
//	}
	
	return 0;
}