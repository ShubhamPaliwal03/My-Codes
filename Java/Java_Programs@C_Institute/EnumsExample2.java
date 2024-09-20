enum Car
{
	lamborghini(900), tata(2), audi(50), fiat(15), honda(12);

	private int price;

	Car(int p)
	{
		price = p;
	}

	int getPrice()
	{
		return price;
	}
}

class EnumsExample2
{
	public static void main(String[] args)
	{
		System.out.println("All car prices:\n");

		for(Car c : Car.values())
		{
			System.out.println("Cost of "+c+" \t\t: $"+c.getPrice()+"K");
		}
	}
}