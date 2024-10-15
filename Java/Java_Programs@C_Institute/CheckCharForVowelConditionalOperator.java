import java.util.Scanner;

class CheckCharForVowelConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		String result;
		char ch;
		boolean condition;

		System.out.print("Enter a character : ");
		ch = kb.next().charAt(0);

		condition = ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';

		result = condition ? "Charcter entered is a Vowel" : "Character entered is Not a Vowel"; // the condition can be put directly as well

		System.out.println(result);
	}
}