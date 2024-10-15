#include<iostream>
using namespace std;
int main()
{
	int a,b,c,d;
	cout<<"Enter the value of a : ";
	cin>>a;
	cout<<"Enter the value of b : ";
	cin>>b;
	cout<<"Enter the value of c : ";
	cin>>c;
	cout<<"Enter the value of d : ";
	cin>>d;
	if(a<b&&a<c&&a<d)
	{
		cout<<"Min is : "<<a;
	}
	else if(b<a&&b<c&&b<d)
	{
		cout<<"Min is : "<<b;
	}
	else if(c<a&&c<b&&c<d)
	{
		cout<<"Min is : "<<c;
	}
	else
	{
		cout<<"Min is : "<<d;
	}
	return 0;
}
