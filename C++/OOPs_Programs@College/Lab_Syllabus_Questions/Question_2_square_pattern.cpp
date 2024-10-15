#include<iostream>
using namespace std;
int main()
{
    int i,j,size;
    
    cout<<"Enter the size of the side of the square pattern you want to generate : ";
    cin>>size;
    
    cout<<endl<<"The square pattern generated according to the size of it's side entered by user is as follows : "<<endl<<endl;
    for(i=1;i<=size;i++)
    {   
    	if(i==1 || i==size)
    	{
    		for(j=1;j<=size;j++)
    		{
    			cout<<"*";
			}
		}
		else
		{
	        for(j=1;j<=size;j++)
	        {
		       	if(j==1 || j==size)
		      	{
					cout<<"*";
		    	}
		    	else
		    	{
		    		cout<<" ";
				}
	        }
		}
        cout<<endl;
    }
    return 0;
}