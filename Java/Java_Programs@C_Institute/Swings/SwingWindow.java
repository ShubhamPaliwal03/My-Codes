import javax.swing.*;

class SwingWindow
{
	public static void main(String args[])
	{
		// create a JFrame object, the JFrame class is defined in javax.swing

		// A JFrame object represents a window on which we can add different swing controls

		// A JFrame works as a container for all other components

		JFrame jf = new JFrame("This is a JFrame Window");

		// set the size of the JFrame

		jf.setSize(450,450);

		// set the default close operation of JFrame by clicking on the close button, then our program also terminates

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// show the JFrame window or set the visibility of the JFrame

		jf.setVisible(true);
	}
}