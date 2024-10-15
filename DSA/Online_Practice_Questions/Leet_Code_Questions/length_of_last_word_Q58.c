#include<stdio.h>
#include<string.h>

int main()
{
	char *s = "aba";
	
    int i,len=0,last_word_len=0,diff=0;
    
    for(i=0;s[i]!='\0';i++)
	{
		len++;
	}
	
	printf("\nlen is %d",len);

    i=len-1;
    while(!(s[i]>=65 && s[i]<=90 || s[i]>=97 && s[i]<=127))
    {
    	i--;
    	diff++;
	}

	printf("\ndiff is %d",diff);

	len=len-diff;
	printf("\nlen is %d",len);
	
    i=len-1;
    while(s[i]!=' ')
    {
        if(i<0)
        	break;
        i--;
        last_word_len++;
        
    }
    
    printf("\nThe length of the last word is : %d",last_word_len);
    
    return 0;
}