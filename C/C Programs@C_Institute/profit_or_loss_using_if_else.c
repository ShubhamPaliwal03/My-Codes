#include<stdio.h>
int main()
{
	int sa,pa;
	printf("Enter the sale amount: ");
	scanf("%d",&sa);
	printf("Enter the purchase amount: ");
	scanf("%d",&pa);
	if(sa>=pa)
	{
		printf("Profit"); 
	}
	else
	{
		printf("Loss");
	}
}
