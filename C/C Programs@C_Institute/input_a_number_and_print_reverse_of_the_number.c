#include<stdio.h>
int main()
{
	int n,m,r=0;
	printf("Enter a number: ");
	scanf("%d",&n);
	while(n)//or while(n!=0).,ie., running the loop until n is not equal to zero
	{	
		m=n%10;
		r=r*10+m;//321
		n=n/10;//0	
	}
	printf("Reverse number is %d",r);
	return 0;
}
