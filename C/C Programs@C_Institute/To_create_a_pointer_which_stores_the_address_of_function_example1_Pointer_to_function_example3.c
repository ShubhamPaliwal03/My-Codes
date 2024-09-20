#include<stdio.h>
void display();
int main()
{
	void (*p)();
	p=display;
	(*p)();
	return 0;
}
void display()
{
	printf("Hello from display");
}
