#include<iostream>
using namespace std;

bool checkBalancedParenthesis(char exp[])
{	
	int i,top=-1;
	char stack[100];
	
	for(i=0;exp[i]!='\0';i++)
	{
		if(exp[i]=='(' || exp[i]=='{' || exp[i]=='[')
		{
			/*push*/
			top++;
			stack[top]=exp[i];
			
		}
		else
		{
			if(top==-1)
			{
				return false;
			}
			else if(stack[top]=='(' && exp[i]==')' || stack[top]=='{' && exp[i]=='}' || stack[top]=='[' && exp[i]==']')
			{
				/*pop*/
				exp[i]=stack[top];
				stack[top]=0;
				top--;
			}
			else
			{
				return false;
			}
		}
	}
	if(top==-1)
	{
		return true;
	}
	else
	{
		return false;
	}
}
int main()
{
    char exp[100];
	
	cout<<"Enter the parenthesis equation you want to test : ";
	cin.getline(exp,100);

	if(checkBalancedParenthesis(exp))
	{
		cout<<"\nBalanced Parenthesis Equation !";
	}
	else
	{
		cout<<"\nImbalanced Parenthesis Equation !";
	}
    return 0;
}