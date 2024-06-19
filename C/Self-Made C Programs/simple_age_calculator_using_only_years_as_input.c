#include<stdio.h>
int main()
{
    int year_of_birth,current_year,age;
    printf("Enter your year of birth:");
    scanf("%d",&year_of_birth);
    printf("Enter the current year:");
    scanf("%d",&current_year);
    age=(current_year)-(year_of_birth);
    if(age==1)
    printf("Your age is %d year",age);
    else
    printf("Your age is %d years",age);
    return 0;
}
