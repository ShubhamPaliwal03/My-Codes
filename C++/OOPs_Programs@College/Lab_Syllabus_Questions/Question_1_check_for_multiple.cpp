#include<iostream>
using namespace std;
int main()
{
    int a,b;

    cout<<"Enter the first integer : ";
    cin>>a;
    cout<<endl;

    cout<<"Enter the second integer : ";
    cin>>b;
    cout<<endl;

    /*Multiples in math are the numbers we get when we multiply a certain number by an integer.
    eg. -> Multiples of 5 are : 5,10,15,20,25,30,etc. */
    if(a%b==0)
    {
        cout<<a<<" is a multiple of "<<b;
    }
    else
    {
        cout<<a<<" is not a multiple of "<<b;
    }
    return 0;
}