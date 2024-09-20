#include <stdio.h>
#include <string.h>

int main()
{
    char haystack[100] = "leetcode", needle[100] = "leeto";
    int hlen, nlen, eq = 0, i, j, occ[100];

    hlen = strlen(haystack);
    nlen = strlen(needle);

    if (strcmp(needle, "") == 0)
        printf("\n%s is a part of %s and first occours at %d index",needle,haystack,0);

    i = 0, j = 0;
    while (i < hlen && j < nlen)
    {
        if (haystack[i] == needle[j])
        {
            if (j == 0)
                occ[eq] = i;
            eq++;
            j++;
        }
        else
        {
            j = 0;
            if (eq > 0)
            {
                i = occ[0];
                eq = 0;
            }
        }
        i++;
    }

    if (eq == nlen)
    {
        printf("\n%s is a part of %s and first occours at %d index",needle,haystack,occ[0]);
    }
    else
    {
    	printf("\n%s is a not a part of %s",needle,haystack);
	}
	
	return 0;
}