#include<iostream>
using namespace std;

int main()
{
	char mat[8][8];

	int t;
	
	cin>>t;
	
	int count = 0;

	while(count!=t)
	{	
	    for(int i=0;i<8;i++)
	    {
	        for(int j=0;j<8;j++)
	        {
	            cin>>mat[i][j];
	        }
	    }
	
		for(int i=0;i<8;i++)
	    {
	        for(int j=0;j<8;j++)
	        {
	            if(mat[i][j]>='a' && mat[i][j]<='z')
	            {
	               cout<<mat[i][j];
	            }
	        }
	    }
	    cout<<endl;
	    
	    count++;
	}
}