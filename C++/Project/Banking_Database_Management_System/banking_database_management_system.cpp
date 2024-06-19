#include<iostream>
#include<fstream>
#include"operational_functions.h"
using namespace std;

int main()
{
	char username[100],password[100],filename[100],ch,tmpstr[100];
	
	int choice,re_choice,records,acn,current_bal,deposit_amt,withdrawl_amt,attempts=5;
	
	fstream fout;
	ifstream readfile;
	ofstream writefile;
	
	cout<<endl<<"WELCOME TO SBI BANKING DATABASE MANAGEMENT SYSTEM!";
	cout<<endl<<"--------------------------------------------------"<<endl;
	
	re_attempt:
		
	cout<<endl<<"ADMIN LOGIN PANEL : ";
	cout<<endl<<"-----------------";
		
	cout<<endl<<endl<<"Username : ";
	cin>>username;
	
	cout<<endl<<"Password : ";
	MaskedInput(password,100,'*');
	
	if(IsAdmin(username,password))
	{
		cout<<endl<<endl<<"Welcome "<<username<<"...Logged in Successfully !";
		sleep(0.7);
		do
		{
			system("cls");
			cout<<endl<<"SBI BANKING DATABASE MANAGEMENT SYSTEM ADMIN OPERATIONS PANEL : ";
			cout<<endl<<"----------------------------------------------------------------";
			cout<<endl<<"\n1.Open a new account\n\n2.Deposit\n\n3.Withdraw\n\n4.Check Balance\n\n5.Update Details\n\n6.Show all accounts\n\n7.Total number of accounts\n\n8.Exit";
			cout<<endl<<endl<<"----------------------------------------------------------------";
			cout<<endl<<endl<<"Select the operation you want to perform : ";
			cin>>choice;
			
			switch(choice)
			{
				case 1 :
					
					records=getNumberOfRecords();
					records++;
					
					strcpy(filename,getFileName(records));
					strcat(filename,".dat");
					
					fout.open(filename,ios::app);
					
					BankAccount ba;
					ba.input(records);
					fout.write((char*)&ba,sizeof(ba));
					fout.close();
					
					updateNumberOfRecords(records);
					
					prompt();
					
					break;
				
				case 2 :
					
					cout<<endl<<"Enter the account number for processing the deposit : ";
					cin>>acn;
					
					strcpy(filename,getFileName(acn));
					strcat(filename,".dat");
					
					readfile.open(filename);
					
					if(readfile)
					{
						cout<<endl<<"Enter the deposit amount : ";
						cin>>deposit_amt;
						
						BankAccount ba;
						readfile.read((char*)&ba,sizeof(ba));
						current_bal=ba.getBalance();
						
						cout<<endl<<"Processing your request..."<<"Depositing "<<deposit_amt<<" INR";
						ba.setBalance(current_bal+deposit_amt);
						cout<<endl<<endl<<"After depositing "<<deposit_amt<<" INR, Available Balance is "<<ba.getBalance()<<" INR"<<endl;
						
						readfile.close();
						
						writefile.open(filename);
						writefile.write((char*)&ba,sizeof(ba));
						
						writefile.close();						
					}
					else
					{
						cout<<endl<<"Invalid account number!";
						cout<<endl<<"Please enter a valid account number";
					}
					
					prompt();
					
					break;
					
				case 3 :
					
					cout<<endl<<"Enter the account number for processing the withdrawl : ";
					cin>>acn;
					
					strcpy(filename,getFileName(acn));
					strcat(filename,".dat");
					
					readfile.open(filename);

					if(readfile)
					{
						cout<<endl<<"Enter the withdrawl amount : ";
						cin>>withdrawl_amt;
						
						BankAccount ba;
						readfile.read((char*)&ba,sizeof(ba));
						readfile.close();
						
						current_bal=ba.getBalance();
						
						if(current_bal<withdrawl_amt)
						{
							cout<<endl<<"Insufficient Balance! Withdrawl Not Possible!";
						}
						else
						{
							cout<<endl<<"Processing your request..."<<"Withdrawing "<<withdrawl_amt<<" INR";
							ba.setBalance(current_bal-withdrawl_amt);
							cout<<endl<<endl<<"After withdrawing "<<withdrawl_amt<<" INR, Available Balance is "<<ba.getBalance()<<" INR"<<endl;
							
							writefile.open(filename);
							writefile.write((char*)&ba,sizeof(ba));
							writefile.close();
						}
					}
					else
					{
						cout<<endl<<"Invalid account number!";
						cout<<endl<<"Please enter a valid account number";
					}
					
					prompt();
					
					break;
					
				case 4 :
					
					
					cout<<endl<<"Enter the account number for checking the current account balance : ";
					cin>>acn;
					
					strcpy(filename,getFileName(acn));
					strcat(filename,".dat");
					
					readfile.open(filename);
					
					if(readfile)
					{
						BankAccount ba;
						readfile.read((char*)&ba,sizeof(ba));
						readfile.close();
						
						cout<<endl<<"The current account balance is : "<<ba.getBalance()<<endl;
					}
					else
					{
						cout<<endl<<"Invalid account number!";
						cout<<endl<<"Please enter a valid account number";						
					}
					
					prompt();
					
					break;
					
				case 5 :
					
					cout<<endl<<"Enter the account number to update the details : ";
					cin>>acn;
					
					strcpy(filename,getFileName(acn));
					strcat(filename,".dat");
					
					readfile.open(filename);
					
					if(readfile)
					{
						readfile.read((char*)&ba,sizeof(ba));
						readfile.close();
						
						do
						{
							cout<<"\n1.Update First name";
							cout<<"\n2.Update Last name";
							cout<<"\n3.Update Email address";
							cout<<"\n4.Update D.O.B.";
							cout<<"\n5.Update Mobile number";
							cout<<"\n6.Update Address";
							cout<<"\n7.Save and Quit from update menu";
							cout<<"\n\nSelect your choice from the above given menu : ";
							
							cin>>choice;
							
							fflush(stdin);
							
							switch(choice)
							{
								case 1:
									
									cout<<endl<<"Enter the new first name : ";
									cin>>tmpstr;
									
									ba.setFirstName(tmpstr);
									break;
									
								case 2:
								
									cout<<endl<<"Enter the new last name : ";
									cin>>tmpstr;
									
									ba.setLastName(tmpstr);
									break;
									
								case 3:
								
									cout<<endl<<"Enter the new Email address : ";
									cin>>tmpstr;
									
									ba.setEmailAddress(tmpstr);
									break;
									
									
								case 4:
								
									cout<<endl<<"Enter the new D.O.B. : ";
									cin>>tmpstr;
									
									ba.setDOB(tmpstr);
									break;	
									
								case 5:
								
									cout<<endl<<"Enter the new Mobile number : ";
									cin>>tmpstr;
									
									ba.setMobileNumber(tmpstr);
									break;
									
								case 6:
								
									cout<<endl<<"Enter the new Address : ";
									cin.getline(tmpstr,99);
									
									ba.setAddress(tmpstr);
									break;
													
								case 7:
									break;// we can't use exit(0) here as it will get the control out of the main do while loop and will terminate the program 
								
								default:
									cout<<endl<<"Please enter a valid choice (1-7)";																					
							}
							
							fflush(stdin);
							
							if(choice==7)
							{
								break;
							}
							
						}while(1);
						
						writefile.open(filename);
						writefile.write((char*)&ba,sizeof(ba));//we can also write sizeof(BankAccount) as the size of a datatype(here,class) is same as the size of the variable(here,object)
						writefile.close();
					}
					else
					{
						cout<<endl<<"Invalid account number!";
						cout<<endl<<"Please enter a valid account number";
					}
					
					prompt();
					
					break;
				
				case 6 :
				
					showAllaccounts();
					//we have declared this as a seperate function because we can't declare a variable or an object in a switch case
					prompt();
					
					break;
					
				case 7 :
				
					cout<<endl<<"Currently, there are "<<getNumberOfRecords()<<" bank accounts active in our bank"<<endl;
					prompt();
					
					break;		
					
				case 8 :
				
					prompt();
					exit(0);// this is a predefined function to get the control out of the loop or simply exit
					
					break;		
			}
			
		}while(1);
	}
	else
	{
		cout<<endl<<endl<<"Invalid Username or Password...Couldn't log in !";
		cout<<endl<<endl<<"You have only "<<attempts<<" attempts left to log in...";
		cout<<endl<<"------------------------------------------";
		cout<<endl<<endl<<"Press 1 to try again"<<endl<<"Press 2 to exit"<<endl;
		cout<<endl<<"Enter your choice : ";
		cin>>re_choice;
		
		attempts--;
		
		if(attempts==0)
		{
			//Temporary time based account blocking functionality will be activated soon
			cout<<endl<<"TO ENSURE OUR DATABASE'S SECURITY, YOUR ADMIN ACCOUNT HAS BEEN TEMPORARLILY BLOCKED DUE TO MULTIPLE WRONG LOGIN ATTEMPTS....";
			sleep(1);
			exit(0);// this is a predefined function to terminate the program, ie., reporting that it got executed without any errors
		}
		else if(re_choice==1)
		{
			system("cls");
			goto re_attempt;
		}
		else
		{
			exit(0);// this is a predefined function to terminate the program, ie., reporting that it got executed without any errors
		}
	}
	
	return 0;
}