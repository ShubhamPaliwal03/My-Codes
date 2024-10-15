#include<iostream>
using namespace std;

class BankAccount
{
	int acn;
	char firstname[100],lastname[100],email[100],dob[11],address[100],mobile[11];
	float balance;
	
	public:
		
		void input(int records)
		{
			acn=100000+records;
			
			cout<<endl<<"Enter Details :"<<endl<<endl;
			
			cout<<"First name\t\t: ";
			cin>>firstname;
			
			cout<<"Last name\t\t: ";
			cin>>lastname;
			
			cout<<"Email address\t\t: ";
			cin>>email;
			
			cout<<"D.O.B. (dd-mm-yyyy)\t: ";
			cin>>dob;
			
			cout<<"Mobile number\t\t: ";
			cin>>mobile;
			
			fflush(stdin);
			
			cout<<"Address\t\t\t: ";
			cin.getline(address,99);
			
			cout<<"Opening balance\t\t: ";
			cin>>balance;
		}
		
		void printDetails()
		{
			cout<<endl<<"Details : "<<endl;
			
			cout<<endl<<"Account Number\t\t: "<<acn;
			
			cout<<endl<<"First name\t\t: "<<firstname;			
			
			cout<<endl<<"Last name\t\t: "<<lastname;			
			
			cout<<endl<<"Email address\t\t: "<<email;			
			
			cout<<endl<<"D.O.B. (dd-mm-yyyy)\t: "<<dob;			
			
			cout<<endl<<"Mobile number\t\t: "<<mobile;		
			
			cout<<endl<<"Address\t\t\t: "<<address;			
			
			cout<<endl<<"Opening balance\t\t: "<<balance;		
		}
		
		int getBalance()
		{
			return balance;
		}
		
		void setBalance(int balance)
		{
			this->balance=balance;
		}
		
		void setFirstName(char str[])
		{
			strcpy(firstname,str);
		}
		
		void setLastName(char str[])
		{
			strcpy(lastname,str);
		}
		
		void setEmailAddress(char str[])
		{
			strcpy(email,str);
		}
		
		void setDOB(char str[])
		{
			strcpy(dob,str);
		}
		
		void setMobileNumber(char str[])
		{
			strcpy(mobile,str);
		}
		
		void setAddress(char str[])
		{
			strcpy(address,str);
		}		
};