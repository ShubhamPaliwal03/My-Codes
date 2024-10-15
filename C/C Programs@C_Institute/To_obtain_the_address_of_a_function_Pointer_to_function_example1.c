#include<stdio.h>
void display();
int main()
{
	printf("Address of the display() function is %u",display);
	return 0;
}
void display()
{
	printf("Hello from display :)");
}
//to obtain the address of a function,we just write the function name,without parenthesis
