import javax.swing.*;

class SwingsDemo
{
	public static void main(String args[])
	{
		// Create a JFrame object, the JFrame class is defined in the javax.swing package.

		// A JFrame object represents a window on which we can add different swing controls.

		// A JFrame works as a container for all other components.

		JFrame jf = new JFrame("This is a JFrame Window");

		// set location

		jf.setLocation(290, 190); // x, y

		// set the size of the JFrame

		jf.setSize(450, 450); // width, height

		// set the default close operation of JFrame so that when we close the JFrame by clicking on the close button, then our program also terminates.

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// show the JFrame window or set the visibility of the JFrame

		jf.setVisible(true);
	}
}