import java.sql.*;
import java.util.Scanner;

class InsertUserInputDataIntoDatabase
{
	public static void main(String agrs[])
	{
		// create an object kb of Scanner class to input the details to be inserted

		Scanner kb = new Scanner(System.in);

		// input the insertion details

		System.out.println("\nEnter the following details of the student to be added to the 'student' table of the 'college' database :");

		System.out.print("\nRoll Number : ");

		long roll = kb.nextLong();

		kb.nextLine(); // to prevent input buffer error

		System.out.print("\nFirst name : ");

		String fname = kb.nextLine();

		System.out.print("\nLast name : ");

		String lname = kb.nextLine();

		System.out.print("\nCourse name : ");

		String course = kb.nextLine();

		System.out.print("\nEmail ID : ");		

		String email = kb.next();

		System.out.print("\nMobile number (10-digit) : ");		

		long mobile_no = kb.nextLong();

		kb.close();

		String query = "INSERT INTO STUDENT VALUES ("+roll+",'"+fname+"','"+lname+"','"+course+"','"+email+"',"+mobile_no+")";

		// create a connection reference

		Connection connection = null;

		try
		{
			// load drivers

			Class.forName("com.mysql.jdbc.Driver");

			// get connection

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");

			//college is the database, root is the name of the database user, defualt password for root is empty

			// create statement object

			Statement statement;

			statement = connection.createStatement();

			// call executeUpdate() method to run the insert statement

			int n = statement.executeUpdate(query);

			if(n!=0)
			{
				System.out.println("\nRecord added successfully...");
			}
			else
			{
				System.out.println("\nSomething went wrong!");
			}

			statement.close();

			connection.close();
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}