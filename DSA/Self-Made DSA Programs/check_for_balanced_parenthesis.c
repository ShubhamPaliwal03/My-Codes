#include<stdio.h>

int checkParenthesis(char exp[])
{	
	int i,top=-1;
	char stack[100];
	
	for(i=0;exp[i]!='\0';i++)
	{
		if(exp[i]=='(' || exp[i]=='{' || exp[i]=='[')
		{
			/*push the respective opening parenthesis into stack*/
			top++;
			stack[top]=exp[i];
			
		}
		else // if the current element of the string is not an opening parenthesis
		{
			if(top==-1) /*do not use this condition if you want to enter any other operand(s) or operator(s) in the equation*/
			{	
				// if there are no opening parentheses in the string, ie., there exists a closing parenthesis or some other character
				// before or without an opening parenthesis, therefore the parenthesis is not balanced
				return 0;
			}
			else if(stack[top]=='(' && exp[i]==')' || stack[top]=='{' && exp[i]=='}' || stack[top]=='[' && exp[i]==']')
			{
				/*pop opening parenthesis from stack because it's matching closing parenthesis is present (ie., they are balanced)*/
				top--;
			}
			else /*do not use this condition if you want to enter any other operand(s) or operator(s) in the equation*/
			{
				// if the stack is not empty, and there's no match for the parenthesis present at the top of the stack and the current element or parenthesis of the string
				return 0;
			}
		}
	}
	if(top==-1) /*if the stack will be empty, then all the parentheses will be having a matching pair*/
	{
		return 1;
	}
	else /*if the stack will not be empty at the end, then all the parenthsis will not be having a matching pair*/
	{
		return 0;
	}
}
int main()
{
    char exp[100];
	
	printf("Enter the parenthesis equation you want to test : ");
	gets(exp);

	if(checkParenthesis(exp)) /*when the function returns 1*/
	{
		printf("\nBalanced Parenthesis Equation !");
	}
	else /*when the function returns 0*/
	{
		printf("\nImbalanced Parenthesis Equation !");
	}
	
    return 0;
}