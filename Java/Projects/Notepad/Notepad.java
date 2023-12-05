import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;

class Notepad
{
	public static void main(String args[])throws Exception
	{
		// create a JFrame

		JFrame frame = new JFrame("Untitled - Notepad (Unsaved)");

		frame.setSize(500, 500);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a JMenuBar

		JMenuBar menuBar = new JMenuBar();

		// create a JMenu

		JMenu fileMenu = new JMenu("File");

		// Create JMenuItems for the file menu

		JMenuItem openItem = new JMenuItem("Open");

		JMenuItem saveItem = new JMenuItem("Save");

		JMenuItem saveAsItem = new JMenuItem("Save As");

		JMenuItem newItem = new JMenuItem("New");

		JMenuItem exitItem = new JMenuItem("Exit");

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

		textArea.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				String title = frame.getTitle();

				// if(title.contains("(Unsaved)"))
				// {
				// 	frame.setTitle(title.substring(0, title.length()-8)+"Unsaved)");
				// }
				// else 

				if(title.contains("(Saved)"))
				{
					frame.setTitle(title.substring(0, title.length()-6)+"Unsaved)");
				}
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				// do nothing
			}

			@Override
			public void keyTyped(KeyEvent e)
			{
				// do nothing
			}

		});

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

					// get the filepath

					String filepath = selectedFile.getAbsolutePath();

					// add the absolute filepath in the title bar of the notepad

					frame.setTitle(selectedFile.getAbsolutePath()+" - Notepad (Saved)");

					try
					{
						FileInputStream fin = new FileInputStream(filepath);

						// int bytes_expeceted = fin.available();

						// System.out.println(bytes_expeceted); // returns the expected number of bytes present in that file, available to be read.

						BufferedInputStream bin = new BufferedInputStream(fin);

						int i;

						StringBuilder sb = new StringBuilder();

						while((i=bin.read())!=-1)
						{
							sb.append(String.valueOf((char)i));
						}

						bin.close();

						fin.close();

						String data = sb.toString();

						textArea.setText(data);
					}

					catch(Exception exc)
					{
						JOptionPane.showMessageDialog(frame, "File Not Found!");
					}

				}
			}
		});

		saveItem.addActionListener(new ActionListener()
		{
			public boolean containsWord(String s, String word)
			{
				int index = 0;

				while(index < s.length())
				{
					if(s.startsWith(word,index) && s.charAt(index+word.length()) == ' ')
					{
						return true;
					}
					
					index++;
				}

				return false;
			}

			@Override
			public void actionPerformed(ActionEvent ae)
			{
				String data = textArea.getText();

				String title = frame.getTitle();

				String currFilePath = "";

				if(title.contains("(Unsaved)"))
				{
					currFilePath = title.substring(0, title.length() - 20); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
				}
				else if(title.contains("(Saved)"))
				{
					currFilePath = title.substring(0, title.length() - 18); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
				}

				if(title.contains("(Unsaved)") && !containsWord(title, "Untitled"))
				{
					frame.setTitle(title.substring(0, title.length()-8)+"Saved)");

					// write the data from the current text area of the notepad to the file currently opened in the notepad

					try
					{
						// create an object of FileOutputStream

						FileOutputStream fout = new FileOutputStream(currFilePath);

						// create an object of BufferedOutputStream	

						BufferedOutputStream bout = new BufferedOutputStream(fout);

						// create a byte array containing the String 'data', using the method getBytes()

						byte[] b = data.getBytes();

						bout.write(b);

						bout.flush();

						bout.close();

						fout.close();
					}

					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				else if(title.contains("(Saved)"))
				{
					// do nothing
				}
				else
				{
					// same as save as

					// show the JFileChooser dialog

					int result = fileChooser.showSaveDialog(frame);

					if(result == JFileChooser.APPROVE_OPTION)
					{
						// get the selected file

						File selectedFile = fileChooser.getSelectedFile();

						// get the filename

						String filename = selectedFile.getAbsolutePath();

						// add the absolute file path in the title bar of the notepad

						frame.setTitle(filename+" - Notepad (Saved)");

						// write the data from the current text area of the notepad to the file currently opended in the notepad

						try
						{
							// create an object of FileOutputStream

							FileOutputStream fout = new FileOutputStream(filename);

							// create an object of BufferedOutputStream	

							BufferedOutputStream bout = new BufferedOutputStream(fout);

							byte[] b = data.getBytes();

							bout.write(b);

							bout.flush();

							bout.close();

							fout.close();
						}

						catch(Exception e)
						{
							System.out.println(e);
						}
					}
				}
			}
		});

		saveAsItem.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				// show the JFileChooser dialog

				int result = fileChooser.showSaveDialog(frame);

				if(result == JFileChooser.APPROVE_OPTION)
				{
					// get the selected file

					File selectedFile = fileChooser.getSelectedFile();

					// get the filename

					String filename = selectedFile.getAbsolutePath();

					// add the absolute file path in the title bar of the notepad

					frame.setTitle(filename+" - Notepad (Saved)");

					String data = textArea.getText();

					// write the data from the text area of the notepad to the file selected

					try
					{
						// create an object of FileOutputStream

						FileOutputStream fout = new FileOutputStream(filename);

						// // create an object of BufferedOutputStream

						BufferedOutputStream bout = new BufferedOutputStream(fout);

						byte[] b = data.getBytes();

						bout.write(b);

						bout.flush();

						bout.close();

						fout.close();
					}

					catch(Exception e)
					{

					}
				}
			}
		});

		newItem.addActionListener(new ActionListener()
		{
			public boolean containsWord(String s, String word)
			{
				int index = 0;

				while(index < s.length())
				{
					if(s.startsWith(word, index) && s.charAt(index+word.length()) == ' ')
					{
						return true;
					}

					index++;
				}

				return false;

			}

			@Override
			public void actionPerformed(ActionEvent ae)
			{
				String title = frame.getTitle();

				if(title.contains("(Unsaved)"))
				{	
					String data = textArea.getText();

					if(containsWord(title, "Untitled")) // this means that the file is not currently present anywhere in the system, as it is having 'Unsaved' and 'Untitled' together in the title
					{
						// same as save as

						// show the JFileChooser dialog

						int result = fileChooser.showSaveDialog(frame);

						if(result == JFileChooser.APPROVE_OPTION)
						{
							// get the selected file

							File selectedFile = fileChooser.getSelectedFile();

							// get the filename

							String filename = selectedFile.getAbsolutePath();

							// add the absolute file path in the title bar of the notepad

							frame.setTitle(filename+ " - Notepad (Saved)");

							// write the data from the current text area of the notepad to the file selected

							try
							{
								// create an object of FileOutputStream

								FileOutputStream fout = new FileOutputStream(filename);

								// create an object of BufferedOutputStream

								BufferedOutputStream bout = new BufferedOutputStream(fout);

								byte[] b = data.getBytes();

								bout.write(b);

								bout.flush();

								bout.close();

								fout.close();
							}

							catch(Exception e)
							{
								System.out.println(e);
							}
						}
					}
					else // if the file exists in the system but isn't updated as per the current modification(s)
					{
						// same as save

						String currFilePath = "";

						if(title.contains("(Unsaved)"))
						{
							currFilePath = title.substring(0, title.length() - 20); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}
						else if(title.contains("(Saved)"))
						{
							currFilePath = title.substring(0, title.length() - 18); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}

						frame.setTitle(title.substring(0, title.length() - 8)+"Saved)");

						// write the data from the text area of the notepad to the file currently opened in the notepad

						try 
						{
							// create an object of FileOutputStream

							FileOutputStream fout = new FileOutputStream(currFilePath);

							// create an object of BufferedOutputStream

							BufferedOutputStream bout = new BufferedOutputStream(fout);

							// create a byte array containing the String 'data', using the method getBytes()

							byte[] b = data.getBytes();

							bout.write(b);

							bout.flush();

							bout.close();

							fout.close();
						}

						catch(Exception e)
						{
							System.out.println(e);
						}

						// clear the current contents of the text area

						textArea.setText("");

						// set the title of the JFrame of the notepad to the program's default Jframe title

						frame.setTitle("Untitled - Notepad (Unsaved)");
					}
				}
				else // if the current file is already saved
				{
					// clear the current contents of the text area

					textArea.setText("");

					// set the title of the JFrame of the notepad to the program's default Jframe title

					frame.setTitle("Untitled - Notepad (Unsaved)");
				}
			}
		});

		// add JMenuItems to the File Menu

		fileMenu.add(openItem);

		fileMenu.addSeparator(); // adds a seperator line

		fileMenu.add(saveItem);

		fileMenu.addSeparator();

		fileMenu.add(saveAsItem);

		fileMenu.addSeparator();

		fileMenu.add(newItem);

		fileMenu.addSeparator();

		fileMenu.add(openItem);

		// add the file menu to the menu bar

		menuBar.add(fileMenu);

		// set the menu bar for the JFrame

		frame.setJMenuBar(menuBar);

		// set the frame visibility to true

		frame.setVisible(true);
	}
}