#include<iostream>
#include<conio.h>
#include<string.h>
#include<fstream>
#include<math.h>
#include"class_BankAccount.h"
using namespace std;

void MaskedInput(char password[],int size,char maskedchar)
{
	int i;
	
	for(i=0;i<99;i++)
	{
		char c=getch();// reading the password character by character
		
		if(c==13)
		{
			break;
		}
		
		password[i]=c;//assigning the character read (c) to the password
		
		cout<<maskedchar;
	}
	
	password[i]='\0';
}

bool IsAdmin(char username[],char password[])
{
	char savedusername[100],savedpassword[100];
	
	ifstream fin("admin_login.txt");
	
	fin>>savedusername;
	fin>>savedpassword;
	
	return strcmp(savedusername,username)==0 && strcmp(savedpassword,password)==0;
}

int getNumberOfRecords()
{
	ifstream fin("count_record.txt");
	int count;
	fin>>count;
	fin.close();
	
	return count;
}

char * const getFileName(int records)
{
	int acn=100000+records;
	int t=acn;
	
	//get the length of the number
	int length=0;
	while(t!=0)
	{
		length++;
		t/=10;
	}
	
	//power=calculate 10 to the power length-1
	int power=pow(10,length-1);
	
	t=acn;
	char * const stracn = new char[100];
	int i=0;
	
	while(power!=0)
	{
		//divide the number by power
		int digit=t/power%10;
		
		//divide the power by 10
		power/=10;
		
		//store the divided digit into the character array
		*(stracn+i)=(char)(48+digit);//48 is the ASCII code for '0'
		// we can also use stracn[i]
		i++;
		
		//repeat the above process until power!=0
	 }
	 
	 //store null at the end of the string
	 *(stracn+i)='\0';
	 
	 //return the string
	 return stracn;
}

void showAllaccounts()
{	
	BankAccount account;
	int count=getNumberOfRecords();
	int i;
	char filename[100];
	
	if(count!=0)
	{		
		for(i=1;i<=count;i++)
		{
			strcpy(filename,getFileName(i));
			strcat(filename,".dat");
			
			ifstream fin(filename);
			fin.read((char*)&account,sizeof(account));
			
			account.printDetails();
			
			fin.close();
			
			cout<<endl<<"-------------------------------------------------------------------------------------------"<<endl;
			char ch=getch();
		}
		
		cout<<endl<<"The above displayed were all the accounts present in the database right now..."<<endl;
	}
	else
	{
		cout<<endl<<"There are no active accounts in our bank"<<endl;
	}
}

void prompt()
{
	cout<<endl<<"Press any key to continue...";
	char ch=getch();	
}

void updateNumberOfRecords(int records)
{
	ofstream fout("count_record.txt");
	fout<<records;
	fout.close();
}