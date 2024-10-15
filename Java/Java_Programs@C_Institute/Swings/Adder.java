import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* 
	Event Handling =>

	1. It allows us to run some code when user performs some operation with GUI controls.

	2. E.g. => When the user clicks a button.

	3. In Java, when an event is generated, then an event object is created.
	
	4. java.awt.event package provides classes and interfaces required for event handling.

	5. When you want to handle the click of a button :-

		i)	 You must register the ActionEvent on the button by calling the addActionListener(ActionListener ae) method.

		ii)  Your class must implement ActionListener interface.

		iii) The class must define the actionPerformed() method of ActionListener.

		iv)  The actionPerformed() method takes an ActionEvent object as argument.	
*/

class Adder implements ActionListener // after implementing ActionListener interface, the Adder class has also become an ActionListener
{
	private JFrame jf;

	private JTextField jtf1, jtf2, jtf3;

	private JLabel jl1, jl2, jl3;

	private JButton buttonAdd, buttonSubt, buttonMul, buttonDiv,buttonClear;

	private Adder()
	{
		// create the JFrame

		jf = new JFrame("Adder");

		FlowLayout fl1 = new FlowLayout();

		// set the layout to FlowLayout

		jf.setLayout(fl1);

		// create the labels

		jl1 = new JLabel("1st No. ----> ");

		jl2 = new JLabel("2nd No. ----> ");

		jl3 = new JLabel("Result  ----> ");

		// create the text fields

		jtf1 = new JTextField(30);

		// jtf1.setPreferredSize(new Dimension(200, 50));

		jtf2 = new JTextField(30);

		jtf3 = new JTextField(30);

		jtf3.setEditable(false); // to prevent editing of the value of the textfield by the user

		// create the buttons

		buttonAdd = new JButton("Add");

		// buttonAdd.setPreferredSize(new Dimension(100, 100));

		buttonSubt = new JButton("Subtract");

		buttonMul = new JButton("Multiply");

		buttonDiv = new JButton("Divide");

		buttonClear = new JButton("Clear");

		// set the size of the JFrame

		jf.setSize(470, 170);

		// add the labels, textfields and buttons

		jf.add(jl1);

		jf.add(jtf1);

		jf.add(jl2);

		jf.add(jtf2);

		jf.add(jl3);

		jf.add(jtf3);

		jf.add(buttonAdd);

		jf.add(buttonSubt);

		jf.add(buttonMul);

		jf.add(buttonDiv);

		jf.add(buttonClear);

		// register the actionListener with the buttons

		buttonAdd.addActionListener(this);

		// System.out.println(this.hashCode());

		buttonClear.addActionListener(this);

		buttonSubt.addActionListener(this);

		buttonMul.addActionListener(this);

		buttonDiv.addActionListener(this);

		// set the default close operation

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// show the Jframe

		jf.setVisible(true);
	}

	public static void main(String args[])
	{
		Adder add = new Adder();

		// System.out.println(add.hashCode());
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == buttonAdd) // getSource() method returns the reference of the object through which the event has been generated, so we are comparing the references here.
		{
			boolean errFlag = false;

			int num1 = 0, num2 = 0;

			try
			{
				String stringNum1 = jtf1.getText();

				num1 = Integer.parseInt(stringNum1);

				String stringNum2 = jtf2.getText();

				num2 = Integer.parseInt(stringNum2);
			}

			catch(NumberFormatException nfe)
			{
				errFlag = true;

				jtf3.setText("Invalid Input!");
			}

			if(errFlag == false)
			{
				int num3 = num1 + num2;

				jtf3.setText(""+num3); 

				// converting the value of the result (num3) to an object of String class and setting the text in jtf3 as the value of num3
			}
		}
		else if(ae.getSource() == buttonSubt)
		{
			boolean errFlag = false;

			int num1 = 0, num2 = 0;

			try
			{
				String stringNum1 = jtf1.getText();

				num1 = Integer.parseInt(stringNum1);

				String stringNum2 = jtf2.getText();

				num2 = Integer.parseInt(stringNum2);
			}

			catch(NumberFormatException nfe)
			{
				errFlag = true;

				jtf3.setText("Invalid Input!");
			}


			if(errFlag == false)
			{
				int num3 = num1 - num2;

				jtf3.setText(""+num3);
			}	
		}
		else if(ae.getSource() == buttonMul)
		{
			boolean errFlag = false;

			int num1 = 0, num2 = 0;

			try
			{
				String stringNum1 = jtf1.getText();

				num1 = Integer.parseInt(stringNum1);

				String stringNum2 = jtf2.getText();

				num2 = Integer.parseInt(stringNum2);
			}

			catch(NumberFormatException nfe)
			{
				errFlag = true;

				jtf3.setText("Invalid Input!");
			}

			if(errFlag == false)
			{
				int num3 = num1 * num2;

				jtf3.setText(""+num3);
			}
		}
		else if(ae.getSource() == buttonDiv)
		{
			try
			{
				String stringNum1 = jtf1.getText();

				int num1 = Integer.parseInt(stringNum1);

				String stringNum2 = jtf2.getText();

				int num2 = Integer.parseInt(stringNum2);

				int num3 = num1 / num2;

				jtf3.setText(""+num3);
			}

			catch(NumberFormatException nfe)
			{
				jtf3.setText("Invalid Input!");
			}

			catch(ArithmeticException aexp)
			{
				jtf3.setText("Can't Divide By Zero!");
			}
		}
		else
		{
			jtf1.setText("");

			jtf2.setText("");

			jtf3.setText("");
		}
	}
}