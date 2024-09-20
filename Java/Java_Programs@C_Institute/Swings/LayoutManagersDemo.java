import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LayoutManagersDemo
{	
	public static double[] getInputValues(JTextField num1_tf, JTextField num2_tf, JTextField result_tf)
	{
		double[] inputs = new double[3];

		try
		{
			inputs[0] = Double.parseDouble(num1_tf.getText());

			inputs[1] = Double.parseDouble(num2_tf.getText());

			// to indicate whether user has put a valid (1) or invalid input (-1)

			inputs[2] = 1;
		}

		catch(NumberFormatException nfe)
		{
			result_tf.setText("Invalid Input");

			inputs[2] = -1;
		}

		finally
		{
			return inputs;
		}
	}

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Working With Layout Managers");

		frame.setSize(400, 400);

		JPanel outer_panel = new JPanel(new GridLayout(2, 2));

		JPanel inner_panel1 = new JPanel();

		inner_panel1.setLayout(new BoxLayout(inner_panel1, BoxLayout.Y_AXIS));

		// add glue to push the buttons to the top

		inner_panel1.add(Box.createVerticalGlue());

		for(int i = 1; i <= 4; i++)
		{	
			JButton jb = new JButton("");

			// center align buttons horizontally

			jb.setAlignmentX(Component.CENTER_ALIGNMENT);

			inner_panel1.add(jb);
		}

		// add glue to push the buttons to the bottom

		inner_panel1.add(Box.createVerticalGlue());

		outer_panel.add(inner_panel1); 

		JPanel inner_panel2 = new JPanel(new GridLayout(4, 4));

		for(int i = 1; i <= 16; i++)
		{
			inner_panel2.add(new JButton(" "));
		}

		outer_panel.add(inner_panel2);

		JPanel inner_panel3 = new JPanel();

		inner_panel3.setLayout(new BorderLayout());

		JButton panel3_b1 = new JButton(" ");
		JButton panel3_b2 = new JButton(" ");
		JButton panel3_b3 = new JButton(" ");

		inner_panel3.add(panel3_b1, BorderLayout.EAST);
		inner_panel3.add(panel3_b2, BorderLayout.CENTER);
		inner_panel3.add(panel3_b3, BorderLayout.WEST);

		outer_panel.add(inner_panel3);

		JPanel inner_panel4 = new JPanel(new GridLayout(4, 1));

		JPanel innermost_panel1 = new JPanel(new GridLayout(1, 2));

		JLabel num1_label = new JLabel("Enter Num 1 : ");
		JTextField num1_tf = new JTextField(10);

		innermost_panel1.add(num1_label);
		innermost_panel1.add(num1_tf);

		inner_panel4.add(innermost_panel1);

		JPanel innermost_panel2 = new JPanel(new GridLayout(1, 2));

		JLabel num2_label = new JLabel("Enter Num 2 : ");
		JTextField num2_tf = new JTextField(10);

		innermost_panel2.add(num2_label);
		innermost_panel2.add(num2_tf);

		inner_panel4.add(innermost_panel2);

		JPanel innermost_panel3 = new JPanel(new GridLayout(1, 2));

		JLabel result_label = new JLabel("Result : ");
		JTextField result_tf = new JTextField(10);

		result_tf.setEditable(false);

		innermost_panel3.add(result_label);
		innermost_panel3.add(result_tf);

		inner_panel4.add(innermost_panel3);

		JPanel innermost_panel4 = new JPanel(new GridLayout(1, 4));

		JButton add_btn = new JButton("+");
		JButton sub_btn = new JButton("-");
		JButton mul_btn = new JButton("*");
		JButton div_btn = new JButton("/");

		add_btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double[] inputs = getInputValues(num1_tf, num2_tf, result_tf);

				if(inputs[2] == 1) // if the input is valid, a number
				{
					double sum = inputs[0] + inputs[1];

					if(sum == (int)sum)
					{
						result_tf.setText(String.valueOf((int)sum));
					}
					else
					{
						result_tf.setText(String.valueOf(sum));
					}
				}
			}
		});

		sub_btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double[] inputs = getInputValues(num1_tf, num2_tf, result_tf);

				if(inputs[2] == 1) // if the input is valid, a number
				{
					double diff = inputs[0] - inputs[1];

					if(diff == (int)diff)
					{
						result_tf.setText(String.valueOf((int)diff));
					}
					else
					{
						result_tf.setText(String.valueOf(diff));
					}
				}
			}
		});

		mul_btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double[] inputs = getInputValues(num1_tf, num2_tf, result_tf);

				if(inputs[2] == 1) // if the input is valid, a number
				{
					double mul = inputs[0] * inputs[1];

					if(mul == (int)mul)
					{
						result_tf.setText(String.valueOf((int)mul));
					}
					else
					{
						result_tf.setText(String.valueOf(mul));
					}
				}
			}
		});

		div_btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				double[] inputs = getInputValues(num1_tf, num2_tf, result_tf);

				if(inputs[2] == 1) // if the input is valid, a number
				{
					if(inputs[1] == 0)
					{
						result_tf.setText("Can't Divide By Zero");
					}
					else
					{
						double div = inputs[0] / inputs[1];

						if(div == (int)div)
						{
							result_tf.setText(String.valueOf((int)div));
						}
						else
						{
							result_tf.setText(String.valueOf(div));
						}
					}
				}
			}
		});

		innermost_panel4.add(add_btn);
		innermost_panel4.add(sub_btn);
		innermost_panel4.add(mul_btn);
		innermost_panel4.add(div_btn);

		inner_panel4.add(innermost_panel4);

		outer_panel.add(inner_panel4);

		frame.add(outer_panel);

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}