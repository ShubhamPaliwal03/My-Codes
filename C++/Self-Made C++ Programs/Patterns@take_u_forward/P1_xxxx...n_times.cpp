#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cin>>n;
	
	cout<<endl;
	
	// The Outer loop for printing the rows
	for(int i=0;i<n;i++)
	{
		// The Inner loop for printing the columns
		for(int j=0;j<n;j++)
		{
			cout<<"*";
		}
		cout<<endl;
	}
	
	return 0;
}