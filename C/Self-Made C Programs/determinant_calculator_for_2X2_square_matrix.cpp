#include<stdio.h>
#include<fcntl.h>
#include<io.h>

int main()
{
	int order,i,j,mat[3][3],det,t1,t2,t3;
	
	printf("Enter the order of the square matrix : ");
	printf("\n\nPress 2 for 2X2 matrix and press 3 for 3X3 matrix\n");
	scanf("%d",&order);

	if(order==2 || order==3)
	{
		printf("\nEnter the desired matrix :\n\n");
		
		for(i=0;i<order;i++)
		{
			for(j=0;j<order;j++)
			{
				scanf("%d",&mat[i][j]);
			}
		}
		
		if(order==2)
		{
			det=(mat[0][0]*mat[1][1])-(mat[1][0]*mat[0][1]);
		}
		else
		{
			t1 = mat[0][0]*((mat[1][1]*mat[2][2])-(mat[2][1]*mat[1][2]));
			t2 = mat[0][1]*((mat[1][0]*mat[2][2])-(mat[2][0]*mat[1][2]));
			t3 = mat[0][2]*((mat[1][0]*mat[2][1])-(mat[2][0]*mat[1][1]));
			
			det= t1-t2+t3;  
		}
		
		printf("\nThe Determinant of the entered matrix given below :\n\n");
		
		for(i=0;i<order;i++)
		{
			for(j=0;j<order;j++)
			{
				if(order==2)
				{
					if(i==0&&j==0 || i==1&&j==0)
					{
						printf("|%d ",mat[i][j]);
					}
					else
					{
						printf("%d| ",mat[i][j]);
					}
					
				}
				else
				{
					if(i==0&&j==0 || i==1&&j==0 || i==2&&j==0)
					{
						printf("|%d ",mat[i][j]);
					}
					else if(i==0&&j==2 || i==1&&j==2 || i==2&&j==2)
					{
						printf("%d|",mat[i][j]);
					}
					else
					{
						printf("%d ",mat[i][j]);
					}
				}
			}
			printf("\n");
		}
		printf("\n");
		printf("i.e., ");
	
		_setmode(_fileno(stdout), _O_U16TEXT);
		wprintf(L"\x394 = ");
		
		_setmode(_fileno(stdout), _O_TEXT);/*sets back to normal mode again,otherwise printf won't work*/
		printf("%d",det);
	}
	else
	{
		printf("Please enter a valid order of the matrix (out of 2 and 3) !");
	}
	return 0;
}