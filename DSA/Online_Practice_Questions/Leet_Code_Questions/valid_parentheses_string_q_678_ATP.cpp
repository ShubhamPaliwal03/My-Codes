#include<iostream>
#include<stack>
using namespace std;
class Solution {
public:
bool checkValidString(string s)
{
    stack<int> open,star;
    int length = s.length();
    int i;
    for(i=0;s[i]!='\0';i++)
    {
        /*Loop for parsing the entire string and processing the closing brackets*/
        if(s[i]=='(')
        {
            /*Push*/
            open.push(i);  
        }
        else if(s[i]=='*')
        {
            /*Push*/
            star.push(i);
        }
        else /*if(s[i]==')')*/
        {
            /*Balancing the closing brackets by popping the opening brackets present */
            if(!open.empty())
            {
                /*Pop*/
                open.pop();
            }

            /*If opening brackets are finished,balancing the closing brackets
            by popping the stars by considering the stars as closing
            brackets*/
            else if(!star.empty())
            {
                /*Pop*/
                star.pop();
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
        if(!open.empty()) /*If there are still some opening brackets present in the stack*/
        {   
            /*If stars are not available, then we won't be able to pop opening brackets*/
            /*And we already checked for closing brackets above and if they
            were present, we popped the opening brackets*/
            if(star.empty())            
            {
                return false;
            }

            /*If star is present to the right side of the opening
            bracket */ 
            /*ie., (* ,so the star can be converted into ')' and we get () */
            /*Hence,we pop both '(' and '*' */
            else if(open.top() < star.top())
            {
                /*Popping '(' */
                open.pop();
        
                /*Popping '*' */
                star.pop();
            }
            
            /*If star is present to the left side of the opening
            bracket */ 
            /*ie., *( ,so even if the star can be converted into ')' , we get )( */ 
            /*Hence,we can't pop them and therefore, we return false */
            else/* if(open.top() > star.top()) */
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
};
int main()
{
	Solution s1;
	char s[100];
    cout<<"Enter an expression : ";
    cin.getline(s,100);
	if(s1.checkValidString(s))
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
	return 0;
}