#include<stdio.h>
#include<stdlib.h>
#define SIZE 5

int main()
{
    int stack[SIZE],top=-1,data,choice,con;

    do
    {
        system("cls");
        printf("\nSelect the operation you want to perform from the following by entering your choice :\n\n1.Push\n2.Pop\n3.Peek\n\n");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1 : /*Push*/

                printf("\nEnter the data you want to push into the stack : ");
                scanf("%d",&data);

                if(top==SIZE-1)/*when stack is full*/
                {
                    printf("\nStack Overflow (Stack Full)!\n%d cannot be pushed into the stack!",data);
                }
                else
                {
                    top++;
                    stack[top]=data;
                    printf("\n%d pushed into the stack",data);
                }

            break;

            case 2 : /*Pop*/

                if(top==-1)/*when stack is empty*/
                {
                    printf("\nStack Underflow (Stack Empty)!\nNothing to be popped from the stack!");
                }
                else
                {
                    data=stack[top];
                    stack[top]=0;
                    top--;
                    printf("\n%d popped from the stack",data);
                }

            break;

            case 3 : /*Peek*/

                if(top==-1)/*when stack is empty*/
                {
                    printf("\nStack Empty!\nNothing to Peek!");
                }
                else
                {
                    printf("\nTop(Last) element is : %d",stack[top]);
                }

            break;

            default : /*when out of bound choice is entered*/
            
                printf("Please enter a valid choice (1-3)!");

        }

        printf("\n\nPress 1 to continue and press any other num key (0 or 2-9) to exit!\n\n");
        scanf("%d",&con);

    }
    while(con==1);

    return 0;
}
