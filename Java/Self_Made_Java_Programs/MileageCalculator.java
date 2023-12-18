import java.util.*;

class MileageCalculator
{
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nWelcome to Mileage Calculator !");

		System.out.print("\n-------------------------------");

		System.out.print("\n\nPlease select the desired method of calculation (1/2) : ");

		System.out.print("\n-------------------------------------------------------");

		System.out.println("\n\n1. Using previous and current odometer readings\n2. Using current trip reading");

		System.out.print("\n-------------------------------------------------------\n");

		System.out.print("\nYour Response : ");

		int choice = kb.nextInt();

		System.out.print("\n------------------------------------------------------------------------------------");

		float distance_driven = 0;

		switch(choice)
		{
			case 1:

				System.out.print("\nEnter the odometer reading after fully refueling the tank last time (in Kms) : ");

				float prev_odo_reading = kb.nextFloat();

				System.out.print("\nEnter the odometer reading before fully refueling the tank current time (in Kms) : ");

				float curr_odo_reading = kb.nextFloat();

				distance_driven = curr_odo_reading - prev_odo_reading;

				break;

			case 2:

				System.out.print("\n\nEnter the current trip reading (in Kms) : ");

				distance_driven = kb.nextFloat();

				break;

			default:

				System.out.print("\nPlease enter a valid choice (1/2) : ");

				System.exit(0); // present in java.lang.System class, it is used to exit the program at any point by terminating the running JVM.
		}

		System.out.print("\nEnter the amount of fuel filled (in Ltrs) currently, after driving "+distance_driven+" Kms : ");

		float fuel_filled = kb.nextFloat();

		// // create a currency for IN locale

		// Locale locale = Locale.IND;

		// Currency currency = Currency.getInstance(locale);

		// // printing the symbol of the currency

		// System.out.print("\nEnter the current price of fuel per Litre (in "+currency.getSymbol(locale)+") : ");

		System.out.print("\nEnter the current price of fuel per Litre (in Rs.) : ");

		float price_per_litre = kb.nextFloat();

		kb.close();

		System.out.print("\n------------------------------------------------------------------------------------");

		float curr_mileage = distance_driven / fuel_filled;

		System.out.print("\nCurrent Mileage : "+curr_mileage+" Km per Ltr");

		System.out.print("\n------------------------------------------------------------------------------------");

		float curr_running_cost = (1 / curr_mileage) * price_per_litre;

		System.out.print("\nCurrent Running Cost : Rs. "+curr_running_cost+" per Km");

		System.out.print("\n------------------------------------------------------------------------------------");
	}
}