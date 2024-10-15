#include<iostream>
#include<math.h>

using namespace std;

int ReversNumber(int n)
{
	int r=0,num=0;
	
	while(n != 0)
	{
	    num = n%10;
	    r = r*10 + num;
		
		n /= 10;
	}
	
	return r;
}

int BinaryToDecimal(int n)
{
	int num=0,r=0,i=0;
	
	while(n != 0)
	{
		num = n%10;
		r = r + num*(pow(2,i));
		n = n/10 ;
			
		i++;
	}
	
	return r;
}

int DecimalToBinary(int n)
{
	int i=0,bit=0,r=0;
	
	while(n != 0)
	{
		bit = n&1;
		r = r + bit*(pow(10,i));
		
		n = n >> 1;
		i++;
	}
	
	return r;
}
int main()
{
	int n;
	char ch,op;
	
	cout<<"--> Revers the number press 'r'"<<endl<<"--> binary to decimal choos press 'b' "<<endl<<"--> decimal to binary choose press'd' "<<endl<<endl;
	while(op != 'n')
	{
	
	cout<<"Enter the character to use methods = ";
	cin>>ch;
	
	if(ch == 'r')
	{
	cout<<"Enter the number that you want to revers = ";
	cin>>n;
	
	cout<<"The revers of your enterd number is = "<<ReversNumber(n);
    }
    
	else if(ch == 'b')
	{
	cout<<"Enter the DECIMAL number that you want to convert into BINARY = ";
	cin>>n;
	
	cout<<"The binary number is = "<<DecimalToBinary(n)<<endl;
	}
	
	else if(ch == 'd')
	{
	cout<<"Enter the BINARY number that you want to convert into DECIMAL = ";
	cin>>n;
	
	cout<<"The decimal number is = "<<BinaryToDecimal(n)<<endl;
	}
	
	else if(ch != 'b' || 'd' || 'r')
	{
		cout<<"Choosing error!!";
	}
	cout<<endl<<endl<<"Want to continue process 'y' / 'n' : ";
	cin>>op;
	cout<<endl;
	
	if(op == 'y')
	{
	    continue;
	}
	else if(op == 'n')
	{
		cout<<"Ok Thanks!!";
	}
	else
	{
		cout<<"Not understand ('/\\')";
		break;
	}
    }
	return 0;	
}