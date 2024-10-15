#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	int n,i;
	double fact=1;
	cout<<"Enter the number whose factorial has to be found : ";
	cin>>n;
	for(i=2;i<=n;i++)
	{
		fact=fact*i;
	}
	cout<<"The factorial of "<<n<<" is : "<<fact;
	return 0;
}
