#include<iostream>
using namespace std;

int main()
{
	long long unsigned n,d,len=0;
	
	// LONG_LONG_MAX = 9223372036854775807
	// LONG_LONG_MIN = -9223372036854775808
	// INT_MAX = 2147483647(2,14,74,83,647)
	// INT_MIN = -2147483648
	
	cout<<"Enter a number : ";
	cin>>n;
	
	d=n;
	while(d!=0)
	{
		len++;
		d=d/10;
	}
	
	cout<<endl<<"You have entered a "<<len<<" digit number";
	
	return 0;
}