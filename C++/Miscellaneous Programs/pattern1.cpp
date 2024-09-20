#include<iostream>

using namespace std;

int main()
{
	int n,i=1,j;
	
	cout<<"Enter the number of rows in pattern = ";
	cin>>n;
	
	while(i <= n)
	{
		j = 1;
		while(j <= n)
		{
			if(j <= i)
			{
				cout<<j;
			}
			else
			{
				cout<<"0";
			}
			j++;
		}
		cout<<endl;
		i++;
	}
}