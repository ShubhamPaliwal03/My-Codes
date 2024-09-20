#include<iostream>
using namespace std;

int main()
{
    char *prefix = new char;
    
    char strs[10][10] = {"flower","flow","flight"};
    
    int strsSize = 3;

    int i,j,k=0,count=0,n;
    
    for(i=0;i<strsSize;i++)
    {	
    	n=1;
    
    	for(j=0;strs[i][j]!='\0';j++)
    	{		
    		if(strs[j][i]==strs[i+n][j])
    		{
    			count++;
    			if(count>strsSize)
    			{
    				prefix[k]=strs[i][j];
					k++;
				}
			}
			else
			{
				break;
			}

			n++;
		}
		
	}

	cout<<"The Longest Common Substring is : "<<prefix;
	
    return 0;
}