#include<stdio.h>
int main()
{
    int x=0,m,num=x;
    
    typedef unsigned int ui;
    ui r=0;
	
	while(x)
	{	
	    m=x%10;
	    r=r*10+m;
	    x=x/10;
	}

    if(r==num && num>=0)
    {
        printf("\nTrue");
    }
    else
    {
		printf("\nFalse %d %d",r,num);
    }
    
    return 0;
}