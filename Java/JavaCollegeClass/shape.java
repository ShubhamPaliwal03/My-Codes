import java.util.Scanner;

interface shape
{
	double pi = 3.14;
	double calc_vol();
}

class sphere implements shape
{
	private double radius;
	private double volume;

	public void setDetails()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("\nEnter the Details of the Sphere : ");

		System.out.print("\nRadius : ");

		radius = kb.nextDouble();					
	}	

	public double calc_vol()
	{
		volume = 1.33 * pi * radius * radius * radius ;	

		return volume;	
	}
}

class cone implements shape
{
	private double radius;
	private double height;
	private double volume;

	public void setDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("\nEnter the Details of the Sphere : ");

		System.out.print("\nRadius : ");
		
		radius = kb.nextDouble();	

		System.out.print("\nHeight : ");

		height = kb.nextDouble();	
	}	

	public double calc_vol()
	{
		volume = 0.333 * pi * radius * radius * height ;
		
		return volume;
	}	
}

class Main
{
	public static void main(String args[])
	{
		sphere sph1 = new sphere();

		sph1.setDetails();

		System.out.println("\nThe Volume of the Sphere is : "+sph1.calc_vol());

		cone cn1 = new cone();

		cn1.setDetails();

		System.out.println("\nThe Volume of the Cone is : "+cn1.calc_vol());	
	}
}
