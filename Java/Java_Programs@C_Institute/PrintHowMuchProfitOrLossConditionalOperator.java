import java.util.Scanner;

class PrintHowMuchProfitOrLossConditionalOperator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		float sales_amt,purchase_amt,profit_amt,loss_amt;
		String result;

		System.out.print("Enter the sales amount : ");
		sales_amt = kb.nextFloat();
		System.out.println();

		System.out.print("Enter the purchase amount : ");
		purchase_amt = kb.nextFloat();
		System.out.println();

		result = sales_amt>purchase_amt ? "Profit of : "+(sales_amt-purchase_amt)+" Rs" : "Loss of : "+(purchase_amt-sales_amt)+" Rs";

		System.out.println(result);
	}
}