import java.util.Scanner;

class BillingProgram
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		double coffee_price,pasta_price,gross_bill,discount_per,discount_amt,bill_after,service_charge_per,service_charge,gst_amt,net_bill;
		int coffee_qty,pasta_qty;

		System.out.print("What is the rate of one cup of coffee : ");
		coffee_price = kb.nextDouble();
		System.out.print("How many cups were ordered : ");
		coffee_qty = kb.nextInt();
		System.out.println();

		System.out.print("What is the rate of one plate of pasta : ");
		pasta_price = kb.nextDouble();
		System.out.print("How many plates were ordered : ");
		pasta_qty = kb.nextInt();
		System.out.println();

		gross_bill = (coffee_price*(double)coffee_qty)+(pasta_price*(double)pasta_qty);
		System.out.println("Gross Bill(Without Discount, GST and Other Charges) : "+gross_bill+" Rs");
		System.out.println();

		System.out.print("Discount % : ");
		discount_per = kb.nextDouble();
		System.out.println();

		discount_amt = (discount_per/100)*gross_bill;
		System.out.println("Discount amount : "+discount_amt+" Rs");
		System.out.println();

		bill_after = (gross_bill-discount_amt);
		// System.out.println("Bill after (20% Discount) = "+bill_after+" Rs ("+gross_bill+" Rs - "+discount_amt+" Rs"+")");
		System.out.printf("Bill after (20% Discount) = %.2lf Rs (%.2lf Rs - %.2lf Rs)",bill_after,gross_bill,discount_amt);
		System.out.println();

		gst_amt = (5.0/100)*bill_after;// writing 5 will lead to gst_amt being equal to 0 always, because of truncation of real value to an int value
		System.out.println("GST @ 5% = "+gst_amt+" Rs");
		System.out.println();

		System.out.print("Service charge % : ");
		service_charge_per = kb.nextDouble();
		System.out.println();

		service_charge = (service_charge_per/100)*bill_after;
		System.out.println("Service charge = "+service_charge+" Rs");
		System.out.println();

		net_bill = (gross_bill-discount_amt+service_charge+gst_amt);
		System.out.println("Net Bill (Gross Bill - Discount Amount + Service Charge + GST Amount = "+net_bill+" Rs ("+gross_bill+" Rs - "+discount_amt+" Rs + "+service_charge+" Rs + "+gst_amt+" Rs"+" )");
	}
}