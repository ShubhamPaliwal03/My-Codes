#include<iostream>
using namespace std;

int indexOfSubstring(char[],char[]);

int main()
{
	int index;
	
	char str[100],substr[100];
	
	cout<<"Enter the string : ";
	cin.getline(str,99);
	
	cout<<endl<<"Enter the substring which you want to search in the entered string : ";
	cin.getline(substr,99);
	
	index=indexOfSubstring(str,substr);
	
	if(index==-1)
	{
		cout<<endl<<"Substring <"<<substr<<"> Not Found in the entered string <"<<str<<">";
	}
	else
	{
		cout<<endl<<"Substring <"<<substr<<"> Found in the entered string <"<<str<<"> at index number "<<index;
	}
}

int indexOfSubstring(char str[],char substr[])
{
	int i,j,k,len;
	
	for(i=0;substr[i]!='\0';i++);
	len=i;
	
	for(i=0;str[i+len-1];i++)
	{
		k=i;
		
		for(j=0;j<=len-1;j++)
		{
			if(str[k]!=substr[j])
			{
				break;
			}
			
			k++;
		}
		
		if(j==len)
		{
			return i;
		}
	}
	
	return -1;
}