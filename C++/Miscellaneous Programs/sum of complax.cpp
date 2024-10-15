#include<iostream>

using namespace std;

class complax
{
	int rn,in,rn1,in1;
	
	public : 
	
	void getnum()
	{
		cout<<"Enter the real numbers = ";
		cin>>rn;
		cout<<"Enter the imag. numbers = ";
		cin>>in;
	}
	
	void getnum1()
	{
		cout<<"Enter the second real numbers = ";
		cin>>rn1;
		cout<<"Enter the second imag. numbers = ";
		cin>>in1;
	}
	
	void display()
	{
		cout<<"The complax number 1 is = "<<rn<<" + i"<<in<<endl;
		cout<<"The complax number 2 is = "<<rn1<<" + i"<<in1<<endl;
	}
	
	void result()
	{
		cout<<"The sum of tow complax number is = "<<rn+rn1<<" + i"<<in+in1;
	}
};

int main()
{
	complax c;
	
	c.getnum();
	c.getnum1();
	c.display();
	c.result();
	
	return 0;
}