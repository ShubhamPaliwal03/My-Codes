#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i, j;
    
    scanf("%d", &num);
    
    arr = (int*) malloc(num * sizeof(int));
    
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }

    /* Logic to reverse the array :- */

    //We swap the nth first and nth last values using the two pointer approach
    //i and j are two pointers here, one moves forward and the other one moves backwards, 
    //we stop where they meet, so we can either use the condition i<j or i!=j in the loop

    /* 
    * is used for dereferencing, to work with the element of the array
    arr contains the base address of the array, adding the value of index number to it, 
    results in the address of the element at that particular index number, 
    and using * with the array address derefences it, enabling us accessing it's value 
    */

    for(i=0,j=num-1;i<j;i++,j--)
    {
        *(arr+i) = *(arr+i) + *(arr+j);
        *(arr+j) = *(arr+i) - *(arr+j);
        *(arr+i) = *(arr+i) - *(arr+j);
    }

    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
        
    return 0;
}
