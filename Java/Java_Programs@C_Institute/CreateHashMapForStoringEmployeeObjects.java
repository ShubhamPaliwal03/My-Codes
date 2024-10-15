import java.util.*;

class Employee
{
	private String name;

	private String company_name;

	private int age;

	private int salary;

	Employee(String name, String company_name, int age, int salary)
	{
		this.name = name;

		this.company_name = company_name;

		this.age = age;

		this.salary = salary;
	}

	public String toString()
	{
		return "[Name : "+name+", Company Name : "+company_name+", Age : "+age+", Salary : "+salary+"]";
	}
}

class CreateHashMapForStoringEmployeeObjects
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		HashMap<Integer, Employee> empMap = new HashMap<>();

		for(int i = 1; ; i++)
		{
			System.out.print("\nEnter the Details of the Employee "+i+" - Name, Company Name, Age, Salary : ");

			empMap.put(i, new Employee(kb.next(), kb.next(), kb.nextInt(), kb.nextInt()));

			System.out.print("\nPress 1 to Continue, Press any other numeric key to Exit : ");

			if(kb.nextInt() != 1)
			{
				break;
			}

			System.out.println("\n"+empMap);
		}	
	}
}