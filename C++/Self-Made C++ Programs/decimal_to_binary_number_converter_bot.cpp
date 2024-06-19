#include<iostream>
using namespace std;
int main()
{
	int bits[1024];
	int n,j;
	cout<<"Enter a number in Decimal form : ";
	cin>>n;
	int i=0;
	while(n>=1)// while(n!=0)
	{
		bits[i]=n%2;
		n=n/2;
		i++;
	}
	cout<<endl<<"The number in Binary form is : ";
	for(j=i-1;j>=0;j--)
	{
		cout<<bits[j];
	}
	return 0;
}