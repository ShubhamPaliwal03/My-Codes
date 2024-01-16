import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Main
{	
	private static String sql_password = "";

	private static String database_user = "root";

	private static String database_name = "";

	private static String table_name = "";

	private static Connection connection = null;

	private static Statement statement;

	public static void main(String[] args)
	{
		Main m = new Main();

		// create the main frame

		JFrame main_frame = new JFrame("Database Manager");

		main_frame.setSize(600, 600);

		main_frame.setLocationRelativeTo(null);

		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FlowLayout fl = new FlowLayout();

		main_frame.setLayout(fl);

		// create a panel

		JPanel panel1 = new JPanel();

		JLabel dbname_label = new JLabel("Database Name :");

		JTextField dbname_textfield = new JTextField(10);

		JTextField tbname_textfield = new JTextField(10);

		JLabel tablename_label = new JLabel("Table Name");

		JButton btn1 = new JButton("Get Records");

		// create the second frame, on which the records will be shown, and will be updated if prompted by the user

		JFrame records_frame = new JFrame("Records");

		records_frame.setSize(600, 600);

		records_frame.setLocationRelativeTo(null);

		JPanel panel2 = new JPanel();

		JLabel rno_label = new JLabel("Roll Number :");

		JTextField rno_textfield = new JTextField(10);

		JLabel firstname_label = new JLabel("First Name :");

		JTextField firstname_textfield = new JTextField(10);

		JLabel lastname_label = new JLabel("Last Name :");

		JTextField lastname_textfield = new JTextField(10);

		JLabel courseName_label = new JLabel("Course Name :");

		JTextField courseName_textfield = new JTextField(10);

		JLabel email_label = new JLabel("Email Address :");

		JTextField email_textfield = new JTextField(25);

		JLabel mobileNumber_label = new JLabel("Mobile Number :");

		JTextField mobileNumber_textfield = new JTextField(10);

		JButton add_btn = new JButton("Add New Record");

		JButton get_btn = new JButton("Get Record");

		JButton update_btn = new JButton("Update Record");

		// JDBC

		try
		{
			// load drivers

			Class.forName("com.mysql.jdbc.Driver");
		}	

		catch(Exception e)
		{
			System.out.println(e);
		}

		btn1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				database_name = dbname_textfield.getText();

				table_name = tbname_textfield.getText();

				boolean databaseExists = true;

				boolean tableExists = true;

				boolean dbServerActive = true;

				try
				{
					// get connection to the desired database

					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database_name, database_user, sql_password);

					// create statement object

					statement = connection.createStatement();
				}

				// if the database server is not active, then com.mysql.jdbc.CommunicationsException is thrown, nested java.net.ConnectException is thrown inside it

				catch(com.mysql.jdbc.CommunicationsException ce)
				{
					JOptionPane.showMessageDialog(main_frame, "Database Server Refused To Connect!\nPlease chech your database server status!");

					// if CommunicationsException exception occurs, it means that the server is not active.

					dbServerActive = false;
				}
				
				catch(Exception e)	
				{
					// if exception occurs, it means that the database does not exist.

					databaseExists = false;

					System.out.println(e);
				}

				try
				{
					// check if the desired table exists in the database, by running a select query

					ResultSet resultSet = statement.executeQuery("SELECT * FROM "+table_name); 

					// to check if there are any rows returned before
					// trying to access data

					// to check if there are any rows returned after executing this select query,
					// if such table does not exist, then the result set will be empty
					// if the table exists, then the result set will not be empty

					if(!resultSet.next()) // if the resultSet is not empty
					{
						tableExists = false;
					}
				}

				// if an exception occurs here, it means the table does not exist.

				catch(Exception e)
				{
					tableExists = false;
				}

				// show the records frame if the database and the table exists in the system, and the database server is active

				if(dbServerActive)
				{
					if(databaseExists)
					{
						if(tableExists)
						{
							// make the frame visible

							records_frame.setVisible(true);
						}
						else
						{
							System.out.println(databaseExists);

							JOptionPane.showMessageDialog(main_frame, "Table Not Found In Database!\nTable '"+table_name+"' Does Not Exist In The '"+database_name+"' Database!");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(main_frame, "Database Not Found!\nDatabase '"+database_name+"' Does Not Exist In The System!");
					}
				}
			}
		});

		get_btn.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
 				// get the primary key to run select query to fetch the records

				int roll_no = Integer.parseInt(rno_textfield.getText());

				try
				{
					// create result set

					ResultSet resultSet;

					// call the executeQuery() method to run the select statement

					resultSet = statement.executeQuery("select * from "+table_name+" where roll_number = '"+roll_no+"';");

					// fetch the data from resultSet and place them in their respective textfields

					// we will have to use next() method to move the cursor to the first row before trying to retrieve data
					// from the result set, also it's always a good practice to check if there are any rows returned before
					// trying to access data

					if(resultSet.next()) // if the resultSet is not empty
					{
						firstname_textfield.setText(resultSet.getString("first_name"));

						lastname_textfield.setText(resultSet.getString("last_name"));

						courseName_textfield.setText(resultSet.getString("course"));

						email_textfield.setText(resultSet.getString("email"));

						mobileNumber_textfield.setText(resultSet.getString("mobile_no"));

						JOptionPane.showMessageDialog(records_frame, "Record fetched successfully...");
					}	
					else // if the resultSet is empty
					{
						JOptionPane.showMessageDialog(records_frame, "No record with roll number '"+roll_no+"' found in the database!\nUse <Add New Record> option to add a new record...");
					}
				}
				
				catch(Exception e)	
				{
					System.out.println(e);
				}
			}
		});

		// the save button will save the record if the user entered a new primary key, so a new record will be added to the database.

		add_btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				// check if the primary key entered by the user is present in the database, if yes, then display a message
				// informing that the record already exists

				// get the primary key to run select query to fetch the records

				int roll_no = Integer.parseInt(rno_textfield.getText());

				try
				{
					ResultSet resultSetSelect = statement.executeQuery("SELECT roll_number from "+table_name+" where roll_number = "+roll_no);

					if(resultSetSelect.next()) // if the result set is not empty
					{
						// then it means that the record with the same primary key already exists in the database
						
						// so, we display a message to the user

						JOptionPane.showMessageDialog(records_frame, "Record with roll number '"+roll_no+"' already exists in the database!\nEither change the primary key (Roll Number) or use <Update New Record> option to update the existing record...");
					}
					else // if the result set is empty
					{
						// then it means that the record with the same primary key does not exist in the database
						// so we will execute a insert query to insert the record into the database

						String first_name = firstname_textfield.getText();

						String last_name = lastname_textfield.getText();

						String course_name = courseName_textfield.getText();

						String email_id = email_textfield.getText();

						String mobile_no = mobileNumber_textfield.getText();

						try
						{
							int rows_affected = statement.executeUpdate("INSERT INTO "+table_name+" VALUES ("+roll_no+",'"+first_name+"','"+last_name+"','"+course_name+"','"+email_id+"',"+mobile_no+")");
						}
						
						catch(Exception e)
						{
							System.out.println(e);
						}	

						JOptionPane.showMessageDialog(records_frame, "Record successfully added to the database...");
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}	
			}
		});

		rno_textfield.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent e)
			{	
				if(rno_textfield.getText().equals("* This is a required field."))
				{
					rno_textfield.setText("");

					// set the text color back to previous color (here, black)

					rno_textfield.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e)
			{
				if(rno_textfield.getText().equals(""))
				{
					rno_textfield.setText("* This is a required field.");

					// set the text color to red

					rno_textfield.setForeground(Color.RED);
				}
			}
		});

		firstname_textfield.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent e)
			{
				if(firstname_textfield.getText().equals("* This is a required field."))
				{
					firstname_textfield.setText("");

					// set the text color back to previous color (here, black)

					firstname_textfield.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e)
			{
				if(firstname_textfield.getText().equals(""))
				{
					firstname_textfield.setText("* This is a required field.");

					// set the text color to red

					firstname_textfield.setForeground(Color.RED);
				}
			}
		});

		lastname_textfield.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent e)
			{
				if(lastname_textfield.getText().equals("* This is a required field."))
				{
					lastname_textfield.setText("");

					// set the text color back to previous color (here, black)

					lastname_textfield.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e)
			{
				if(lastname_textfield.getText().equals(""))
				{
					lastname_textfield.setText("* This is a required field.");

					// set the text color to red

					lastname_textfield.setForeground(Color.RED);
				}
			}
		});

		courseName_textfield.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent e)
			{
				if(courseName_textfield.getText().equals("* This is a required field."))
				{
					courseName_textfield.setText("");

					// set the text color back to previous color (here, black)

					courseName_textfield.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e)
			{
				if(courseName_textfield.getText().equals(""))
				{
					courseName_textfield.setText("* This is a required field.");

					// set the text color to red

					courseName_textfield.setForeground(Color.RED);
				}
			}
		});

		email_textfield.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent e)
			{
				if(email_textfield.getText().equals("* This is a required field."))
				{
					email_textfield.setText("");

					// set the text color back to previous color (here, black)

					email_textfield.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e)
			{
				if(email_textfield.getText().equals(""))
				{
					email_textfield.setText("* This is a required field.");

					// set the text color to red

					email_textfield.setForeground(Color.RED);
				}
			}
		});

		mobileNumber_textfield.addFocusListener(new FocusAdapter()
		{
			public void focusGained(FocusEvent e)
			{
				if(mobileNumber_textfield.getText().equals("* This is a required field."))
				{
					mobileNumber_textfield.setText("");

					// set the text color back to previous color (here, black)

					mobileNumber_textfield.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e)
			{
				if(mobileNumber_textfield.getText().equals(""))
				{
					mobileNumber_textfield.setText("* This is a required field.");

					// set the text color to red

					mobileNumber_textfield.setForeground(Color.RED);
				}
			}
		});

		panel1.add(dbname_label);

		panel1.add(dbname_textfield);

		// JLabel nextLine = new JLabel("<html><br></html>", SwingConstants.CENTER);

		// panel1.add(nextLine);

		panel1.add(tablename_label);

		panel1.add(tbname_textfield);

		panel1.add(btn1);

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS)); // Setting BoxLayout Vertically

		main_frame.add(panel1);

		panel2.add(rno_label);

		panel2.add(rno_textfield);

		panel2.add(firstname_label);

		panel2.add(firstname_textfield);

		panel2.add(lastname_label);

		panel2.add(lastname_textfield);

		panel2.add(courseName_label);

		panel2.add(courseName_textfield);

		panel2.add(email_label);

		panel2.add(email_textfield);

		panel2.add(mobileNumber_label);

		panel2.add(mobileNumber_textfield);

		panel2.add(add_btn);

		panel2.add(get_btn);

		panel2.add(update_btn);

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS)); // Setting BoxLayout Vertically

		records_frame.add(panel2);

		main_frame.setVisible(true);
	}
}