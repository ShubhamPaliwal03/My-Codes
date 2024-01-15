#include<stdio.h>

int isoperator(char ch)
{
  return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '%';
}

int getprecedence(char ch)
{
  if(ch=='^')
  {
      return 2;
  }
  else if(ch == '*' || ch == '/' || ch == '%')
  {
      return 1;
  }  
  else
  {
      return 0;
  }
}

int main()
{
  char infix[50], postfix[50];

  char stack[50];

  int top = -1;

  int i, j = 0;

  printf("Enter prefix expression : ");

  gets(infix);  

  for(i=0; infix[i] != '\0'; i++)
  {    
    if(infix[i] == '(')
    {  
      stack[++top] = infix[i];

      continue;
    }
    else if(infix[i]==')')
    {
      while(stack[top] != '(' && top != -1)
      {
        if(stack[top] == '(')
        { 
          stack[top] = '\0';

          top--;

          break;
        }

        postfix[j]=stack[top];

        j++;

        top--;        
      }

      if(top != -1)
      { 
        stack[top] = '\0';

        top--;
      }

      continue;
    }

    if(isoperator(infix[i]))
    {  
      if(top == -1)
      {
        stack[++top] = infix[i];
      }  
      else
      {
        if(stack[top] == '(')
        {
          stack[++top] = infix[i];
        }
        else if(getprecedence(stack[top]) < getprecedence(infix[i]))
        {
          stack[++top] = infix[i];
        }
        else
        {
          while(getprecedence(stack[top]) >= getprecedence(infix[i]))
          {
            postfix[j] = stack[top];

            top--;

            j++;

            if(top == -1)
            {
              break;  
            }
          }  

          stack[++top] = infix[i];
        }
      }
    }
    else
    {
      postfix[j] = infix[i];

      j++;
    }
  }
  while(top != -1)
  {
    if(stack[top] == '(')
    {
      top--;

      continue;
    }
    postfix[j]=stack[top];

    j++;

    top--;
  }

  postfix[j]='\0';

  printf("Postfix expression is : %s",postfix);
  
  return 0;
}