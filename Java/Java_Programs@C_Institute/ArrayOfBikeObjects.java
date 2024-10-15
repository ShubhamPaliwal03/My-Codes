class Bike
{
	private int price;

	private int average;

	private String company_name;

	public Bike(int price, int average, String company_name)
	{
		this.price = price;

		this.average = average;

		this.company_name = company_name;
	}

	public void printDetails()
	{
		System.out.println("\nThe details of the bike are :");

		System.out.print("\n..............................");

		System.out.print("\nPrice : "+price);

		System.out.print("\nAverage : "+average);

		System.out.print("\nCompany Name : "+company_name);
	}
}

class Main
{
	public static void main(String args[])
	{
		
	}
}