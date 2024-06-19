class Light
{
	// fields

	private int noOfWatts; // wattage

	private boolean indicator; // on or off

	private String location; // placement of light bulb

	// static variables

	private static int counter; // no. of lights created

	// parameterized constructor

	Light(int noOfWatts, boolean indicator, String location)
	{
		this.noOfWatts = noOfWatts;

		this.indicator = indicator;

		this.location = location;

		++counter; // increment counter
	}

	public void writeCount()
	{
		System.out.println("Total number of lights "+counter); // non-static methods can access static variables


	}
}