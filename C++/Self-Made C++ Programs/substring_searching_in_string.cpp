#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char str[500],substr[500];

    cout<<"Enter the String : ";
    cin.getline(str,500);

    cout<<endl<<"Enter the Substring : ";
    cin.getline(substr,500);

    int i,j,count=0,len=strlen(substr);

    i=0;
    while(str[i]!='\0')
    {
        j=0;
        while(substr[j]!='\0')
        {
            if(str[i]==substr[j])
            {
                i++;
                j++;
                count++;
                if(count==len)
                {
                    break;
                }
            }
            else
            {
                count=0;
                while(str[i]!=' ')
                {
                    i++;
                }
                i++;
                break;
            }
        }
        if(count==len)
       {
            break;
       }
    }

    

    if(count==len)
    {
        cout<<endl<<"Substring Found!";
    }
    else
    {
        cout<<endl<<"Substring Not Found!";
    }

    return 0;

}