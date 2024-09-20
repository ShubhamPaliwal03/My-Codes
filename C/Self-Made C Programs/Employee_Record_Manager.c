#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<windows.h>/*used to define SYSTEMTIME , GetLocalTime() and GetSystemTime()*/
typedef struct Person
{
	char name[30];
	int age;
}Person;

typedef struct Date
{
	int dd;
	int mm;
	int yyyy;
}Date;

struct Employee
{
	int ID;			/*Unique ID of the employee*/
	char dept[10];	/*Department of the employee*/
	Date joindate;	/*Date of joining of the employee*/
	Person person;	/*Basic details of the employee*/
	float salary;	/*Salary of the employee*/
	float tenure;	/*Tenure of the employee,calculated using appropriate formula from given joindate*/
};

void Company_Menu()
{
	printf("\n\nPlease select the desired operation from the below given menu items : ");
	printf("\nEnter your choice (A-D) :\n");
	printf("\nA.Add Employee\nB.Display\nC.Update Salary\nD.Exit Menu\n\n");
}

void Add_Employee(struct Employee *E,int a)
{
	int i=a,j,dup=0,calender_uptime,tenure_uptime;
	
	SYSTEMTIME stime; /*SYSTEMTIME struct declared*/

    GetSystemTime(&stime);	/*used GetSystemTime(&stime) to get the calender details*/
	
	calender_uptime = stime.wDay + stime.wMonth*30 + stime.wYear*12*30;
	
	printf("\nEnter the details of the employee : ");
	printf("\n\nID (Numeric) : ");
	scanf("%d",&E[i].ID);
	
	if(i==0)/*if the database is empty*/
	{
		printf("\nDepartment : ");
		fflush(stdin);
		gets(E[i].dept);
							
		printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
		scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
		tenure_uptime = E[i].joindate.dd + E[i].joindate.mm*30 + E[i].joindate.yyyy*12*30;
		while(calender_uptime < tenure_uptime)
		{
			printf("\nCannot input a future date of joining! Please enter a valid date of joining!\n");
			printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
			scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
		}		
							
		printf("\nName : ");
		fflush(stdin);
		gets(E[i].person.name);
							
		printf("\nAge : ");
		scanf("%d",&E[i].person.age);
							
		printf("\nSalary (In LPA, Decimal value allowed) : ");
		scanf("%f",&E[i].salary);
						
		printf("\nEmployee <%s> successfully added into the database!",E[i].person.name);						
	}
	else/*if i!=0 ,ie., the database isn't empty*/
	{
		for(j=0;j<i;j++)
		{
			if(E[j].ID==E[i].ID)/*if an entry of employee with entered ID already exists in the database*/
			{
				dup++;
			}
			else/*if an entry of employee with entered ID does not exist in the database*/
			{
				dup=0;
			}
		}
		if(dup>=1)
		{
			printf("\nEmployee with same ID already exists in the database!");
			printf(" Please enter the employee details with a different ID!");
				
			printf("\n\nID (Numeric) : ");
			scanf("%d",&E[i].ID);
				
			printf("\nDepartment : ");
			fflush(stdin);
			gets(E[i].dept);
							
			printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
			scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
			tenure_uptime = E[i].joindate.dd + E[i].joindate.mm*30 + E[i].joindate.yyyy*30*12;
			while(calender_uptime < tenure_uptime)
			{
				printf("\nCannot input a future date of joining! Please enter a valid date of joining!\n");
				printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
				scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
			}
							
			printf("\nName : ");
			fflush(stdin);
			gets(E[i].person.name);
							
			printf("\nAge : ");
			scanf("%d",&E[i].person.age);
							
			printf("\nSalary (In LPA, Decimal value allowed) : ");
			scanf("%f",&E[i].salary);
						
			printf("\nEmployee <%s> successfully added into the database!",E[i].person.name);
		}
		else/*if dup==0*/
		{
			printf("\nDepartment : ");
			fflush(stdin);
			gets(E[i].dept);
							
			printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
			scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
			tenure_uptime = E[i].joindate.dd + E[i].joindate.mm*30 + E[i].joindate.yyyy*30*12;
			while(calender_uptime < tenure_uptime)
			{
				printf("\nCannot input a future date of joining! Please enter a valid date of joining!\n");
				printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
				scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
			}	
						
			printf("\nName : ");
			fflush(stdin);
			gets(E[i].person.name);
							
			printf("\nAge : ");
			scanf("%d",&E[i].person.age);
						
			printf("\nSalary (In LPA, Decimal value allowed) : ");
			scanf("%f",&E[i].salary);
						
			printf("\nEmployee <%s> successfully added into the database!",E[i].person.name);		
		}
	}

//		for(j=0;j<i;j++)
//		{
//			if(E[j].ID==E[i].ID)
//			{
//				while(E[j].ID==E[i].ID)
//				{	
//					printf("\nEmployee with same ID already exists in the database!");
//					printf(" Please enter the employee details with a different ID!");
//						
//					printf("\n\nID (Numeric) : ");
//					scanf("%d",&E[i].ID);
//				}
//				
//				printf("\nDepartment : ");
//				fflush(stdin);
//				gets(E[j].dept);
//									
//				printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
//				scanf("%d %d %d",&E[j].joindate.dd,&E[j].joindate.mm,&E[j].joindate.yyyy);
//				while(stime.wYear < E[j].joindate.yyyy)
//				{
//					printf("\nCannot input a future date of joining! Please enter a valid date of joining!\n\n");
//					scanf("%d %d %d",&E[j].joindate.dd,&E[j].joindate.mm,&E[j].joindate.yyyy);
//				}		
//									
//				printf("\nName : ");
//				fflush(stdin);
//				gets(E[j].person.name);
//									
//				printf("\nAge : ");
//				scanf("%d",&E[j].person.age);
//									
//				printf("\nSalary (In LPA, Decimal value allowed) : ");
//				scanf("%f",&E[j].salary);
//								
//				printf("\nEmployee <%s> successfully added into the database!",E[j].person.name);	
//			}
//			else
//			{
//				printf("\nDepartment : ");
//				fflush(stdin);
//				gets(E[j].dept);
//									
//				printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
//				scanf("%d %d %d",&E[j].joindate.dd,&E[j].joindate.mm,&E[j].joindate.yyyy);
//				while(stime.wYear < E[j].joindate.yyyy)
//				{
//					printf("\nCannot input a future date of joining! Please enter a valid date of joining!\n\n");
//					scanf("%d %d %d",&E[j].joindate.dd,&E[j].joindate.mm,&E[j].joindate.yyyy);
//				}		
//									
//				printf("\nName : ");
//				fflush(stdin);
//				gets(E[j].person.name);
//									
//				printf("\nAge : ");
//				scanf("%d",&E[j].person.age);
//									
//				printf("\nSalary (In LPA, Decimal value allowed) : ");
//				scanf("%f",&E[j].salary);
//								
//				printf("\nEmployee <%s> successfully added into the database!",E[j].person.name);
//			}
//		}
//				printf("\nDepartment : ");
//				fflush(stdin);
//				gets(E[i].dept);
//								
//				printf("\nDate of joining (in dd mm yyyy format,space seperated) : ");
//				scanf("%d %d %d",&E[i].joindate.dd,&E[i].joindate.mm,&E[i].joindate.yyyy);
//								
//				printf("\nName : ");
//				fflush(stdin);
//				gets(E[i].person.name);
//								
//				printf("\nAge : ");
//				scanf("%d",&E[i].person.age);
//								
//				printf("\nSalary (In LPA, Decimal value allowed) : ");
//				scanf("%f",&E[i].salary);
//							
//				printf("\nEmployee <%s> successfully added into the database!",E[i].person.name);
//		}
//	}
}

