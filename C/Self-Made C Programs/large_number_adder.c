#include<stdio.h>
#include<string.h>
int main()
{
	char a[1000000],b[100000],c[100000];
	int i,j,size,carry[100000];
	printf("Enter the size of the number to be added (in digits) :");
	scanf("%d",&size);
	printf("Enter the first number with each digit seperated by spaces :");
	for(i=0;i<size;i++)
	{
		scanf("%d",&a[i]);	
	}
	strrev(a);
	printf("Enter the second number with each digit seperated by spaces :");
	for(i=0;i<size;i++)
	{
		scanf("%d",&b[i]);
	}
	strrev(b);
	for(i=0;i<size;i++)
	{
		c[i]=a[i]+b[i];
		if(c[i]>9)
		{
			carry[i]=c[i]-10;
			c[i+1]=c[i+1]+carry[i];
			printf("%d",c[i]);
		}
		else
		{
			printf("%d",c[i]);
		}
	}
	return 0;
}