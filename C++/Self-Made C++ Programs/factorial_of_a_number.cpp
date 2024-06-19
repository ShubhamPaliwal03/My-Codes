#include<iostream>
using namespace std;

int main()
{
	int n,fact=1,num;
	
	cout<<"Enter the number the factorial of which you want to calculate : ";
	cin>>n;
	
	num=n;
	
	while(n>0)
	{
		fact=fact*n;
		n--;
	}
	
	cout<<endl<<num<<"! = "<<fact;
	
	return 0;
}