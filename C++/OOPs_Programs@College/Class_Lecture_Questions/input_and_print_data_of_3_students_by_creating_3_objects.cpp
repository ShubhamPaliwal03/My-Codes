#include<iostream>
using namespace std;
class student
{
	int age,r_no;
//	char ph_no[10];
	typedef unsigned long long int ulli;
	ulli ph_no;
	
	public:
		void get()
		{
			cout<<"\nAge : ";
			cin>>age;
			cout<<"Roll number : ";
			cin>>r_no;
			cout<<"Phone number : ";
			cin>>ph_no;
//			cin.getline(ph_no,10);
		}
		void show()
		{
			cout<<"\nAge : "<<age<<endl;
			cout<<"Roll number : "<<r_no<<endl;
			cout<<"Phone number : "<<ph_no<<endl;
		}	
};

int main()
{
	student s1,s2,s3;
	
	printf("Enter the details of the students : \n");
	
	printf("\nStudent 1 : ");
	s1.get();
	
	printf("\nStudent 2 : ");
	s2.get();
	
	printf("\nStudent 3 : ");
	s3.get();
	
	printf("\nThe details of the students are : \n");
	
	printf("\nStudent 1 : ");
	s1.show();
	
	printf("\nStudent 2 : ");
	s2.show();
	
	printf("\nStudent 3 : ");
	s3.show();
	
	return 0;
}