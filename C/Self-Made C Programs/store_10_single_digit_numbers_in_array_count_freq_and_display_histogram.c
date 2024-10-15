#include<stdio.h>
int main()
{
    int i,num[10],j,count,visited=-1,temp,pos=1;
    int freq[10]={0};/*Initializing frequency of all the elements of the array to 0 at first*/

    i=0;
    do
    {
        printf("\nEnter a single-digit number (element %d) : ",i);
        scanf("%d",&num[i]);

        if(num[i]<=9 && num[i]>0)
        {
            i++;
        }
        else
        {
            printf("\nNot a single-digit number!",i);
        }
    }
    while(i<10);
	
	for(i=0;i<10;i++)
	{	
		count=1;
	    for(j=i+1;j<10;j++)
	    {
	    	if(num[i]==num[j])
	    	{
				count++;
				freq[j]=visited;/*to avoid counting the same element again*/
			}
	    }
	    if(freq[i]!=visited)
	    {
	    	freq[i]=count;
		}
	}
	
	printf("\nFrequency Data :\n");
    for(i=0;i<10;i++)
    {
    	if(freq[i]!=visited)
    	{
        	printf("\n%d : %d time(s)\n",num[i],freq[i]);
   		}
    }

	printf("\nHistogramic representation :\n");
	printf("\nIn Horizontal Format : \n");
	for(i=0;i<10;i++)
	{
	    if(freq[i]!=visited)
    	{    	
			printf("\n%d ",num[i]);
			for(j=1;j<=freq[i];j++)
			{
				printf("*");
			}
   		}	
	}
	
	printf("\n\nIn Vertical Format :\n");
	for(i=0;i<10;i++)
	{
		if(freq[i]!=visited)
		{
			for(j=1;j<=freq[i];j++)
			{
				if(freq[j]==0)
				{
					printf(" ");
				}
				else
				{
					
				}
				printf(" *\n");
			}
		}
	}
	
	for(i=0;i<10;i++)
	{
		if(freq[i]!=visited)
		{
			printf("%d",i);
		}
	}
	
    return 0;
}