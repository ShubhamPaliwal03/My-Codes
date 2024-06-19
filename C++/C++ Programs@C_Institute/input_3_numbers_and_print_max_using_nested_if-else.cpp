#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
	
	cout<<"Enter the value of a : ";
	cin>>a;
	cout<<"Enter the value of b : ";
	cin>>b;
	cout<<"Enter the value of c : ";
	cin>>c;
	
	if(a>b)
	{
		if(a>c)
		{
			cout<<"a is maximum";
		}
		else
		{
			cout<<"c is maximum";
		}		
	}
	else
	{
		cout<<"b is maximum";
	}
	return 0;
}
