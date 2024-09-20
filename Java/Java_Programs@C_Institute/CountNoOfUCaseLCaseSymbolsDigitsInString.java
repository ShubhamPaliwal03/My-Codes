import java.util.Scanner;

class CountNoOfUCaseLCaseSymbolsDigitsInString
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nEnter a string : ");

		String str = kb.nextLine();

		int l_case_cnt = 0, u_case_cnt = 0, sym_cnt = 0, dig_cnt = 0;

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if(ch >= 'a' && ch <= 'z')
			{
				l_case_cnt++;
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				u_case_cnt++;
			}
			else if(ch >= '0' && ch <= '9')
			{
				dig_cnt++;
			}
			else if(ch != ' ')
			{
				sym_cnt++;
			}
		}

		System.out.println("\nThe String '"+str+"' has :-\n");
		System.out.println(l_case_cnt+" lower case alphabets");
		System.out.println(u_case_cnt+" upper case alphabets");
		System.out.println(sym_cnt+" symbols");
		System.out.println(dig_cnt+" digits");
	}
}