#include<stdio.h>
#include<string.h>
int main()
{
    int i,x=0,operationsSize;
    char operations[1024];
    
    scanf("%d",&operationsSize);
    
    for(i=0;i<operationsSize;i++)
    {
        scanf("%s",operations);
    }
    
    for(i=0;i<operationsSize;i++)
    {
        if(strcmp(operations,"++X")==0)
        {
            ++x;
        }
        if(strcmp(operations,"X++")==0)
        {
            x++;
        }
        if(strcmp(operations,"--X")==0)
        {
            --x;
        }
        if(strcmp(operations,"X--")==0)
        {
            x--;
        }
    }
    printf("%d",x);
    return 0;
}