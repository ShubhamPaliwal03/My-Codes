#include<iostream>
#include<stack>
using namespace std;
int precedence(char ch)
{
	if(ch=='^')
		return 6;
		
	else if(ch=='*')
		return 5;

	else if(ch=='/')
		return 4;

	else if(ch=='%')
		return 3;

	else if(ch=='+')
		return 2;

	else if(ch=='-')
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
	stack<int> stack,postfix;
	char infix[100];
	int i,j;
	
	cout<<"Enter the Infix expression : ";
	cin.getline(infix,50);
	
	i=0;
	while(infix[i]!='\0')
	{
		/*the case when closed parenthesis is present in infix and open parenthesis is present in the top of the stack*/
		if(stack.top()=='(' && infix[i]==')')
		{
			if(stack.empty())
			{
				/*push this element of infix into stack*/
				stack.push(infix[i]);
			}
			else
			{
				while(!stack.empty())
				{
					/*push all the elements stored in stack into postfix*/
					postfix.push(stack.top());
					
					/*pop all the elements from stack*/
					stack.pop();
				}
			}
		}
		else if(IsOperator(infix[i]))/*the case when an operator is present in infix*/
		{
			if(stack.empty())
			{
				/*push this element of infix into stack*/
				stack.push(infix[i]);
			}
			else
			{
					
				/*the case when an operator of higher or equal precedence is present in stack's top and an operator of lower or equal
				 precedence is present in infix*/
				if(precedence(stack.top())>=precedence(infix[i]))
				{
					/*push the operator from stack into postfix as it has higher precedence than the operator in infix*/
					postfix.push(stack.top());
				
					/*pop the operator from stack*/
					stack.pop();
						
					/*push the operator in infix into stack*/
					stack.push(infix[i]);
						
				}
					
				/*the case when an operator of lower precedence is present in stack's top and an operator of higher precedence is present
				in infix*/
				else
				{	
					/*push this element of infix into stack*/
					stack.push(infix[i]);
				}
			}
		}
		else/*the case when an operand is present in infix*/
		{
			/*push this element of infix into postfix*/
			postfix.push(infix[i]);
		}
		i++;
	}
	if(!stack.empty())/*the case when some elements are still present in the stack (stack is not empty)*/
	{	
		while(!stack.empty())
		{
			/*push all the leftover elements of stack into postfix*/
			postfix.push(stack.top());
			
			/*pop all the leftover elements of stack*/
			stack.pop();
		}
	}
	cout<<"\nThe equivalent Postfix expression is : ";
	while(!postfix.empty())
	{
		cout<<postfix.top();
		postfix.pop();
	}
	return 0;
}