#include<iostream>
using namespace std;

int main()
{
	int n,m,r=0,num;
	
	cout<<"Enter a number : ";
	cin>>n;
	
	num=n;//we are assigning n to a different variable so that it's original value is preserved despite running of the statement n=n/10 in the loop 
	
	while(n!=0)
	{
		m=n%10;
		r=r*10+m;
		n=n/10;
	}
	
	if(num==r)//where r is the reversed number
	{
		cout<<endl<<"The number entered is a Palindrome";
	}
	else
	{
		cout<<endl<<"The number entered is Not a Palindrome";
	}
	
	return 0;
}