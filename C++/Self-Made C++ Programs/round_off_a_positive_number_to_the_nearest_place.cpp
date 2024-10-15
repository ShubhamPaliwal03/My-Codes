#include<iostream>
#include<math.h>
using namespace std;

void originalValue(float num)
{
	cout<<"Original value : "<<num;
}
void roundOffToInteger(float num)
{
	int res;
	res = (int) num<0 ? num-0.5 : num+0.5;
	cout<<endl<<"After rounding off to the nearest Integer(Ones/Units) : "<<res;
}
void roundOffToTens(float num)
{
	int dO,dT,dH,dTH,dTTH,res,len,lfd,Ocheck;
	/*dO, dT, dH and dTH are ones(units), tens, hundreds and thousands respectively*/
	/*lfd is an acronym for leftover front digits*/
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/
	
	len=0;
	while(res!=0)
	{
		res=res/10;
		len++;
	}
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/	
		
	if(len>5)
	{
		lfd = res % (int)pow(10,len) / 100000;
	}
	else
	{
		lfd=0;
	}

		dO=res%10;
		Ocheck=dO;
		dT=res%100/10;
		dH=res%1000/100;
		dTH=res%10000/1000;
		dTTH=res%100000/10000;
		
		if(dO>=0 && dO<=4)
		{
			dO=0;
		}
		else/*if dO>=5 && dO <=9*/
		{	
			dO=0;
			if(dT==9)
			{
				dT=0;
				if(dH==9)
				{
					dH=0;
					if(dTH==9)
					{
						dTH=0;
						if(dTTH==9)
						{
							dTTH=0;
							lfd=lfd+1;	
						}
						else
						{	
							dTTH=dTTH+1;
						}
					}
					else
					{
						dTH=dTH+1;
					}
				}
				else
				{
					dH=dH+1;
				}
			}
			else
			{
				dT=dT+1;
			}
		}
	
		cout<<endl<<"After rounding off to the nearest Tens : ";
	
		if(lfd!=0)
		{
			cout<<lfd<<dTTH<<dTH<<dH<<dT<<dO;
		}
		else/*if lfd==0*/
		{
			if(dTTH!=0)
				cout<<dTTH<<dTH<<dH<<dT<<dO;
			else if(dTH!=0)
				cout<<dTH<<dH<<dT<<dO;	
			else if(dH!=0)
				cout<<dH<<dT<<dO;
			else if(dT!=0)
				cout<<dT<<dO;
			else
				cout<<dO;
		}
		if(len<2 && Ocheck<=4)
		{
			cout<<endl<<num<<" is too small to be rounded off to the nearest tens, so the result is 0";
		}	
				
}
void roundOffToHundreds(float num)
{
	int dO,dT,dH,dTH,dTTH,res,len,lfd,Tcheck;
	/*dO, dT, dH and dTH are ones(units), tenths, hundredths and thousandths respectively*/
	/*lfd is an acronym for leftover front digits*/
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/
	
	len=0;
	while(res!=0)
	{
		res=res/10;
		len++;
	}
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/
		
	if(len>5)
	{
		lfd = res % (int)pow(10,len) / 100000;
	}
	else
	{
		lfd=0;
	}	
	
		dO=res%10;
		dT=res%100/10;
		Tcheck=dT;
		dH=res%1000/100;
		dTH=res%10000/1000;
		dTTH=res%100000/10000;
		
		if(dT>=0 && dT<=4)
		{
			dO=0;
			dT=0;
		}
		else/*if dT>=5 && dT <=9*/
		{
			dO=0;
			dT=0;
			if(dH==9)
			{
				dH=0;
				if(dTH==9)
				{
					dTH=0;
					if(dTTH==9)
					{
						dTTH=0;
						lfd=lfd+1;
					}
					else
					{
						dTTH=dTTH+1;
					}
				}
				else
				{
					dTH=dTH+1;
				}
			}
			else
			{
				dH=dH+1;
			}
		}
			
		cout<<endl<<"After rounding off to the nearest Hundreds : ";
		
		if(lfd!=0)
		{
			cout<<lfd<<dTTH<<dTH<<dH<<dT<<dO;
		}
		else/*if lfd==0*/
		{
			if(dTTH!=0)
				cout<<dTTH<<dTH<<dH<<dT<<dO;
			else if(dTH!=0)
				cout<<dTH<<dH<<dT<<dO;	
			else if(dH!=0)
				cout<<dH<<dT<<dO;
			else if(dT!=0)
				cout<<dT<<dO;
			else
				cout<<dO;	
		}
		if(len<3 && Tcheck<=4)
		{
			cout<<endl<<num<<" is too small to be rounded off to the nearest hundreds, so the result is 0";
		}
}
void roundOffToThousands(float num)
{
	int dO,dT,dH,dTH,dTTH,res,len,lfd,Hcheck;
	/*dO, dT, dH and dTH are ones(units), tens, hundreds and thousands respectively*/
	/*lfd is an acronym for leftover front digits*/
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/
	
	len=0;
	while(res!=0)
	{
		res=res/10;
		len++;
	}
	
	res=(int)num;/*explicitly typecasting num in float datatype to int in int datatype*/
		
	if(len>5)
	{
		lfd = res % (int) pow(10,len) / 100000;
	}
	else
	{
		lfd=0;
	}

		dO=res%10;
		dT=res%100/10;
		dH=res%1000/100;
		Hcheck=dH;
		dTH=res%10000/1000;
		dTTH=res%100000/10000;
		
		if(dH>=0 && dH<=4)
		{
			dO=0;
			dT=0;
			dH=0;
		}
		else/*if dH>=5 && dH <=9*/
		{
			dO=0;
			dT=0;
			dH=0;
			if(dTH==9)
			{
				dTH=0;
				if(dTTH==9)
				{
					dTTH=0;
					lfd=lfd+1;
				}
				else
				{
					dTTH=dTTH+1;
				}
			}
			else
			{
				dTH=dTH+1;
			}
		}
		
		cout<<endl<<"After rounding off to the nearest Thousands : ";
		
		if(lfd!=0)
		{
			cout<<lfd<<dTTH<<dTH<<dH<<dT<<dO;
		}
		else/*if lfd==0*/
		{
			if(dTTH!=0)
				cout<<dTTH<<dTH<<dH<<dT<<dO;
			else if(dTH!=0)
				cout<<dTH<<dH<<dT<<dO;	
			else if(dH!=0)
				cout<<dH<<dT<<dO;
			else if(dT!=0)
				cout<<dT<<dO;
			else
				cout<<dO;	
		}
		if(len<4 && Hcheck<=4)
		{
			cout<<endl<<num<<" is too small to be rounded off to the nearest thousands, so the result is 0";
		}
		cout<<endl;
}
int main()
{
	float num;
	
	int i;
	
	cout<<"Enter the positive number which you want to round off : ";
	cin>>num;

	cout<<endl<<"The various values of the entered positive number are as follows : "<<endl;
	for(i=0;i<=65;i++)/*to draw a seperation line for a neat output*/
		cout<<"-";
		
	cout<<endl<<endl;	
	originalValue(num);
	
	cout<<endl;
	roundOffToInteger(num);
	
	cout<<endl;
	roundOffToTens(num);
	
	cout<<endl;
	roundOffToHundreds(num);
	
	cout<<endl;
	roundOffToThousands(num);
	
	return 0;
}