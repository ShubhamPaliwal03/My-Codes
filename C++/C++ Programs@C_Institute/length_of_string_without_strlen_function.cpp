#include<iostream>
using namespace std;
int main()
{
	char str[100];int i,count=0;
	cout<<"Enter a string : ";
	cin.getline(str,99);
	for(i=0;str[i]!='\0';i++);
	cout<<"The length of the entered string '"<<str<<"' is "<<i;
	return 0;
}
