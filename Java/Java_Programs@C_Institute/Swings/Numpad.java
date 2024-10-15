import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Numpad implements ActionListener
{
	private JFrame jf; // declare a JFrame

	private JTextField jtf; // declare a textfield

	private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDel, buttonClear; // declare the buttons

	private Numpad()
	{
		// initialize the JFrame

		jf = new JFrame("Numpad");

		FlowLayout fl = new FlowLayout();

		// set the layout to FlowLayout

		jf.setLayout(fl);

		// initialize the textfield

		jtf = new JTextField(30);

		// jtf.setEditable(false); // to only allow input of value by the numpad provided by the GUI of the software, not through the keyboard

		button0 = new JButton("0");

		button1 = new JButton("1");

		button2 = new JButton("2");

		button3 = new JButton("3");

		button4 = new JButton("4");

		button5 = new JButton("5");

		button6 = new JButton("6");

		button7 = new JButton("7");

		button8 = new JButton("8");

		button9 = new JButton("9");

		buttonDel = new JButton("Del");

		buttonClear = new JButton("Clear");

		// set the size of the JFrame

		jf.setSize(470, 400);

		// add the textfield and buttons

		jf.add(jtf);

		jf.add(button0);

		jf.add(button1);

		jf.add(button2);

		jf.add(button3);

		jf.add(button4);

		jf.add(button5);

		jf.add(button6);

		jf.add(button7);

		jf.add(button8);

		jf.add(button9);

		jf.add(buttonDel);

		jf.add(buttonClear);

		button0.addActionListener(this);

		button1.addActionListener(this);

		button2.addActionListener(this);

		button3.addActionListener(this);

		button4.addActionListener(this);

		button5.addActionListener(this);

		button6.addActionListener(this);

		button7.addActionListener(this);

		button8.addActionListener(this);

		button9.addActionListener(this);

		buttonDel.addActionListener(this);

		buttonClear.addActionListener(this);

		// set the default close operation

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// show the JFrame

		jf.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == button0)
		{	
			jtf.setText(jtf.getText()+"0");
		}
		else if(ae.getSource() == button1)
		{
			jtf.setText(jtf.getText()+"1");
		}
		else if(ae.getSource() == button2)
		{
			jtf.setText(jtf.getText()+"2");
		}
		else if(ae.getSource() == button3)
		{
			jtf.setText(jtf.getText()+"3");
		}
		else if(ae.getSource() == button4)
		{
			jtf.setText(jtf.getText()+"4");
		}
		else if(ae.getSource() == button5)
		{
			jtf.setText(jtf.getText()+"5");
		}
		else if(ae.getSource() == button6)
		{
			jtf.setText(jtf.getText()+"6");
		}
		else if(ae.getSource() == button7)
		{
			jtf.setText(jtf.getText()+"7");
		}
		else if (ae.getSource() == button8)
		{
			jtf.setText(jtf.getText()+"8");
		}
		else if(ae.getSource() == button9)
		{
			jtf.setText(jtf.getText()+"9");
		}
		else if(ae.getSource() == buttonDel)
		{	
			try
			{
				jtf.setText(jtf.getText().substring(0, jtf.getText().length()-1));
			}
			
			catch(StringIndexOutOfBoundsException e) // StringIndexOutOfBounds exception will occur when we run delete command on an empty string.
			{

			}
		}
		else
		{
			jtf.setText("");
		}
	}

	public static void main(String []args)
	{
		Numpad npd = new Numpad();
	}
}