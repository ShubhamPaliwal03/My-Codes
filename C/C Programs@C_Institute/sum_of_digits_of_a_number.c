#include <stdio.h>
int main()
{	
    int n;
    scanf("%d",&n);
	printf("%d",n%10/1 + n%100/10 + n%1000/100 + n%10000/1000 + n%100000/10000);
    return 0;
}
