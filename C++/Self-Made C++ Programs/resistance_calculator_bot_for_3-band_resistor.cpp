#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	char bc1,bc2,bc3,b,B,r,o,y,l,c,v,g,w,G,s;
	
	cout<<"Welcome to resistance calculator bot for 3-band resistor!\n";
	cout<<"\nEnter the colour of 1st band : ";
	cin>>bc1;
	cout<<bc1;
	cout<<"\nEnter the colour of the 2nd band: ";
	fflush(stdin);
	cin>>bc2;
	cout<<"\nEnter the colour of the 3rd band: ";
	fflush(stdin);
	cin>>bc3;
	
	/*for 1st band colour*/
	
	int b1valcolour;	
		
	if(bc1==b)
		b1valcolour=0;

	if(bc1==B)
		b1valcolour=1;
		
	if(bc1==r)
		b1valcolour=2;
		
	if(bc1==o)
		b1valcolour=3;
		
	if(bc1==y)
		b1valcolour=4;
		
	if(bc1==l)
		b1valcolour=5;
		
	if(bc1==c)
		b1valcolour=6;
		
	if(bc1==v)
		b1valcolour=7;
		
	if(bc1==g)
		b1valcolour=8;
		
	if(bc1==w)
		b1valcolour=9;
	
	if(bc1==G)
		b1valcolour=0;
	
	if(bc1==s)
		b1valcolour=0;
	
	/*for 2nd band colour*/
	
	int b2valcolour;
	
	if(bc2==b)
		b2valcolour=0;
		
	if(bc2==B)
		b2valcolour=1;
		
	if(bc2==r)
		b2valcolour=2;
		
	if(bc2==o)
		b2valcolour=3;
		
	if(bc2==y)
		b2valcolour=4;
		
	if(bc2==l)
		b2valcolour=5;
		
	if(bc2==c)
		b2valcolour=6;
		
	if(bc2==v)
		b2valcolour=7;
		
	if(bc2==g)
		b2valcolour=8;
		
	if(bc2==w)
		b2valcolour=9;
	
	if(bc2==G)
		b2valcolour=0;
	
	if(bc2==s)
		b2valcolour=0;
	
	/*for 3rd band colour*/
	
	int b3valcolour;
	double multipliervalcolour;
	
	if(bc3==b)
	{
		b3valcolour=0;
		multipliervalcolour=1;
	}
	if(bc3==B)
	{
		b3valcolour=1;
		multipliervalcolour=10;
	}
	if(bc3==r)
	{
		b3valcolour=2;
		multipliervalcolour=100;
	}
	int K=1000;
	if(bc3==o)
	{
		b3valcolour=3;
		multipliervalcolour=1*K;;
	}
	if(bc3==y)
	{
		b3valcolour=4;
		multipliervalcolour=10*K;
	}
	if(bc3==l)
	{
		b3valcolour=5;
		multipliervalcolour=100*K;
	}
	int M=1000*K;
	if(bc3==c)
	{
		b3valcolour=6;
		multipliervalcolour=1*M;
	}
	if(bc3==v)
	{
		b3valcolour=7;
	    multipliervalcolour=10*M;
	}
	if(bc3==g)
	{
		b3valcolour=8;
		multipliervalcolour=0;
	}
	if(bc3==w)
	{
		b3valcolour=9;
		multipliervalcolour=0;
	}
	if(bc3==G)
	{
		b3valcolour=0;
		multipliervalcolour=0.1;
	}
	if(bc3==s)
	{
		b3valcolour=0;
		multipliervalcolour=0.01;
	}

int b3valcolour_multipliervalcolour_resultant;
	
b3valcolour_multipliervalcolour_resultant=pow(multipliervalcolour,b3valcolour);
    
cout<<"Resistance = "<<b1valcolour<<b2valcolour<<b3valcolour_multipliervalcolour_resultant<<" Ohm";
    
return 0;
}
