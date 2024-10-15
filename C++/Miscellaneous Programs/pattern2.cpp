#include<iostream>

using namespace std;

int main()
{
	int i=1,j,row=1,n;
	
	cout<<"Enter the number of rows in the pattern = ";
	cin>>n;
	
	while(i <= n)
	{
		int sp = n-i;
		while(sp)
		{
			cout<<" ";
			sp--;
		}
		j = 1;
		while(j <= i)
		{
			cout<<j;
			j++;
		}
//		int val;
			int val = i-j;
		while(j <= i)
		{
			cout<<val;
		}
		cout<<endl;
		i++;
	}
	return 0;
}