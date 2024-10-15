import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

class shoppingMart
{
	private static String sql_password = "";

	private static String sql_username = "root";

	private static Connection connection = null;

	private static Statement statement;

	private static DefaultTableModel tableModel;

	private static JTable table;

	public static void updateCartTable()
	{
		// get all the necessary values from the cart table

		try
		{
			// get the total number of rows present in the table using a sql query

			ResultSet resultSet1 = statement.executeQuery("SELECT COUNT(p_id) FROM cart");

			int rows_present_in_cart = 0;

			if(resultSet1.next())
			{
				rows_present_in_cart = resultSet1.getInt("COUNT(p_id)");
			}

			// create arrays for storing data fetched from sql queries

			Integer[] p_ids = new Integer[rows_present_in_cart];

			String[] p_names = new String[rows_present_in_cart];

			Integer[] p_qtys = new Integer[rows_present_in_cart];

			Integer[] p_prices = new Integer[rows_present_in_cart];

			Integer[] p_total_amounts = new Integer[rows_present_in_cart];

			// get all the data from the 'cart' table using a query

			ResultSet resultSet2 = statement.executeQuery("SELECT * FROM cart");

			int index = 0;

			while(resultSet2.next())
			{
				p_ids[index] = resultSet2.getInt("p_id");

				p_prices[index] = resultSet2.getInt("rate");

				p_qtys[index] = resultSet2.getInt("quantity");

				p_total_amounts[index] = resultSet2.getInt("total");

				index++;
			}

			// get the names of all the products using their respective product id's from the 'product' table, using their p_id, via a sql query

			index = 0;

			for(Integer pID : p_ids)
			{
				ResultSet resultSet3 = statement.executeQuery("SELECT p_name FROM product WHERE p_id = "+pID);

				if(resultSet3.next())
				{
					p_names[index++] = resultSet3.getString("p_name");
				}
			}

			// make a 2d array of data, representing a table fetched from the database

			Object[][] data = new Object[rows_present_in_cart][5];

			for(int i = 0; i < rows_present_in_cart; i++)
			{
				for(int j = 0; j < 5; j++)
				{
					switch(j)
					{
						case 0 :

							data[i][j] = p_ids[i];

							break;

						case 1:

							data[i][j] = p_names[i];	

							break;

						case 2:
						
							data[i][j] = p_qtys[i];

							break;	

						case 3:
						
							data[i][j] = p_prices[i];

							break;	

						case 4:
						
							data[i][j] = p_total_amounts[i];	

							break;
					}
				}
			}

			// remove the previous data from the table

			while(tableModel.getRowCount() > 0)
			{
				tableModel.removeRow(0);
			}

			// add the new data to the table

			for(Object[] row : data)
			{
				tableModel.addRow(row);
			}
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{
		// create the admin login frame

		JFrame loginFrame = new JFrame("Admin Panel");

		loginFrame.setSize(350, 300);

		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loginFrame.setLocationRelativeTo(null);

		FlowLayout fl = new FlowLayout();

		loginFrame.setLayout(fl);

		JLabel usernameLabel = new JLabel("Enter Username : ");

		JLabel passwordLabel = new JLabel("Enter Password : ");

		JTextField usernameTextfield = new JTextField(15);

		JTextField passwordTextfield = new JTextField(15);

		JButton loginBtn = new JButton("Login");

		loginFrame.add(usernameLabel);

		loginFrame.add(usernameTextfield);

		loginFrame.add(passwordLabel);

		loginFrame.add(passwordTextfield);

		loginFrame.add(loginBtn);

		// JDBC

		try
		{
			// load the drivers

			Class.forName("com.mysql.jdbc.Driver");
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		try
		{
			// get the connection to the 'mart' database

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mart", sql_username, sql_password);

			// create a statement object

			statement = connection.createStatement();
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

		JFrame frame = new JFrame("Shopping Mart");

		frame.setSize(350, 300);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(fl);

		JLabel productOpsLabel = new JLabel("Product Operations");

		JPanel productOpsPanel = new JPanel();

		productOpsPanel.setSize(175, 150);

		JButton addProductBtn = new JButton("Add Product");

		JButton deleteProductBtn = new JButton("Delete Product");

		JButton updateProductBtn = new JButton("Update Product");

		JButton placeOrderBtn = new JButton("Place Order"); // to be changed

		JButton showAllProductsBtn = new JButton("Show All Products");

		productOpsPanel.add(productOpsLabel);

		productOpsPanel.add(addProductBtn);

		productOpsPanel.add(deleteProductBtn);

		productOpsPanel.add(updateProductBtn);

		productOpsPanel.add(showAllProductsBtn);

		// productOpsPanel.add(placeOrderBtn);

		JPanel billAndDetailsPanel = new JPanel();

		JLabel billAndDetailsLabel = new JLabel("Bill And Details");

		JButton billBtn = new JButton("Bill");

		JButton ordersBtn = new JButton("Orders");

		billAndDetailsPanel.add(billAndDetailsLabel);

		billAndDetailsPanel.add(billBtn);

		billAndDetailsPanel.add(ordersBtn);

		// dialog for adding records

		JDialog productDetailsAddDialog = new JDialog(frame, "Add New Product", true);

		productDetailsAddDialog.setLayout(fl);

		productDetailsAddDialog.setSize(240, 220);

		JLabel productNameLabelAdd = new JLabel("Product Name : ");

		JLabel productPriceLabelAdd = new JLabel("Product Price");

		JTextField productNameTextFieldAdd = new JTextField(15);

		JTextField productPriceTextFieldAdd = new JTextField(15);

		JButton ConfirmAddBtn = new JButton("Confirm Add");

		productDetailsAddDialog.add(productNameLabelAdd);

		productDetailsAddDialog.add(productNameTextFieldAdd);

		productDetailsAddDialog.add(productPriceLabelAdd);

		productDetailsAddDialog.add(productPriceTextFieldAdd);

		productDetailsAddDialog.add(ConfirmAddBtn);

		productDetailsAddDialog.setLocationRelativeTo(null);

		// dialog for deleting records

		JDialog productDetailsDeleteDialog = new JDialog(frame, "Delete Product Details", true);

		JLabel productNameLabelDelete = new JLabel("Product Name : ");

		JTextField productNameTextFieldDelete = new JTextField(15);

		productDetailsDeleteDialog.setLayout(fl);

		productDetailsDeleteDialog.setSize(240, 220);

		JButton ConfirmDeleteBtn = new JButton("Confirm Delete");

		productDetailsDeleteDialog.add(productNameLabelDelete);

		productDetailsDeleteDialog.add(productNameTextFieldDelete);

		productDetailsDeleteDialog.add(ConfirmDeleteBtn);

		productDetailsDeleteDialog.setLocationRelativeTo(null);

		// dialog for updating records

		JDialog productDetailsUpdateDialog = new JDialog(frame, "Update Product Details", true);

		JLabel productNameLabelUpdate = new JLabel("Product Name");

		JLabel productPriceLabelUpdate = new JLabel("Product Price");

		JTextField productNameTextFieldUpdate = new JTextField(15);

		JTextField productPriceTextFieldUpdate = new JTextField(15);

		productDetailsUpdateDialog.setLayout(fl);

		productDetailsUpdateDialog.setSize(240, 220);

		JButton ConfirmUpdateBtn = new JButton("Confirm Update");

		productDetailsUpdateDialog.add(productNameLabelUpdate);

		productDetailsUpdateDialog.add(productNameTextFieldUpdate);

		productDetailsUpdateDialog.add(productPriceLabelUpdate);

		productDetailsUpdateDialog.add(productPriceTextFieldUpdate);

		productDetailsUpdateDialog.add(ConfirmUpdateBtn);

		productDetailsUpdateDialog.setLocationRelativeTo(null);

		frame.add(productOpsPanel);

		frame.add(billAndDetailsPanel);

		// frame.add(addProductBtn);

		// frame.add(deleteProductBtn);

		// frame.add(updateProductBtn);

		// frame.add(placeOrderBtn);

		loginFrame.setVisible(true);

		loginBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String username = usernameTextfield.getText();

				String password = passwordTextfield.getText();

				String user_provided_password = "";

				try
				{
					ResultSet resultSet = statement.executeQuery("SELECT password FROM admin WHERE username = '"+username+"'");

					if(resultSet.next()) // if the result set is not empty
					{
						user_provided_password = resultSet.getString("password");

						if(user_provided_password.equals(password))
						{
							JOptionPane.showMessageDialog(loginFrame, "Login Successful !\nWelcome "+username+" !");

							frame.setVisible(true); // show the main frame

							loginFrame.setVisible(false); // hide the login frame
						}
						else
						{
							JOptionPane.showMessageDialog(loginFrame, "Incorrect Password Entered !");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(loginFrame, "User Not Found !");
					}
				}

				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});

		addProductBtn.addActionListener(ae -> 
		{
			productDetailsAddDialog.setVisible(true);
		});

		ConfirmAddBtn.addActionListener(al ->
		{
			String productName = productNameTextFieldAdd.getText();

			String productPrice = productPriceTextFieldAdd.getText();

			try
			{
				int rows_affected = statement.executeUpdate("INSERT INTO product (p_name, p_price) VALUES ('"+productName+"', "+productPrice+")");
			}

			catch(Exception e)
			{
				System.out.println(e);
			}

			JOptionPane.showMessageDialog(productDetailsAddDialog, "Product Added To The Table Successfully...");

			// clear the fields

			productNameTextFieldAdd.setText("");

			productPriceTextFieldAdd.setText("");
		});

		deleteProductBtn.addActionListener(ae -> 
		{
			productDetailsDeleteDialog.setVisible(true);
		});

		ConfirmDeleteBtn.addActionListener(al ->
		{
			String productName = productNameTextFieldDelete.getText();

			try
			{
				int rows_affected = statement.executeUpdate("DELETE FROM product WHERE p_name = '"+productName+"'");
			}

			catch(Exception e)
			{
				System.out.println(e);
			}

			JOptionPane.showMessageDialog(productDetailsDeleteDialog, "Product Deleted From The Table Successfully...");

			// clear the fields

			productNameTextFieldDelete.setText("");
		});

		updateProductBtn.addActionListener(ae ->
		{
			productDetailsUpdateDialog.setVisible(true);
		});

		ConfirmUpdateBtn.addActionListener(al ->
		{
			String productName = productNameTextFieldUpdate.getText();

			String productPrice = productPriceTextFieldUpdate.getText();

			try
			{
				int rows_affected = statement.executeUpdate("UPDATE product SET p_price = "+productPrice+" WHERE p_name = '"+productName+"'");
			}

			catch(Exception e)
			{
				System.out.println(e);
			}

			JOptionPane.showMessageDialog(productDetailsUpdateDialog, "Product Details Updated In The Table Successfully...");

			// clear the fields

			productNameTextFieldAdd.setText("");

			productPriceTextFieldAdd.setText("");
		});

		// create a frame for placing order

		JFrame placeOrderFrame = new JFrame("Place Order");

		placeOrderFrame.setSize(450, 300);

		placeOrderFrame.setLayout(fl);

		placeOrderFrame.setLocationRelativeTo(null);

		JLabel productLabel = new JLabel("Select Product : ");

		JLabel quantityLabel = new JLabel("Select Quantity : ");

		JComboBox<String> productComboBox = new JComboBox<>();

		JComboBox<Integer> quantityComboBox = new JComboBox<>();

		for(int i = 1; i <= 5; i++)
		{
			quantityComboBox.addItem(i);
		}

		placeOrderFrame.add(productLabel);

		placeOrderFrame.add(productComboBox);

		placeOrderFrame.add(quantityLabel);

		placeOrderFrame.add(quantityComboBox);

		JButton addToCartBtn = new JButton("Add To Cart");

		placeOrderFrame.add(addToCartBtn);

		// create a button to show the cart

		JButton showCartBtn = new JButton("Show Cart");

		placeOrderFrame.add(showCartBtn);

		placeOrderBtn.addActionListener(ae ->
		{
			try
			{
				ResultSet resultSet = statement.executeQuery("SELECT p_name FROM product");

				// adding the products to the productComboBox until the result set is not empty

				while(resultSet.next())
				{
					productComboBox.addItem(resultSet.getString("p_name"));
				}
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}	

			placeOrderFrame.setVisible(true);
		});

		// create a frame for showing the cart

		JFrame cartFrame = new JFrame("Your Cart");

		cartFrame.setSize(450, 300);

		cartFrame.setLocationRelativeTo(null);

		// cartFrame.setLayout(fl);

		// create a dynamic JTable to display the cart

		String[] columns = {"Product ID", "Product Name", "Product Quantity", "Product Price", "Total Amount"};

		tableModel = new DefaultTableModel(columns, 0);

		table = new JTable(tableModel);

		// create a scroll pane for the panel

		JScrollPane scrollPane = new JScrollPane(table);

		cartFrame.add(scrollPane, BorderLayout.CENTER);

		addToCartBtn.addActionListener(ae ->
		{
			// get the selected values from the product combo box

			String productName = String.valueOf(productComboBox.getSelectedItem());

			// get the selected values from the quantity combo box

			int productQuantity = Integer.parseInt(String.valueOf(quantityComboBox.getSelectedItem()));

			int productPrice = 0;

			int productId = 0;

			// get the values :- the product id, product price, total

			try
			{
				ResultSet resultSet1 = statement.executeQuery("SELECT p_id, p_price FROM product WHERE p_name = '"+productName+"'");

				while(resultSet1.next())
				{
					productId = resultSet1.getInt("p_id");

					productPrice = resultSet1.getInt("p_price");
				}

				// running a query and checking if the product already exists in the cart, if so, then update the quantity and total amount

				ResultSet resultSet2 = statement.executeQuery("SELECT quantity FROM cart WHERE p_id = '"+productId+"'");

				if(resultSet2.next()) // if the result set is not empty, ie,. the product already exists in the cart
				{
					int existing_product_qty = resultSet2.getInt("quantity");

					int updated_product_qty = existing_product_qty + productQuantity;

					int total_amount = updated_product_qty * productPrice;

					int rows_affected = statement.executeUpdate("UPDATE cart SET quantity = "+updated_product_qty+", total = "+total_amount+" where p_id = '"+productId+"'");
				}
				else
				{
					int total_amount = productQuantity * productPrice;

					int rows_affected = statement.executeUpdate("INSERT INTO cart VALUES ("+productId+", "+productPrice+", "+productQuantity+", "+total_amount+")");
				}	
			}	

			catch(Exception e)
			{
				System.out.println(e);
			}

			JOptionPane.showMessageDialog(placeOrderFrame, "Product Added To Cart...");

			// update the my cart table

			updateCartTable();

		});

		showCartBtn.addActionListener(ae ->
		{
			cartFrame.setVisible(true);

			updateCartTable();
		});

		// frame.setVisible(true);
	}
}