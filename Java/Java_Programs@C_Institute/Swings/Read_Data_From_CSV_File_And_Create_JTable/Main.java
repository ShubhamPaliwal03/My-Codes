import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Main extends JFrame implements ActionListener
{
	private JScrollPane scrollPane;

	private DefaultTableModel tableModel;

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

		fileMenu.addSeparator();

		fileMenu.add(saveItem);

		fileMenu.addSeparator();

		fileMenu.add(addNewRecordItem);

		// add the menu items to the file menu

		menuBar.add(fileMenu);

		setJMenuBar(menuBar);

		fileChooser = new JFileChooser();

		// set the default close operation of the JFrame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set the size of the JFrame

		setSize(500, 500);

		tableModel = new DefaultTableModel();

		// create a table

		table = new JTable(tableModel);

		// create a scroll pane for the table

		scrollPane = new JScrollPane(table);

		// add the scroll pane to the center of the frame

		add(scrollPane, BorderLayout.CENTER);

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

				// fetch the data from the csv file

				// create an array of strings containing all the rows

				String[] rows = sb.toString().split("\n");

				// extract the columnnames

				String[] columnNames = rows[0].split(",");

				// add the new column names

				tableModel.setColumnIdentifiers(columnNames);

				// create two-dimensional array of data

				Object[][] data = new Object[rows.length - 1][columnNames.length];

				// place the data at its correct position in the data matrix

				for(int j = 1; j < rows.length; j++)
				{
					String[] r = rows[j].split(",");

					for(int i = 0; i < r.length; i++)
					{
						data[j-1][i] = r[i];
					}
				}

				// remove the previous data (if any) from the table

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
		}
		else if(ae.getSource() == addNewRecordItem)
		{
			String filepath = getTitle();

			StringBuilder sb = new StringBuilder();

			try
			{
				FileInputStream fin = new FileInputStream(filepath);

				BufferedInputStream bin = new BufferedInputStream(fin);

				int i = 0;

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

			JDialog recordInputDialog = new JDialog(this, "Add New Font", true);

			// create an object of FlowLayout

			FlowLayout fl = new FlowLayout();

			// set the layout of the dialog box to FlowLayout

			recordInputDialog.setLayout(fl);

			// set the size of the dialog

			recordInputDialog.setSize(340, 220);

			// for(String columnName : columnNames)
			// {
			// 	JTextField jtf = new 
			// }

			// create text fields to input the field data

			JTextField s_no_field = new JTextField(20);

			JTextField name_field = new JTextField(20);

			JTextField roll_no_field = new JTextField(20);

			// create labels for the text fields

			JLabel s_no_label = new JLabel("S.No. => ");

			JLabel name_label = new JLabel("Name => ");

			JLabel roll_no_label = new JLabel("Roll No. => ");

			// add the resp. labels and fields to the dialog box

			recordInputDialog.add(s_no_label);

			recordInputDialog.add(s_no_field);

			recordInputDialog.add(name_label);

			recordInputDialog.add(name_field);

			recordInputDialog.add(roll_no_label);

			recordInputDialog.add(roll_no_field);

			// create an ok button

			JButton ok_btn = new JButton("Ok");

			// create a cancel button

			JButton cancel_btn = new JButton("Cancel");

			ok_btn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					StringBuilder sb = new StringBuilder();

					sb.append("\n");

					sb.append(s_no_field.getText());

					sb.append(", ");

					sb.append(name_field.getText());

					sb.append(", ");

					sb.append(roll_no_field.getText());

					String filepath = getTitle();

					try
					{
						FileOutputStream fout = new FileOutputStream(filepath, true); // opening the file in append mode (by passing true along with filepath in function call)

						BufferedOutputStream bout = new BufferedOutputStream(fout);

						byte[] b = sb.toString().getBytes();

						bout.write(b);

						bout.flush();

						bout.close();

						fout.close();
					}

					catch(Exception e)
					{
						System.out.println(e);
					}

					// get the row data as a String in csv format

					String row_csv_data = sb.toString().substring(1, sb.length());

					// get the row data

					Object[] row_data = row_csv_data.split(",");

					tableModel.addRow(row_data);
				}
			});

			// adding the buttons to the dialog box

			recordInputDialog.add(ok_btn);

			recordInputDialog.add(cancel_btn);

			// set the visibility of the dialog box to true, ie., make it visible.

			recordInputDialog.setVisible(true);
		}
	}

	public static void main(String[] args)
	{
		new Main();
	}
}