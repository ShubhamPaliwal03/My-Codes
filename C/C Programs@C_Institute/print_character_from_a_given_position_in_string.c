#include<stdio.h>
int main()
{
	int size,i,pos;
	char str[100];
	
	printf("Enter the string : ");
	fgets(str,100,stdin);
	
	printf("\nYou want to print character present at which position ? : ");
	scanf("%d",&pos);
	
	printf("\nThe character present at %d position is : %c",pos,str[pos-1]);
	
	return 0;
}