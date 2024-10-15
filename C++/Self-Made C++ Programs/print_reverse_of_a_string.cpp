#include<iostream>
using namespace std;

int main()
{
    char str[100];
    int i,len=0;

    cout<<"Enter the string you want to reverse : ";
    cin.getline(str,99);

    i=0;
    while(str[i]!='\0')
    {
        i++;
    }
    len=i;

    cout<<endl<<"The Reversed string is : ";

    for(i=len-1;i>=0;i--)
    {
        cout<<str[i];
    }

    return 0;


}