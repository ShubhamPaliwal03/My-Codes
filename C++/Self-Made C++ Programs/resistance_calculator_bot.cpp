#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int nb,i,bv[i];
	char bc[i],b,B,r,o,y,l,c,v,g,w,G,s;
	
	cout<<"Welcome to resistance calculator bot!\n";
	
	cout<<"\nEnter the number of bands present your resistor : ";
	cin>>nb;
	
	if(nb<3||nb>6)
	{
		cout<<"\nInvalid number configuration of bands entered!\n";
		cout<<"Please enter number a valid number configuration of bands from 3/4/5/6!";
	}
	else
	{
		cout<<"\nUse the following index to input band colour :\n"<<"Black=b\nBrown=B\nRed=r\nOrange=o\nYellow=y\nGreen=l\nBlue=c\nViolet=v\nGrey=g\nWhite=w\nGold=G\nSilver=s\n";
		
		for(i=1;i<=nb;++i)
		{
			cout<<"\nEnter the colour of band "<<i<<" : ";
			cin>>bc[i];
//			if(nb=3)
//			{
			
				switch(bc[i])
				{
					case 'b':
					bv[i] = 0;
					break;
							
					case 'B':
					bv[i] = 1;
					break;
							
					case 'r':
					bv[i] = 2;
					break;
							
					case 'o':
					bv[i] = 3;
					break;
							
					case 'y':
					bv[i] = 4;
					break;
							
					case 'l':
					bv[i] = 5;
					break;
							
					case 'c':
					bv[i] = 6;
					break;
							
					case 'v':
					bv[i] = 7;
					break;
							
					case 'g':
					bv[i] = 8;
					break;
							
					case 'w':
					bv[i] = 9;
					break;
										
					case 'G':
					bv[i]= 0;
					break;
							
					case 's':
					bv[i] = 0;
					break;
				}
				
//				switch(bc2)
//				{
//					case 'b':
//					bv2 = 0;
//					break;
//							
//					case 'B':
//					bv2 = 1;
//					break;
//							
//					case 'r':
//					bv2 = 2;
//					break;
//							
//					case 'o':
//					bv2 = 3;
//					break;
//							
//					case 'y':
//					bv2 = 4;
//					break;
//							
//					case 'l':
//					bv2 = 5;
//					break;
//							
//					case 'c':
//					bv2 = 6;
//					break;
//							
//					case 'v':
//					bv2 = 7;
//					break;
//							
//					case 'g':
//					bv2 = 8;
//					break;
//							
//					case 'w':
//					bv2 = 9;
//					break;
//										
//					case 'G':
//					bv2 = 0;
//					break;
//							
//					case 's':
//					bv2 = 0;
//					break;
//				}
//				
//				switch(bc3)
//				{
//					case 'b':
//					bv3 = 0;
//					break;
//							
//					case 'B':
//					bv3 = 1;
//					break;
//							
//					case 'r':
//					bv3 = 2;
//					break;
//							
//					case 'o':
//					bv3 = 3;
//					break;
//							
//					case 'y':
//					bv3 = 4;
//					break;
//							
//					case 'l':
//					bv3 = 5;
//					break;
//							
//					case 'c':
//					bv3 = 6;
//					break;
//							
//					case 'v':
//					bv3 = 7;
//					break;
//							
//					case 'g':
//					bv3 = 8;
//					break;
//							
//					case 'w':
//					bv3 = 9;
//					break;
//										
//					case 'G':
//					bv3 = 0;
//					break;
//							
//					case 's':
//					bv3 = 0;
//					break;
//				}
			}
		}
		cout<<bv[i];
		 cout<<bv[i]<<endl<<bv[i+1]<<endl<<bv[i+2];
	return 0;
}