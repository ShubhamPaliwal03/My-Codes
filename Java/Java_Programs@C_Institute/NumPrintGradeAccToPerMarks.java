import java.util.Scanner;

class NumPrintGradeAccToPerMarks
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		double per_marks;

		System.out.print("Enter the percentage marks obtained by the student : ");
		per_marks = kb.nextDouble();
		System.out.println();

		// System.out.println(per_marks>=78?per_marks>=85?per_marks>=90?"Grade S+":"Grade S":"Grade A":per_marks>=50?"Grade B":"Grade F")


		// System.out.println
		// (
		// 	per_marks>100 || per_marks<0 ?
		// 								"Invalid percentage!" :
		// 														per_marks>=90 ?
		// 															"Grade S+" :
		// 																per_marks>=85 ?
		// 																	"Grade S" :
		// 																		per_marks>=70 ?
		// 																			"Grade A" :
		// 																				per_marks>=50 ?
		// 																					"Grade B" :
		// 																							"Grade F"
		// );

		// System.out.println(per_marks>100 || per_marks<0 ? "Invalid Percentage!" : per_marks>=90?"Grade S+":per_marks>=85?"Grade S":per_marks>=70?"Grade A":per_marks>=50?"Grade B":"Grade F");

		System.out.println
		(
			per_marks>100 ?
							"Percentage marks can't be greater than 100" :
																		per_marks>=90 ?
																			"Grade S+" :
																				per_marks>=85 ?
																					"Grade S" :
																						per_marks>=70 ?
																							"Grade A" :
																								per_marks>=50 ?
																									"Grade B" :
																										per_marks>=0 ?
																											"Grade F":
																												"Percentage marks can't be less than 0"
		);

	}
}