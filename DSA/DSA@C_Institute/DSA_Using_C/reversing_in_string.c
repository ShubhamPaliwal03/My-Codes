#include<stdio.h>

int main()
{
    char str[100],i,len,j;

    printf("Enter the string you want to reverse : ");
    scanf("%[^\n]s",str);

    // Obtaining the length of the string
    for(i=0;str[i]!='\0';i++);
    len=i;

    // Logic for Reversing the string
    for(i=0,j=len-1;i<j;i++,j--)
    {
        str[i]=str[i]+str[j];
        str[j]=str[i]-str[j];
        str[i]=str[i]-str[j];
    }

    printf("The Reversed string is : %s",str);

    return 0;
}