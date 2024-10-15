// C implementation of digital clock
#include <stdio.h>
#include <time.h>
#include<stdlib.h>

// driver code
int main()
{

	do
	{	
		system("cls");

		time_t s, val = 1;
		struct tm* current_time;

		// time in seconds
		s = time(NULL);

		// to get current time
		current_time = localtime(&s);

		// print time in minutes,
		// hours and seconds
		printf("The Current Local Time is : %02d:%02d:%02d",current_time->tm_hour,current_time->tm_min,current_time->tm_sec);

	}while(1);
	return 0;
}
