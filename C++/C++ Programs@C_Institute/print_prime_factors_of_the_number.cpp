#include<iostream>
using namespace std;
int main()
{
	int n,i;
	cout<<"Enter the number whose prime factors have to be found : ";
	cin>>n;
	cout<<"The prime factors of "<<n<<" are : ";
	cout<<"1";
	for(i=2;n>1;)
	{
		if(n%i==0)
		{
			cout<<" , "<<i;
			n=n/i;
		}
		else
		{
			i++;
		}
	}
	return 0;
}