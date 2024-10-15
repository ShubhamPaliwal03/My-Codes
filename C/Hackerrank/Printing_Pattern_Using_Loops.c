#include<stdio.h>

void print_pattern(int n)
{
	int i,j,num=n;
	
	if(n<1)
	{
		return;
	}
	
	for(i=1;i<=2*n-1;i++)
	{
		n=num;
		for(j=1;j<=2*n-1;j++)
		{
			if(i==1||i==2*n-1||j==1||j==2*n-1)
			{
				printf("%d",n);
			}
			else if(i==j)
			{
				printf("%d",--n);		
			}
		}
		printf("\n");
	}
		
} 	

int main()
{
	int i,n;
	
	scanf("%d",&n);
	
	printf("\n");
	
	print_pattern(n);
	
	return 0;
}