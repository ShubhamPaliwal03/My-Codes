#include<iostream>
using namespace std;

int main()
{
	int n;
	
	cout<<"Enter a number : ";
	cin>>n;
	
	if(n%2==0)
		goto even;
	else
		goto odd;
		
	even:
		cout<<endl<<"The number entered is Even";
		return 0;// to prevent the odd part from running in normal flow after this part, when the number is even
		// because whenever return is executed, the control goes out of the function (here,the function is main, so the program will be terminated)
	odd:
		cout<<endl<<"The number entered is Odd";			
	
	return 0;
}