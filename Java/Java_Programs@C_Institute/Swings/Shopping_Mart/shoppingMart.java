import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class shoppingMart
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Shopping Mart");

		frame.setSize(300, 300);

		frame.setLocationRelativeTo(null);

		FlowLayout fl = new FlowLayout();

		frame.setLayout(fl);

		JButton addProduct = new JButton("Add Product");

		JButton deleteProduct = new JButton("Delete Product");

		JButton updateProduct = new JButton("Update Product");

		JButton generateBill = new JButton("Generate Bill");

		JDialog productDetailsDialog = new JDialog(frame, "Product Details", true);

		productDetailsDialog.setLayout(fl);

		productDetailsDialog.setSize(340, 220);

		JLabel productNameLabel = new JLabel("Product Name : ");

		JLabel productPriceLabel = new JLabel("Product Price");

		JTextField productNameTextField = new JTextField(15);

		JTextField productPriceTextField = new JTextField(15);

		productDetailsDialog.add(productNameLabel);

		productDetailsDialog.add(productNameTextField);

		productDetailsDialog.add(productPriceLabel);

		productDetailsDialog.add(productPriceTextField);

		productDetailsDialog.setLocationRelativeTo(null);

		addProduct.addActionListener(ae -> 
		{
			productDetailsDialog.setVisible(true);
		});

		String productName = productNameTextField.getText();

		String productPrice = productPriceTextField.getText();

		frame.add(addProduct);

		frame.add(deleteProduct);

		frame.add(updateProduct);

		frame.add(generateBill);

		frame.setVisible(true);
	}
}