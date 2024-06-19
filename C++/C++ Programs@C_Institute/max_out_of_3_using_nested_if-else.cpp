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
			cout<<"Max is : "<<a;
		else
			cout<<"Max is : "<<c;	
	}
	else
	{
		if(b>c)
			cout<<"Max is : "<<b;
		else
			cout<<"Max is : "<<c;	
	}
	return 0;
}