void Display(struct Employee *E,int a)
{
	int size=a,i,j;
	struct Employee temp[1000];
	char tmp[100];
	
	SYSTEMTIME stime; /*SYSTEMTIME struct declared*/

    GetSystemTime(&stime);	/*used GetSystemTime(&stime) to get the calender details*/
	
	/*calculating tenure in years*/
	for(j=0;j<size;j++)
	{
		if((stime.wDay >= E[j].joindate.dd) && (stime.wMonth >= E[j].joindate.mm) && (stime.wYear >= E[j].joindate.yyyy))/*to obtain +ve result in case of days and months*/
		{
			E[j].tenure = (stime.wDay - E[j].joindate.dd) + ((stime.wMonth - E[j].joindate.mm)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);
		}
		else if((stime.wDay >= E[j].joindate.dd) && (stime.wMonth < E[j].joindate.mm) && (stime.wYear >= E[j].joindate.yyyy))
		{
			E[j].tenure = (stime.wDay - E[j].joindate.dd) + ((E[j].joindate.mm - stime.wMonth)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);
		}
		else
		{
			E[j].tenure = (E[j].joindate.dd - stime.wDay) + ((E[j].joindate.mm - stime.wMonth)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);	
		}
	}
	
	/*implementing bubble sort for sorting array of objects acc. to salary*/
	for(i=0;i<size-1;i++)
	{
		for(j=0;j<size-i-1;j++)
		{
			if(E[j].salary<E[j+1].salary)
			{
				temp[j].ID=E[j].ID;
				E[j].ID=E[j+1].ID;
				E[j+1].ID=temp[j].ID;
				
				strcpy(tmp,E[j].dept);/*Syntax -> strcpy(destination_string, string_to_be_copied);*/
				strcpy(E[j].dept,E[j+1].dept);
				strcpy(E[j+1].dept,tmp);
				
				temp[j].joindate.dd=E[j].joindate.dd;
				E[j].joindate.dd=E[j+1].joindate.dd;
				E[j+1].joindate.dd=temp[j].joindate.dd;
				
				temp[j].joindate.mm=E[j].joindate.mm;
				E[j].joindate.mm=E[j+1].joindate.mm;
				E[j+1].joindate.mm=temp[j].joindate.mm;
				
				temp[j].joindate.yyyy=E[j].joindate.yyyy;
				E[j].joindate.yyyy=E[j+1].joindate.yyyy;
				E[j+1].joindate.yyyy=temp[j].joindate.yyyy;
				
				temp[j].tenure=E[j].tenure;
				E[j].tenure=E[j+1].tenure;
				E[j+1].tenure=temp[j].tenure;						
				
				strcpy(tmp,E[j].person.name);
				strcpy(E[j].person.name,E[j+1].person.name);
				strcpy(E[j+1].person.name,tmp);				

				temp[j].person.age=E[j].person.age;
				E[j].person.age=E[j+1].person.age;
				E[j+1].person.age=temp[j].person.age;
								
				temp[j].salary=E[j].salary;
				E[j].salary=E[j+1].salary;
				E[j+1].salary=temp[j].salary;				
			}
		}
	}
	
	printf("\nThe details of the employees in decreasing order of their salary are as follows : ");
	for(i=0;i<size;i++)
	{
		if(i==0)
		{
			printf("\n\nThe details of the employee having highest salary in the company are : ");	
		}
		printf("\n\nID : %d",E[i].ID);
		printf("\nDepartment : %s",E[i].dept);
		printf("\nDate of joining : %d / %d / %d",E[i].joindate.dd,E[i].joindate.mm,E[i].joindate.yyyy);
		printf("\nTenure in company : %.2f Years",E[i].tenure/365);/*converting it into years*/
		printf("\nName : %s",E[i].person.name);
		printf("\nAge : %d",E[i].person.age);
		printf("\nSalary : %.2f LPA",E[i].salary);
		
	}
}

