import javax.swing.*;
import java.awt.*;

public class JTableExample extends JFrame
{
	private JScrollPane scrollPane;

	private JTable table;

	public JTableExample()
	{
		// create a two-dimensional array of data

		// we are creating a 2D array of Object type because we have to store mixed type data in the 2D array.

		Object[][] data = {
			{"Jitesh", 25, "Male"},
			{"Aditi", 30, "Female"},
			{"Samroj", 28, "Male"},
			{"Anamika", 22, "Female"}
		};

		// create an array of column names

		String[] columnNames = {"Name", "Age", "Gender"};

		// create a JTable with the data and column names

		table = new JTable(data, columnNames);

		// add the table to the scroll pane

		scrollPane = new JScrollPane(table);

		// add the scroll pane to the frame

		add(scrollPane);

		setTitle("JTable Example");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400, 300);

		setLocationRelativeTo(null); // center the frame

		setVisible(true);
	}

	public static void main(String[] args)
	{
		new JTableExample();
	}
}