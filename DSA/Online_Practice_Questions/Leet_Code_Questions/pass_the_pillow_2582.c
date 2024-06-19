#include<stdio.h>
int main()
{
    int n=18,time=38,i,dir,index;

    i=1,index=1;
    while(i<=time)
    {
        if(i<n)/*when i is positive*/
        {
            dir=1;/*then, direction is forward*/
        }
        else/*when i is negative*/
        {
            dir=-1;/*then, direction is reverse*/
        }

        if(dir==1)/*we will increase the index as the pillow is being passed in the forward direction*/
        {
            index++;
        }
        else/*we will decrease the index as the pillow is being passed in reverse direction*/
        {
            index--;
        }
        
        i++;
    }
    
    printf("%d",index);
    
    return 0;
}