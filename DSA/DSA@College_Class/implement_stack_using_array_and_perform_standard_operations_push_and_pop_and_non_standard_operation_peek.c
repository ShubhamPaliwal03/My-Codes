#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 100

int main()
{
    int stack[MAX_SIZE],top=-1,data,choice,con,size;

    printf("Enter the size of the stack you want to create : ");
    scanf("%d",&size);

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

                if(top==size-1)/*when stack is full*/
                {
                    printf("\nStack Overflow!\n%d cannot be pushed into the stack!",data);
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
                    printf("\nStack Underflow!\nNothing to be popped from the stack!");
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
                    printf("\nStack Empty!");
                }
                else
                {
                    printf("\nTop(Last) element of the stack is : %d",stack[top]);
                }

            break;

            default : 

                printf("\nPlease enter a valid choice (1 - 3)!");  
        }
        
        printf("\n\nPress 1 to continue!\nPress any other num key (0 or 2 - 9) to exit!\n\n");
        scanf("%d",&con);
    }
    while(con==1);

    return 0;
}