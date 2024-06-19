/*This code prints pattern having 'n' rows and 'n' columns, 't' times*/

#include<iostream>
using namespace std;

void pattern(int n)/*function or code snippet to print pattern*/
{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			cout<<"*";
		}
		cout<<endl;
	}
}

int main()/*Driver code*/
{
	
	int t;
	
	cin>>t;

	for(int i=0;i<t;i++)
	{	
		int n;
		
		cin>>n;
		pattern(n);
	}
	
	return 0;	
}