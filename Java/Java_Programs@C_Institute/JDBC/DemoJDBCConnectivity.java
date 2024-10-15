import java.sql.*;

class DemoJDBCConnectivity
{
	public static void main(String args[])
	{
		// create a connection reference

		Connection connection = null;

		try
		{
			// load drivers

			Class.forName("com.mysql.jdbc.Driver");

			// get connection

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root" ,"");

			// school is the database, root is the name of the database user, default password for root is empty

			// create statement object

			Statement statement;

			statement = connection.createStatement();

			// create result set

			ResultSet resultSet;

			// call executeQuery() method to run the select statement

			resultSet = statement.executeQuery("select * from student ;");

			int roll_number;

			String name;

			int age;

			System.out.println("\nThe data of the table 'student' is as follows :\n");

			// fetch data from ResultSet

			while(resultSet.next())
			{
				// fetch value from roll

				roll_number = resultSet.getInt("roll");

				name = resultSet.getString("name");

				age = resultSet.getInt("age");

				System.out.println(roll_number+"\t"+name+"\t\t"+age);
			}

			resultSet.close();
			statement.close();
			connection.close();
		}

		catch(Exception exception)
		{
			System.out.println(exception);
		}

	} // function ends 

} // class ends