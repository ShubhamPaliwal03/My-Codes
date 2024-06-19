#include<iostream>
using namespace std;
int main()
{
	int n,i,r,d;
	
	cout<<"Enter the number which you want to convert into Roman Numeral form : ";
	cin>>n;

	cout<<endl<<"The number in Roman Numeral form is : ";

	r=n/1000;
	d=n%1000;

	for(i=0;i<r;i++)
	{
		cout<<"M";
	}

	r=d/900;
	d=d%900;

	for(i=0;i<r;i++)
	{
		cout<<"CM";
	}	

	r=d/500;
	d=d%500;

	for(i=0;i<r;i++)
	{
		cout<<"D";
	}

	r=d/400;
	d=d%400;

	for(i=0;i<r;i++)
	{
		cout<<"CD";
	}

	r=d/100;
	d=d%100;

	for(i=0;i<r;i++)
	{
		cout<<"C";
	}

	r=d/90;
	d=d%90;

	for(i=0;i<r;i++)
	{
		cout<<"XC";
	}

	r=d/50;
	d=d%50;

	for(i=0;i<r;i++)
	{
		cout<<"L";
	}

	r=d/40;
	d=d%40;

	for(i=0;i<r;i++)
	{
		cout<<"XL";
	}

	r=d/10;
	d=d%10;

	for(i=0;i<r;i++)
	{
		cout<<"X";
	}

	r=d/9;
	d=d%9;

	for(i=0;i<r;i++)
	{
		cout<<"IX";
	}

	r=d/5;
	d=d%5;

	for(i=0;i<r;i++)
	{
		cout<<"V";
	}

	r=d/4;
	d=d%4;

	for(i=0;i<r;i++)
	{
		cout<<"IV";
	}

	r=d/1;

	for(i=0;i<r;i++)
	{
		cout<<"I";
	}
	
	return 0;
}