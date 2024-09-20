#include<iostream>
using namespace std;
int main()
{
	int n,max,digit;
	cout<<"Enter a number : ";
	cin>>n;
	max=n%10;
	while(n!=0)
	{
		digit=n%10;
		if(digit>max)
		{
			max=digit;
		}
		n=n/10;
	}
	cout<<"The max digit is : "<<max;
	return 0;
}