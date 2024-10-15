#include<iostream>
using namespace std;
int main()
{
	int a,b;
	printf("Enter the value of a : ");
	scanf("%d",&a);
	printf("Enter the value of b : ");
	scanf("%d",&b);
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<"\nAfter swapping :"<<endl<<"a is : "<<a<<"\nb is : "<<b;
	return 0;
}