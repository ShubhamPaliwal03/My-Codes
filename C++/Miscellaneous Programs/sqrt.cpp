#include<iostream>
using namespace std;

int main()
{
	int i=1,n,num=1;
	
	cout<<"Enter the number to find thr square root = ";
	cin>>n;
	
	while(num <= n)
	{
		i++;
		num = i*i;		
	}
	
//	return i-1;
cout<<endl;
cout<<"The root is = ";
cout<<i-1;
} 