import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main extends JFrame implements ActionListener
{
	private JScrollPane scrollPane;

	private JTable table;

	private JFileChooser fileChooser;

	private JMenuBar menuBar;

	private JMenu fileMenu;

	private JMenuItem openItem;

	private JMenuItem saveItem;

	private JMenuItem addNewRecordItem;

	public Main()
	{
		// create a JMenuBar to give options to open the desired file

		menuBar = new JMenuBar();

		// create a JMenu giving the options

		fileMenu = new JMenu("File");

		// Instantiate the menu items

		openItem = new JMenuItem("Open");

		saveItem = new JMenuItem("Save");

		addNewRecordItem = new JMenuItem("Add New Record");

		// add actionListener to the menu items

		openItem.addActionListener(this);

		saveItem.addActionListener(this);

		addNewRecordItem.addActionListener(this);

		fileMenu.add(openItem);

		fileMenu.add(saveItem);

		fileMenu.add(addNewRecordItem);

		// add the menu items to the file menu

		menuBar.add(fileMenu);

		setJMenuBar(menuBar);

		fileChooser = new JFileChooser();

		// set the default close operation of the JFrame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set the size of the JFrame

		setSize(500, 500);

		// center the frame

		setLocationRelativeTo(null);

		// make the frame visible

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == openItem)
		{
			int result = fileChooser.showOpenDialog(this);

			// check if the user selected a file

			if(result == JFileChooser.APPROVE_OPTION)
			{
				// get the selected file

				File selectedFile = fileChooser.getSelectedFile();

				String filepath = selectedFile.getAbsolutePath();

				setTitle(filepath);

				StringBuilder sb = new StringBuilder();

				try
				{
					FileInputStream fin = new FileInputStream(filepath);

					BufferedInputStream bin = new BufferedInputStream(fin);

					int i;

					while((i = bin.read()) != -1)
					{
						sb.append(String.valueOf((char)i));

						i++;
					}

					bin.close();

					fin.close();
				}

				catch(Exception e)
				{
					System.out.println(e);
				}

				// create an array of strings containing all the rows

				String[] rows = sb.toString().split("\n");

				String[] columnNames = rows[0].split(",");

				// create two-dimensional array of data

				Object[][] data = new Object[rows.length - 1][columnNames.length];

				for(int j = 1; j < rows.length; j++)
				{
					String[] r = rows[j].split(",");

					for(int i = 0; i < r.length; i++)
					{
						data[j-1][i] = r[i];
					}
				}

				// create a table

				table = new JTable(data, columnNames);

				// create a scroll pane

				scrollPane = new JScrollPane(table);

				add(scrollPane);
			}
		}
		else if(ae.getSource() == addNewRecordItem)
		{
			String filepath = getTitle();

			StringBuilder sb = new StringBuilder();

			try
			{
				FileInputStream fin = new FileInputStream(filepath);

				BufferedInputStream bin = new BufferedInputStream(fin);

				int i = 0

				while((i = bin.read()) != '\n')
				{
					sb.append(String.valueOf((char)i));
				}
			}	

			catch(Exception e)
			{
				System.out.println(e);
			}

			String columnNames[] = sb.toString().split(",");

			JDialog recordInputDialog = new JDialog();
		}
		
	}

	public static void main(String[] args)
	{
		new Main();
	}
}