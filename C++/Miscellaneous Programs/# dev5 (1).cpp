#include<stdio.h>

int main()
{
	int bt,i,v1,v2,m,r,p;
	char value1,value2,multi,temp;
	
	printf("Enter the band type = ");
	scanf("%d",&bt);
    
	if(bt > 6 || bt < 3)
	{
		printf("Oo.. no band not found !!");
	}
	else
	{
		printf("\nFor seleceting the band colour\n\n");
		printf("B = BLACK\nb = BROWN\nr = RED\no = ORANG\ny = YELLOW\ng = GREEN\ns = BLUE\nv = VIOLET\nG = GREY\nw = WHITE\n\n");
	for(i=1; i<=bt; i++)
	{
	  for(i=1; i<=bt; i++)
	  {
    	for(i=1; i<= bt; i++)
		{
		printf("Enter the %dst band colour = ",i);
		scanf("%s",&value1);
		switch(value1)
		{
			case 'B':
			 	v1 = 0;
			 	break;
			
			case 'b':
			 	v1 = 1;
	 			break;
			
			case 'r':
			 	v1 = 2;
				break;			
			
			case 'o':
			 	v1 = 3;
				break;
			
			case 'y':
			 	v1 = 4;
				break;		
			
			case 'g':
			 	v1 = 5;
				break;			
			
			case 's':
			 	v1 = 6;
				break;
			
			case 'v':
			 	v1 = 7;
			    break;
			
			case 'G':
			 	v1 = 8;
				break;
			
			case 'w':
			 	v1 = 9;
				break;			
		}
      }
	
		printf("Enter the %dst band colour = ",i);
		scanf("%s",&value2);
		switch(value2)
		{
			case 'B':
			 	v2 = 0;
			 	break;
			
			case 'b':
			 	v2 = 1;
	 			break;
			
			case 'r':
			 	v2 = 2;
				break;			
			
			case 'o':
			 	v2 = 3;
				break;
			
			case 'y':
			 	v2 = 4;
				break;		
		
			case 'g':
			 	v2 = 5;
				break;			
			
			case 's':
			 	v2 = 6;
				break;
			
			case 'v':
			 	v2 = 7;
			    break;
			
			case 'G':
			 	v2 = 8;
				break;
			
			case 'w':
			 	v1 = 8;
				break;			
		}
      }
		printf("Enter the %dst band colour = ",i);
		scanf("%s",&multi);
		switch(multi)
		{
			case 'B':
			 	m = 1;
			 	break;
			
			case 'b':
			 	m = 10;
	 			break;
			
			case 'r':
			 	m = 100;
				break;			
			
			case 'o':
			 	m = 1000;
				break;
			
			case 'y':
			 	m = 10000;
				break;		
		
			case 'g':
			 	m = 100000;
				break;			
			
			case 's':
			 	m = 1000000;
				break;
			
			case 'v':
			 	m = 10000000;
			    break;
			
			case 'G':
			 	m = 100000000;
				break;
			
			case 'w':
			 	v1 = 8;
				break;		
	}
  }
  
  r = v2*m;

  if(m < 1000)
  {
  	printf("The value of resistance is = %d%d {ohms} +/- 20%%(T)",v1,r);
  }
  
  else if(m >= 1000 && m <= 100000)
  {
  	p = r/1000;
  	printf("The value of resistance is = %d%d K {ohms} +/- 20%%(T)",v1,p);
  }
  
  else if(m >= 1000000 && m <= 100000000)
  {
  	p = r/1000000;
  	printf("The value of resistance is = %d%d M {ohms} +/- 20%%(T)",v1,p);
  }
  
  else if(m >= 100000000)
  {
  	p = r/100000000;
  	printf("The value of resistance is = %d%d G {ohms} +/- 20%%(T)",v1,p);
  }
}
}
