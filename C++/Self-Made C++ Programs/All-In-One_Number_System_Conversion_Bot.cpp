#include<iostream>
#include<math.h>
#define SIZE 1024
using namespace std;

void ConvertFromDecimal(int n,int s)
{
	int i=0,j,bits[SIZE];
	
	while(n>=1)// while(n!=0) // while (n>0)
	{
		bits[i]=n%s;
		n=n/s;
		i++;
	}
	for(j=i-1;j>=0;j--)
	{
		if(s==16)
		{
			switch(bits[j])
			{
				case 10 :
					cout<<"A";
					break;
					
				case 11 :
					cout<<"B";
					break;
					
				case 12 :
					cout<<"C";
					break;
					
				case 13 :
					cout<<"D";
					break;
					
				case 14 :
					cout<<"E";
					break;
						
				case 15 :
					cout<<"F";
					break;
					
				default :
					cout<<bits[j];
					break;						
			}
		}
		else
		{
			cout<<bits[j];
		}
	}
}

void ConvertFromBinary(int n,int s)
{
	int num=0,r=0,i=0;
	
	
	while(n!=0)
	{	
		num=n%10;
		r=r+num*pow(s,i);
		n=n/10;
		i++;
	} 
		if(s==16)
		{
			switch(r)
			{
				case 10 :
					cout<<"A";
					break;
					
				case 11 :
					cout<<"B";
					break;
					
				case 12 :
					cout<<"C";
					break;
					
				case 13 :
					cout<<"D";
					break;
					
				case 14 :
					cout<<"E";
					break;
						
				case 15 :
					cout<<"F";
					break;
					
				default :
					cout<<r;
					break;						
			}
		}
		else
		{
			cout<<r;
		}	
}

int main()
{
	int n,s,choice,con,bits[SIZE],i;
	do
	{
		system("cls");
		cout<<"Welcome to All-in-one Number System Conversion Bot!";
		cout<<endl<<"---------------------------------------------------";
		cout<<endl<<endl<<"Please select the conversion operation of your choice :";
		cout<<endl<<"-------------------------------------------------------";
		cout<<endl<<endl<<"1.Decimal to Binary\n2.Decimal to Octal\n3.Decimal to Hexadecimal\n4.Binary to Decimal\n5.Binary to Octal\n6.Binary to Hexadecimal"<<endl<<endl;
		cin>>choice;
		
		cout<<endl<<"Enter the number : ";
		cin>>n;
			
		switch(choice)
		{	
				
			/*cases for converting decimal to others*/
			case 1 :
				s=2;
				cout<<endl<<"The number in Binary form is : ";
				ConvertFromDecimal(n,s);
				break;
				
			case 2 :
			
				s=8;	
				cout<<endl<<"The number in Octal form is : ";
				ConvertFromDecimal(n,s);
				break;
			
			case 3 :
				
				s=16;	
				cout<<endl<<"The number in Hexadecimal form is : ";
				ConvertFromDecimal(n,s);
				break;
			
			/*cases for converting from binary to others*/
			case 4 :
				
				s=2;
				cout<<endl<<"The number in Decimal form is : ";
				ConvertFromBinary(n,s);
				break;
				
			case 5 :
				
				s=8;
				cout<<endl<<"The number in Octal form is : ";
				ConvertFromBinary(n,s);
				break;
				
			case 6 :
				
				s=16;
				cout<<endl<<"The number in Hexadecimal form is : ";
				ConvertFromBinary(n,s);
				break;			
		}	
		cout<<endl<<endl<<"Press 1 to continue,otherwise press any other key to exit !"<<endl<<endl;
		cin>>con;
	}
	while(con==1);
}