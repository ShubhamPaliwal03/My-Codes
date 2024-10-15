#include <iostream>
using namespace std;
#include <string.h>
#include <cmath>
// we can also use math.h
#include <stdlib.h>

int main()
{	
	long int n,len=0,i,length,a,b,temp;
	// this can also work for int, long long int and other types of int
    
    cout<<endl<<"Enter a number : ";
    cin>>n;

	temp=n;
	while(temp!=0)
	{
		len++;
		temp=temp/10;
	}
	
	cout<<endl<<"The entered number is a "<<len<<" digit number"<<endl;
	
	length=len;
	
// below is the logic when the number is a 5 digit number 	
//	cout<<n%100000/10000<<" "<<n%10000/1000<<" "<<n%1000/100<<" "<<n%100/10<<" "<<n%10/1;

	cout<<endl<<"The number in the form of seperated indivisual digits is : ";
	
    for(i=1;i<=len;i++)
    {
    	a = pow(10,length);
    	b = pow(10,length-1);
    	
    	length--;
    	
        cout<<n%a/b<<" ";
    }

    return 0;
}