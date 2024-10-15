#include<iostream>
using namespace std;

int main()
{
	char base[100],str[100],i,b_len,s_len,j;
	int count=0;
	
	cout<<"Enter the base string : ";
	cin.getline(base,99);
	
	cout<<endl<<"Enter the string which you want to check for being generated using the letters of the base string : ";
	cin.getline(str,99);
	
	for(i=0;str[i]!='\0';i++);
	s_len=i;
	
	for(i=0;base[i]!='\0';i++);
	b_len=i;
	
	for(i=0;i<s_len;i++)
	{
		for(j=0;j<b_len;j++)
		{
			if(str[i]==base[j])
			{
				count++;
				break;
			}
		}
	}
	
	if(count==s_len)
	{
		cout<<endl<<"The string <"<<str<<"> can be generated using the letters of the base string <"<<base<<">";
	}
	else
	{
		cout<<endl<<"The string <"<<str<<"> cannot be generated using the letters of the base string <"<<base<<">";
	}
	
	cout<<endl<<"The numbers of matching letters are : "<<count;
	
	return 0;
}