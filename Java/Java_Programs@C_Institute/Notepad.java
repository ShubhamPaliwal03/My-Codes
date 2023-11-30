import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


class Notepad
{
	public static void main(String args[])
	{
		// create a JFrame

		JFrame frame = new JFrame("NOTEPAD");

		frame.setSize(500, 500);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a JMenuBar

		JMenuBar menuBar = new JMenuBar();

		// create a JMenu

		JMenu fileMenu = new JMenu("File");

		// Create JMenuItems for the file menu

		JMenuItem openItem = new JMenuItem("Open");

		// create a JFileChooser

		JFileChooser fileChooser = new JFileChooser();

		// create a JTextArea with 5 rows and 20 columns

		JTextArea textArea = new JTextArea(5, 20);

		// set the line wrap and word wrap to true

		textArea.setLineWrap(true); // moves to the next line if the textArea width is full with content

		textArea.setWrapStyleWord(true); // wraps the entire word

		// create a JScrollPane to add scroll bars to the text area

		JScrollPane scrollPane = new JScrollPane(textArea);

		frame.add(scrollPane);

		// Add ActionListeners to respond to menu item clicks

		openItem.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// show the file chooser dialog

				int result = fileChooser.showOpenDialog(frame);

				// check if the user selected a file

				if(result == JFileChooser.APPROVE_OPTION)
				{
					// get the selected file

					File selectedFile = fileChooser.getSelectedFile();

					String filepath = selectedFile.getAbsolutePath();

					try
					{
						FileInputStream fin = new FileInputStream(filepath);

						// int bytes_expeceted = fin.available();

						// System.out.println(bytes_expeceted);

						BufferedInputStream bin = new BufferedInputStream(fin);

						int i;

						StringBuilder sb = new StringBuilder();

						while((i=bin.read())!=-1)
						{
							sb.append(String.valueOf((char)i));
						}

						String data = sb.toString();

						textArea.setText(data);
					}
					catch(Exception exc)
					{
						JOptionPane.showMessageDialog(null, "File Not Found!");
					}

				}
			}
		});

		// add JMenuItems to the File Menu

		fileMenu.add(openItem);

		fileMenu.addSeparator(); // adds a seperator line

		// add the file menu to the menu bar

		menuBar.add(fileMenu);

		// set the menu bar for the JFrame

		frame.setJMenuBar(menuBar);

		// set the frame visibility to true

		frame.setVisible(true);
	}
}