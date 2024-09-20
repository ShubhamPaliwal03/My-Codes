#include<iostream>
using namespace std;
void originalValue(float num)
{
	cout<<"Original value : "<<num;
}
void roundToTenths(int *O,int *T,int *H,int *TH)
{
	
	if(*O>=0 && *O<=4)
	{
		*O=0;
	}
	else/*if dO>=5 && dO <=9*/
	{	
		*O=0;
		*T=*T+1;
		if(*T==9)
		{
			*H=*H+1;
		}
		if(*H==9)
		{
			*TH=*TH+1;
		}
	}
	cout<<"After rounding off to Tenths : ";
	if(*TH!=0)
		cout<<*TH<<*H<<*T<<*O;
	else if(*TH==0)
		cout<<*H<<*T<<*O;
	else if(*H==0)
		cout<<*T<<*O;
	else
		cout<<*O;		
		
}
int main()
{
	float num;
	int dO,dT,dH,dTH,res;
	
	res=(int)num;
	
	dO=res%10;
	dT=res%100/10;
	dH=res%1000/100;
	dTH=res%10000/1000;
	
	cout<<"Enter the number which you want to round off : ";
	cin>>num;

	cout<<endl<<"The various values of the entered number are as follows : "<<endl<<endl;
	originalValue(num);
	cout<<endl;
	roundToTenths(&dO,&dT,&dH,&dTH);
	
	return 0;
}