import java.util.*;

class Employee
{
	private String name;

	private int age;

	private int salary;

	Employee(String name, int age, int salary)
	{
		this.name = name;

		this.age = age;

		this.salary = salary;
	}

	public String toString()
	{
		return "\n\nName : "+name+" Age : "+age+" Salary : "+salary+"\n";
	}
}

class UseTreeMapToStoreEmployeeObjectsInNaturalOrder
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		// Comparator employeeComparator

		TreeMap<Integer, Employee> employeeMap = new TreeMap<>();

		System.out.print("\nHow many employees do you want to add ? : ");

		int n = kb.nextInt();

		for(int i = 1; i <= n; i++)
		{
			System.out.print("\nEnter employee details (Name, Age, Salary) in space-seperated manner : ");

			employeeMap.put(1, new Employee(kb.nextLine(), kb.nextInt(), kb.nextInt()));

			System.out.print("\nEmployee "+i+" successfully added into the records...");
		}

		for(Integer key : employeeMap.keySet())
		{
			System.out.print(employeeMap.get(key));
		}
	}
}