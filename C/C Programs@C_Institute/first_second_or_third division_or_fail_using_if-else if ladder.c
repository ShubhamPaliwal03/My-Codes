#include<stdio.h>
int main()
{
	int n;
	printf("Enter the marks: ");
	scanf("%d",&n);
	if(n>=60)
	printf("First division");
	else if(n>=48)
	printf("Second division");
	else if(n>=33)
	printf("Third division");
	else
	printf("Fail");
	return 0;	
}
