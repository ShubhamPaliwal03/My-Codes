#include<iostream>
using namespace std;
int main()
{
	double x,ans=1,temp=1;
	int acc,i;
	
	cout<<"Enter the number you want to calculate e^x of : ";
	cin>>x;
	
//	acc=10;/*set higher accuracy for calculating e^x of higher numbers*/
	
	/*setting accuracy along with optimisation by comparision testing of results*/
	if(x>=0 && x<=5)
		acc=20;
	else if (x>=6 && x<=30)
		acc=50;
	else if(x>=31 && x<=80)
		acc=100;
	else if(x>=81 && x<=160)
		acc=200;
	else if(x>=161 && x<=330)
		acc=400;
	else
		acc=850;		
	/*e^707 is the working limit of this program*/	
	i=1;
	while(i<=acc)
	{
		temp=(temp*x)/i;
		ans = ans + temp;
		i++;
	}
	
	cout<<endl<<"e^"<<x<<" = "<<ans;
	
	return 0;
}