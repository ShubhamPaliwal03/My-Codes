/*WAP to input a character and print whether is it :
	
	1)Digit
	2)Small case english alphabet
		i)Consonant
		ii)Vowel
	3)Capital case english alphabet
		i)Consonant
		ii)Vowel
	4)Symbol or any other language alphabet	 
*/

import java.util.Scanner;

class NestedIfElseCheckInputCharacterForDigCaseSymbol
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a character : ");
		char ch = kb.next().charAt(0);
		String result;
		boolean condition = ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';

		if(ch>=48 && ch<=57)
		{
			result="Digit";
		}
		else if(ch>=97 && ch<=122)
		{
			if(condition)
			{
				result="Small case english alphabet, a Vowel";
			}
			else
			{
				result="Small case english alphabet, a Consonant";
			}	
		}
		else if(ch>=65 && ch<=92)
		{
			if(condition)
			{
				result="Capital case english alphabet, a Vowel";
			}
			else
			{
				result="Capital case english alphabet, a Consonant";
			}
		}
		else
		{
			result="Symbol or any other language alphabet";
		}

		System.out.println("\nYou have entered "+ch+" and it is a "+result);
	}	
}