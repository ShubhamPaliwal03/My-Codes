#include<iostream>
using namespace std;

bool checkValidString(char * s)
{
    int i,o_top=-1,s_top=-1;
    char open[1000],star[1000];

    for(i=0;s[i]!='\0';i++)
    {
        /*Loop for parsing the entire string and processing the closing brackets*/
        if(s[i]=='(')
        {
            /*Push*/
            o_top++;
            open[o_top]=open[i];   
        }
        else if(s[i]=='*')
        {
            /*Push*/
            s_top++;
            star[s_top]=star[i];
        }
        else /*if(s[i]==')')*/
        {
            /*Balancing the closing brackets by popping the opening brackets present */
            if(o_top!=-1)
            {
                /*Pop*/
                open[i]=open[o_top];
                open[o_top]=0;
                o_top--;
            }

            /*If opening brackets are finished,balancing the closing brackets
            by popping the stars by considering the stars as closing
            brackets*/
            else if(s_top!=-1)
            {
                /*Pop*/
                star[i]=star[s_top];
                star[s_top]=0;
                s_top--;
            }

            /*If the stars are also finished,then we can't balance the opening brackets
            hence, we return false */
            else
            {
                return false;
            }
        }
    }
    /*Now, again parsing from the top of the stack and processing leftover opening brackets 
    (if any)*/
    for(i=0;s[i]!='\0';i++)
    {
        if(o_top!=-1) /*If there are still some opening brackets present in the stack*/
        {   
            /*If stars are not available, then we won't be able to pop opening brackets*/
            /*And we already checked for closing brackets above and if they
            were present, we popped the opening brackets*/
            if(s_top==-1)            
            {
                return false;
            }

            /*If star is present to the right side of the opening
            bracket */ 
            /*ie., (* ,so the star can be converted into ')' and we get () */
            /*Hence,we pop both '(' and '*' */
            else if(o_top<s_top)
            {
                /*Popping '(' */
                open[i]=open[o_top];
                open[o_top]=0;
                o_top--;
        
                /*Popping '*' */
                star[i]=star[s_top];
                star[s_top]=0;
                s_top--;
            }
            
            /*If star is present to the left side of the opening
            bracket */ 
            /*ie., *( ,so even if the star can be converted into ')' , we get )( */ 
            /*Hence,we can't pop them and therefore, we return false */
            else/* if(o_top>s_top) */
            {
                return false;
            }
        }

    }
    /*If there are no opening brackets left,then opening and closing brackets are
    already balanced,hence we return true, no matter some stars are still left or
    the stars have been exhausted */

    return true;    
}
int main()
{
	char s[100];
    cout<<"Enter an expression : ";
    cin.getline(s,100);
	if(checkValidString(s))
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
	return 0;
}