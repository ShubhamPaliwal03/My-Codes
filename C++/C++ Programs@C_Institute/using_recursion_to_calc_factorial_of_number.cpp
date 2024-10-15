#include<iostream>
using namespace std;

int get_factorial(int num)
{
	int fact=0;
	if(num<0)
	{
		return num;
	}
	if(num==0)
	{
		return 1;
	}
	//condition of num>0,which is default
	fact=get_factorial(num-1);
	fact=fact*num;
	return fact;
}
int main()
{
	int n;
	printf("Enter the number whose factorial is to calculated : ");
	scanf("%d",&n);
	int f=get_factorial(n);
	printf("The factorial of %d is %d",n,f);
}