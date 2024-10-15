#include<iostream>
using namespace std;
int main()
{
    int n,d1,d2,d4,d5;

    /*taking input of the number*/
     cout<<"Enter the 5-digit integer you want to check for being a palindrome : ";
     cin>>n;

    cout<<endl<<"The entered number "<<n<<" is : "<<endl;

    /*storing all the 4 necessary digits of the number which need to be checked to determine is it a palindrome or not*/
    d5=n%10;
    d4=(n%100)/10;
    d2=(n%10000)/1000;
    d1=n/10000;

    /*checking for the number being a palindrome*/
    if(d5==d1 && d4==d2)
    {
		cout<<"A Palindrome";
	}
    else
    {
        cout<<"Not a palindrome";
    }

    return 0;

}