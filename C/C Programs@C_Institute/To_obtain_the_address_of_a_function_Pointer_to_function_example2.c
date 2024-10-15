#include<stdio.h>
void display();
int main()
{
	printf("Address of function is %u",&display);
	return 0;
}
void display()
{
	printf("Hello from display");
}
