#include<iostream>
using namespace std;

int lastStoneWeight(int* stones, int stonesSize)
{
    int *stack = new int[stonesSize];

    int i,j,temp,top=-1,x,y;
	
	while(top>1)
	{
	    for(i=0;i<stonesSize;i++)
	    {
	        stack[++top]=stones[i];
	    }
	    
	    cout<<"Stack is : ";
	    for(i=0;i<=top;i++)
	    {
	    	cout<<stack[i]<<" ";
		}
	    
	    for(i=0;i<=top-1;i++)
	    {
	        for(j=i+1;j<=top;j++)
	        {
	            if(stack[i]>stack[j])
	            {
	                temp=stack[i];
	                stack[i]=stack[j];
	                stack[j]=temp;
	            }
	        }
	    }
	    
		printf("\nThe Sorted stack is : ");
	    for(i=0;i<=top;i++)
	    {
	        cout<<stack[i];
	    }
	    
		cout<<"\ntop is : "<<top;
		
	    x=stack[top-1];
	    y=stack[top];
		
		cout<<endl<<x;
		cout<<endl<<y;
	    
	    if(x!=y)
	    {
	        top--;
	        top--;
	
	        stack[++top]=y-x;
	    }
	    if(x==y)
	    {
	        top--;
	        top--;
	    }   	
	}
	
    if(top==1)
    {
        return stack[top];
    }
    else
    {
        return 0;
    }
}

int main()
{
	int stones[]={2,7,4,1,8,1};
	int stonesSize=sizeof(stones)/sizeof(stones[0]);
	
	cout<<endl<<lastStoneWeight(stones,stonesSize);
	
	return 0;
}