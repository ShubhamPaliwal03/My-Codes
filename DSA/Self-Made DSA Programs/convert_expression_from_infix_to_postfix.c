#include<stdio.h>

int precedence(char ch)
{
	if(ch=='^')
		return 3;
		
	else if(ch=='*' || ch=='/' || ch=='%')
		return 2;
		
	else if(ch=='+' || ch=='-')
		return 1;
	else
		return 0;			
}
int IsOperator(char ch)
{
	if(ch=='^' || ch=='*' || ch=='/' || ch=='%' || ch=='+' || ch=='-')
		return 1;

	else
		return 0;
}
int main()
{
	char stack[100],infix[100],postfix[100];
	int s_top=-1,p_top=-1,i,j;
	
	printf("Enter the Infix expression : ");
	scanf("%[^\n]s",infix);
	
	i=0;
	while(infix[i]!='\0')
	{
		/*the case when closed parenthesis is present in infix and open parenthesis is present in the top of the stack*/			
		if(infix[i]=='(' || stack[s_top]=='(' && infix[i]==')') 
		{
			if(s_top==-1)
			{
				/*push this element of infix into stack*/
				s_top++;
				stack[s_top]=infix[i];
			}
			else
			{
				/*Pop '(' from the stack*/
				stack[s_top]=0;
				s_top--;
				
				j=s_top;
				while(s_top!=-1)
				{
					/*push all the elements currently stored in stack into postfix*/
					p_top++;
					postfix[p_top]=stack[j];
					j--;
						
					/*pop all the currently stored elements from stack*/
					stack[s_top]=0;
					s_top--;
				}	
			}
		}
		else if(IsOperator(infix[i]))/*the case when an operator is present in infix*/
		{
			if(s_top==-1)
			{
				/*push this element of infix into stack*/
				s_top++;
				stack[s_top]=infix[i];
			}
			else
			{
				/*the case when an operator of higher or equal precedence is present in stack's top and an operator of lower or equal
				precedence is present in infix*/
				if(precedence(stack[s_top])>=precedence(infix[i]))
				{
					/*push the operator from stack into postfix as it has higher or equal precedence than the operator in infix*/
					p_top++;
					postfix[p_top]=stack[s_top];
				
					/*pop the operator from stack*/
					s_top--;
							
					/*push the operator in infix into stack*/
					s_top++;
					stack[s_top]=infix[i];
				}
					
				/*the case when an operator of lower precedence is present in stack's top and an operator of higher precedence is present
				in infix*/
				else
				{	
					/*push this element of infix into stack*/
					s_top++;
					stack[s_top]=infix[i];
				}	
			}
		}	
		else/*the case when an operand is present in infix*/
		{
			/*push this element of infix into postfix*/
			p_top++;
			postfix[p_top]=infix[i];
		}
				
		i++;		
		
	}
	
	if(s_top!=-1)/*the case when some elements are still present in the stack (stack is not empty)*/
	{
		j=s_top;
		while(s_top!=-1)
		{
			/*push all the leftover elements of stack into postfix*/
			p_top++;
			postfix[p_top]=stack[j];
			j--;
			
			/*pop all the leftover elements of stack*/
			s_top--;
		}
	}
	printf("\nThe equivalent Postfix expression is : ");
	printf("%s",postfix);
	return 0;
}