import java.util.Scanner;

class Person
{
	private String name;

	private int age;

	public void inputPersonalDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("\nEnter Personal Details : ");

		System.out.print("\nName : ");

		name = kb.nextLine();

		System.out.print("\nAge : ");

		age = kb.nextInt();

		// kb.close();
	}

	public void printPersonalDetails()
	{
		System.out.println("\nThe Personal Details are : ");

		System.out.println("\nName : "+name);

		System.out.println("\nAge : "+age);
	}
}

class Employee extends Person
{
	private String cname;

	private int salary;

	public void inputProfessionalDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("\nEnter Professional Details : ");

		System.out.print("\nCompany Name : ");

		cname = kb.nextLine();

		System.out.print("\nSalary : ");

		salary = kb.nextInt();

		// kb.close();
	}

	public void printProfessionalDetails()
	{
		System.out.println("\nThe Professional Details are : ");

		System.out.println("\nCompany Name : "+cname);

		System.out.println("\nSalary : "+salary);
	}
}

class SoftwareEngineer extends Employee
{
	private String type;

	private String technology;

	public void inputTechnologicalDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("\nEnter Technological Details : ");

		System.out.print("\nType : ");

		type = kb.nextLine();

		System.out.print("\nTechnology : ");

		technology = kb.nextLine();

		// kb.close();
	}

	public void printTechnologicalDetails()
	{
		System.out.println("\nThe Technological Details are : ");

		System.out.println("\nType : "+type);

		System.out.println("\nTechnology : "+technology);
	}
}

class ImplementMultilevelInheritance
{
	public static void main(String args[])
	{
		SoftwareEngineer swe = new SoftwareEngineer();

		swe.inputPersonalDetails();

		swe.inputProfessionalDetails();

		swe.inputTechnologicalDetails();

		swe.printPersonalDetails();

		swe.printProfessionalDetails();

		swe.printTechnologicalDetails();
	}
}