#include<stdio.h>
int main()
{
	int a,b;
	char op;
	printf("Enter two integers seperated by space:\n");
	scanf("%d%d",&a,&b);
	fflush(stdin);
	//fflush is used to unclog the clogged input in the system,so that it can take new input
	printf("Select one of the operator from + - * / %%\n");
	scanf("%c",&op);
	switch(op)
	{	case'+':
		printf("%d + %d = %d",a,b,a+b);
		break;
		
		case'-':
		printf("%d - %d = %d",a,b,a-b);
		break;
		
		case'*':
		printf("%d * %d = %d",a,b,a*b);
		break;
		
		case'/':
		printf("%d / %d = %d",a,b,a/b);
		break;
		
		case'%':
		printf("%d %% %d = %d",a,b,a%b);
		break;
		//We can type any case first,the proper sequence doesn't matter here	
	}
	return 0; 
}
