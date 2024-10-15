import java.util.*;

class Employee
{
	private int age;

	private int salary;

	private String name;

	// public Employee(String name, int age, int salary)
	// {
	// 	this.name = name;

	// 	this.age = age;

	// 	this.salary = salary;
	// }

	public void inputEmployeeDetails()
	{
		Scanner kb = new Scanner(System.in);

		System.out.println("\nEnter the Details of the Employee :");

		System.out.print("\nName   : ");

		name = kb.nextLine();

		System.out.print("\nAge    : ");

		age = kb.nextInt();

		System.out.print("\nSalary : ");

		salary = kb.nextInt();
	}

	public String toString()
	{
		return "\nName   : "+name+"\nAge    : "+age+"\nSalary : "+salary+"\n";
	}

	public int getAge()
	{
		return age;
	}
}

class Main
{
	public static void insertInSortedOrder(Employee e, LinkedList<Employee> employeeList)
	{
		// if the linked list is empty (when the first node is about to be added in the linked list)

		if(employeeList.size() == 0)
		{
			employeeList.add(e);
		}

		// if the age of current employee to be added is less than the head of the linked list,
		// then we add that node at the beginning of the current linked list, or make the current employee e, the head of the linked list

		else if(e.getAge() < employeeList.getFirst().getAge())
		{
			employeeList.offerFirst(e);
		}

		// if the age of current employee is greater than the head of the list, somewhere in the mid, and so is it's correct insertion position

		else
		{
			// Method-1

			// find the correct insert position, of the current node

			int i = 0;

			for(Employee emp : employeeList)
			{
				if(e.getAge() < emp.getAge())
				{
					break;
				}

				i++;
			}

			employeeList.add(i, e);

			// Method-2

			// find the correct insert position, of the current node

			// int i;

			// for(i = 0; i < employeeList.size() - 1; i++)
			// {
			// 	if(e.getAge() >= employeeList.get(i).getAge() && e.getAge() <= employeeList.get(i+1).getAge())
			// 	{
			// 		break;
			// 	}
			// }

			// employeeList.add(i+1, e);

			/* Below Code Does The Exact Same Work, But We Don't Need To Check */

			// if the age of current employee is greater than all the other employees currently present in the linked list

			// insertion at the last

			// if(i == employeeList.size()) 
			// {
			// 	employeeList.add(e);
			// }

			// if the age of the current employee is somewhere in the mid, and so is it's correct insertion position
			// also, the case when the age of current employee is greater than the first employee,
			// and currently there is only one node present in the linked list

			// insertion in middle

			// else
			// {
			// 	employeeList.add(i+1, e);
			// }
		}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		LinkedList<Employee> employeeList = new LinkedList<>();

		System.out.print("\nEnter the number of Employee objects you want to create : ");

		int n = kb.nextInt();

		// Employee[] employees = new Employee[n]; // there is no need to create an array ob objects

		for(int i = 0; i < n; i++)
		{
			// employees[i] = new Employee();

			// employees[i].inputEmployeeDetails();

			// insertInSortedOrder(employees[i], employeeList);

			Employee e = new Employee();

			e.inputEmployeeDetails();

			insertInSortedOrder(e, employeeList);

			// instead of inputEmployeeDetails() method, we can also create a parameterized constructor, and then take input like :-

			//	System.out.print("\nEnter the name, age, and salary of the Employee : ");

			// Employee e = new Employee(kb.next(), kb.nextInt(), kb.nextInt());
		}

		System.out.println("\nThe Details of the Employees, stored in sorted order are as follows :");

		for(Employee e : employeeList)
		{
			System.out.println(e.toString()); // or System.out.println(e); the print functions automatically call toString().
		}
	}
}