void Update_Salary(struct Employee *E,int a)
{
	SYSTEMTIME stime; /*SYSTEMTIME struct declared*/

    GetSystemTime(&stime);	/*used GetSystemTime(&stime) to get the calender details*/
	
	int i=a,j,count=0,criteria,hike,flag[j];
	
	criteria=5*365;/*5 years in years*/
	
	for(j=0;j<i;j++)
	{
		if((stime.wDay > E[j].joindate.dd) && (stime.wMonth > E[j].joindate.mm) && (stime.wYear > E[j].joindate.yyyy))/*to obtain +ve result in case of days and months*/
		{
			E[j].tenure = (stime.wDay - E[j].joindate.dd) + ((stime.wMonth - E[j].joindate.mm)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);
		}
		else if((stime.wDay >= E[j].joindate.dd) && (stime.wMonth < E[j].joindate.mm) && (stime.wYear >= E[j].joindate.yyyy))
		{
			E[j].tenure = (stime.wDay - E[j].joindate.dd) + ((E[j].joindate.mm - stime.wMonth)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);
		}
		else
		{
			E[j].tenure = (E[j].joindate.dd - stime.wDay) + ((E[j].joindate.mm - stime.wMonth)* 30) + ((stime.wYear - E[j].joindate.yyyy)*12*30);	
		}
	
		if(E[j].tenure > criteria)
		{
			printf("\n\nThe details of the employees having a tenure of working more than 5 years in the company are as follows :\n");
				
			printf("\n\nID : %d",E[j].ID);
			printf("\nDepartment : %s",E[j].dept);
			printf("\nDate of joining : %d / %d / %d",E[j].joindate.dd,E[j].joindate.mm,E[j].joindate.yyyy);
			printf("\nTenure in company : %.2f Years",E[j].tenure/365);/*converting it into years*/			
			printf("\nName : %s",E[j].person.name);
			printf("\nAge : %d",E[j].person.age);
			printf("\nSalary : %.2f LPA",E[j].salary);
			
			count++;
			
			flag[j]=1;
		}
		else
		{
			flag[j]=0;
		}
	}
	if(count==0)
	{
		printf("\n\nNo employee found having a tenure of working more than 5 years in the company!");
	}
	
	if(count!=0)
	{
		printf("\n\nEnter the percentage hike in salary you want to provide to the employees : ");
		scanf("%d",&hike);
		
		for(j=0;j<i;j++)
		{
			if(flag[j]==1)
			{
				E[j].salary = E[j].salary + E[j].salary*hike/100;//calculating new salary after the hike
			
				if(j==0)
				{
					printf("\nThe details of the salary hike deserving employees after providing %d percent hike are :\n",hike);		
				}
				
				printf("\n\nID : %d",E[j].ID);
				printf("\nDepartment : %s",E[j].dept);
				printf("\nDate of joining : %d / %d / %d",E[j].joindate.dd,E[j].joindate.mm,E[j].joindate.yyyy);
				printf("\nTenure in company : %.2f Years",E[j].tenure/365);/*converting it into years*/			
				printf("\nName : %s",E[j].person.name);
				printf("\nAge : %d",E[j].person.age);
				printf("\nSalary : %.2f LPA",E[j].salary);
			}
		}
	}
}

int Exit_Menu()
{
	printf("\nThank you! Have a great day! Eagerly waiting to serve you next time!");
	return 0;/*any numerical value other than 1 */
}

int main()
{
	int con,i=0;
	char choice;
	struct Employee E[1000];
	
	do
	{
		system("cls");
		
		printf("\nWelcome to Employee Record Manager!");
		
		Company_Menu();
		
		scanf("%c",&choice);
		
		switch(choice)
		{
			case 'A' : /*Add Employee*/
			
				Add_Employee(&E,i);/*using call by address*/
				i++;
				
			break;
			
			case 'B' : /*Display*/
			
				Display(&E,i);/*using call by address*/
				
			
			break;
			
			case 'C' : /*Update Salary*/
			
				Update_Salary(&E,i);
			
			break;
			
			case 'D' : /*Exit Menu*/
			
				con=Exit_Menu();
			
			break;
					
			default : /*If out of bound choice is entered by the user*/
			
				printf("\nPlease enter a valid choice!");
		}
		
		printf("\n\nPress 1 to continue\n\n");
        scanf("%d",&con);
	}
	while(con==1);
	
	return 0;
}