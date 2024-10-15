import javax.swing.*;
import java.awt.*;

class SomeGUIControlsInSwings
{
	public static void main(String args[])
	{
		JFrame jf = new JFrame("GUI controls demo");

		jf.setSize(300,400);

		// create label

		JLabel jl = new JLabel("Enter your name");

		// create TextField

		JTextField jtf = new JTextField(30);

		// Create a button

		JButton jb = new JButton("Click Me");

		// Note :-

		/* Every Frame has a Layout Manager which manages the default size and location of components added on the frame */

		/* By default, every JFrame has BorderLayout. We can change the layout of the JFrame*/

		FlowLayout fl = new FlowLayout();

		// FlowLayout is defined in java.awt

		jf.setLayout(fl);

		// add the label to the frame

		jf.add(jl);

		// add the textfield to the frame

		jf.add(jtf);

		// add the button to the frame

		jf.add(jb);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setVisible(true);
	}
}