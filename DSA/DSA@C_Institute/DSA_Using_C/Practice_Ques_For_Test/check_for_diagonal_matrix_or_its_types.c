#include<stdio.h>
int main()
{
	int mat[10][10],order,i,j,Lflag,Uflag,Dflag;
	
	printf("Enter the order of the square matrix (like 3 for 3x3) : ");
	scanf("%d",&order);
	
	printf("\nEnter the %d elements into the matrix of order %dx%d :\n\n",order*order,order,order);
	for(i=0;i<order;i++)
	{
		for(j=0;j<order;j++)
		{
			scanf("%d",&mat[i][j]);
		}
	}
	printf("\nDesired square matrix order of 4x4 initialized successfully!\n");
	
	printf("\nThe entered matrix is as follows :\n\n");
	for(i=0;i<order;i++)
	{
		for(j=0;j<order;j++)
		{
			printf("%d ",mat[i][j]);
		}
		printf("\n");
	}
	
	for(i=0;i<order;i++)
	{
		for(j=0;j<order;j++)
		{
			if(i<j)
			{
				if(mat[i][j]==0)
				{
					Lflag=1;
				}
				else
				{
					Lflag=0;
				}
			}
			if(i>j)
			{
				if(mat[i][j]==0)
				{
					Uflag=1;
				}
				else
				{
					Uflag=0;
				}	
			}
			if(i==j)
			{
				if(mat[i][j]==0)
				{
					Dflag=0;
				}
				else
				{
					Dflag=1;
				}
			}
		}
	}
	
	printf("\nThe entered matrix is : ");
	if(Lflag==1 && Uflag==1 && Dflag==1)
	{
		printf("A Diagonal Matrix");	
	}
	else if(Lflag==1 && Uflag==1)
	{
		printf("Both Lower and Upper Triangular Matrix");
	}
	else if(Lflag==1)
	{
		printf("A Lower Triangular Matrix");
	}
	else if(Uflag==1)
	{
		printf("An Upper Triangular Matrix");
	}
	else
	{
		printf("Not A Triangular Matrix");
	}
	
	return 0;
}