#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    int num=58,i,j=0,r,d;

    char *res = (char*) malloc (sizeof(char)*1024);
    
    r=num/1000;
    d=num%1000;
    for(i=0;i<r;i++)
    {
        if(j==0)
            strcpy(res,"M");
    	else	
            strcat(res,"M");     
        j++;	
    }
    r=d/900;
    d=d%900;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"CM");
    	else	
        	strcat(res,"CM");	
        j++;	
    }	
    r=d/500;
    d=d%500;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"D");
    	else	
        	strcat(res,"D");
        j++;	
    }
    r=d/400;
    d=d%400;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"CD");
    	else	
        	strcat(res,"CD");
        j++;	
    }	
    r=d/100;
    d=d%100;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"C");
    	else	
        	strcat(res,"C");
        j++;	
    }
    r=d/90;
    d=d%90;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"XC");
    	else	
        	strcat(res,"XC");
		j++;	
    }
    r=d/50;
    d=d%50;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"L");
    	else	
        	strcat(res,"L");
        j++;	
    }
    r=d/40;
    d=d%40;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"XL");
    	else	
        	strcat(res,"XL");
		j++;	
    }
    r=d/10;
    d=d%10;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"X");
    	else	
        	strcat(res,"X");
        j++;	
    }
    r=d/9;
    d=d%9;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"IX");
    	else	
        	strcat(res,"IX");
		j++;		
    }
    r=d/5;
    d=d%5;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"V");
    	else	
        	strcat(res,"V");
        j++;	
    }
    r=d/4;
    d=d%4;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"IV");
    	else	
        	strcat(res,"IV");
        j++;	
    }
    r=d/1;
    d=d%1;
    for(i=0;i<r;i++)
    {
    	if(j==0)
    		strcpy(res,"I");
    	else	
        	strcat(res,"I");
        j++;	
    }
    
    printf("%s",res);
    
    return 0;
}