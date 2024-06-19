import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.awt.*;
// import com.formdev.flatlaf.FlatDarkLaf;

// create a class to load the fonts and place them in the JComboBox in a seperate thread

class FontLoaderThread extends Thread
{
	private String threadName;

	FontLoaderThread(String threadName)
	{
		super(threadName);

		this.threadName = threadName;

		start();
	}

	public void run()
	{
		try
		{
			System.out.println(threadName+" started...");

			// create a JComboBox consisting of all the available system fonts

			JComboBox<String> fontFamilyComboBox = new JComboBox<>();

			// get the available system fonts

			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

			String[] fontFamilyNames = ge.getAvailableFontFamilyNames();

			// add the available system fonts to the combo box

			for(String fontFamilyName : fontFamilyNames)
			{
				fontFamilyComboBox.addItem(fontFamilyName);
			}

			System.out.println(threadName+" completed...");

			JustNote.fontFamilyComboBox = fontFamilyComboBox;
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class JustNote
{
	static volatile JComboBox<String> fontFamilyComboBox = new JComboBox<>();

	public static ArrayList<ArrayList<Integer>> findWordIndicesInString(String str, String word)
	{
		ArrayList<ArrayList<Integer>> indices = new ArrayList<>();

		int index = 0;

		int str_len = str.length();

		int word_len = word.length();

		while(index < str_len)
		{
			if(str.startsWith(word, index))
			{
				ArrayList<Integer> arr = new ArrayList<>();

				arr.add(index);

				arr.add(index + (word_len - 1));

				index += word_len;

				indices.add(arr);
			}
			else
			{
				index++;
			}
		}

		return indices;
	}

	public static void main(String args[]) throws Exception
	{
		// create a new thread for loading the fonts available in the system

		FontLoaderThread fThread = new FontLoaderThread("FontLoaderThread");

		// create a JFrame

		JFrame frame = new JFrame("Untitled - JustNote (Unsaved)");

		frame.setSize(500, 500);

		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create an object of flow layout

		FlowLayout fl = new FlowLayout();

		// create a JMenuBar

		JMenuBar menuBar = new JMenuBar();

		// create a JMenu for "File" options

		JMenu fileMenu = new JMenu("File");

		// Create JMenuItems for the file menu

		JMenuItem openItem = new JMenuItem("Open");

		JMenuItem saveItem = new JMenuItem("Save");

		JMenuItem saveAsItem = new JMenuItem("Save As");

		JMenuItem newItem = new JMenuItem("New");

		JMenuItem exitItem = new JMenuItem("Exit");

		// set the keyboard shortcuts for the JMenuItems using the KeyStroke, which will serve as an accelerator

		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));

		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));

		saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));

		newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));

		// create a JMenu for "Edit" options

		JMenu editMenu = new JMenu("Edit");

		// create JMenuItems for the editMenu

		JMenuItem findItem = new JMenuItem("Find");

		// set the keyboard shortcut for the findItem using the KeyStroke, which will serve as an accelerator

		findItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));

		// creata a JMenu for "Format" options

		JMenu formatMenu = new JMenu("Format");

		// Create JMenuItems for the formatMenu

		JMenuItem fontItem = new JMenuItem("Font");

		// set the keyboard shortcut for the fontItem using the KeyStroke, which will serve as an accelerator

		fontItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));

		// create a JFileChooser

		JFileChooser fileChooser = new JFileChooser();

		// create a JTextArea with 5 rows and 20 columns

		JTextArea textArea = new JTextArea(10, 50);

		// // set the default font family, font style, and font size

		// Font defaultFont = new Font("Consolas", Font.PLAIN, 20);

		// Font defaultFont = new Font("Consolas", Font.BOLD | Font.ITALIC, 20);

		// textArea.setFont(defaultFont);

		// get back to the last saved font configuration

		StringBuilder sb = new StringBuilder();

		try
		{
			FileInputStream fin = new FileInputStream("./config/fontConfig/untitled-config.txt");

			BufferedInputStream bin = new BufferedInputStream(fin);

			int i = 0;

			while((i = bin.read()) != -1)
			{
				sb.append(String.valueOf((char)i));

				i++;
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

		String[] fontConfig = sb.toString().split(","); // splits the string using ", " as a wildcard, returns an array of Strings 

		// extract the current font configuration from the array of Strings

		String currentFontFamily = fontConfig[0];

		Integer currentFontStyleValue = Integer.parseInt(fontConfig[1]);

		Integer currentFontSize = Integer.parseInt(fontConfig[2]);

		textArea.setFont(new Font(currentFontFamily, currentFontStyleValue, currentFontSize));

		// set the line wrap and word wrap to true

		textArea.setLineWrap(true); // moves to the next line if the textArea width is fully covered with the content

		textArea.setWrapStyleWord(true); // wraps the entire word together, keeping it all together in a single line

		// create a JScrollPane to add scroll bars to the text area

		JScrollPane scrollPane = new JScrollPane(textArea);

		frame.add(scrollPane);

		// create a JDialog for find option

		JDialog	findDialog = new JDialog(frame, "Find", true);

		findDialog.setSize(340, 120);

		findDialog.setLocationRelativeTo(frame);

		findDialog.setLayout(fl);

		JLabel findTextLabel = new JLabel("Text: ");

		JTextField findTextField = new JTextField(15);

		JButton findBtn = new JButton("Find");

		findDialog.add(findTextLabel);

		findDialog.add(findTextField);

		findDialog.add(findBtn);

		findItem.addActionListener(new ActionListener()
		{	
			public void actionPerformed(ActionEvent ae)
			{
				findDialog.setVisible(true);
			}
		});

		findBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				ArrayList<ArrayList<Integer>> indices = findWordIndicesInString(textArea.getText(), findTextField.getText());

				for(ArrayList<Integer> indexArr : indices)
				{
					int start_index = indexArr.get(0);

					int end_index = indexArr.get(1);

					textArea.select(start_index, end_index+1);
				}
			}
		});

		// create a dialog box for font formatting options

		JDialog fontDialog = new JDialog(frame, "Font", true);

		fontDialog.setLocationRelativeTo(frame);

		// set the layout of the dialog box to flow layout

		fontDialog.setLayout(fl);

		fontDialog.setSize(340, 220);

		// create a panel for the resp. combo box

		JPanel fontDialogPanel1 = new JPanel();

		// create a panel to display sample text on.

		JPanel sampleTextPanel = new JPanel();

		// set the size of the panel

		// sampleTextPanel.setSize();

		// create a JLabel to display the sample text

		JLabel sampleText = new JLabel("This is a Sample Text.");

		// sampleText.setFont(defaultFont);

		sampleText.setFont(new Font(currentFontFamily, currentFontStyleValue, currentFontSize));	

		// add the resp. label to the panel

		sampleTextPanel.add(sampleText);

		// add the resp. panel to the font dialog window

		fontDialog.add(sampleTextPanel);

		// add an actionListener to handle font selection

		fontFamilyComboBox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				// fetch the selected font name

				String selectedFontFamily = (String)fontFamilyComboBox.getSelectedItem(); // explicit typecasting to the suitable datatype is required because the method getSelectedItem() returns a String object

				// fetch the current font details

				Font currentFont = textArea.getFont(); // output when printed :- java.awt.Font[family=Consolas,name=Consolas,style=plain,size=20]

				Integer currentFontStyleValue = currentFont.getStyle();

				Integer currentFontSize = currentFont.getSize();

				// update the font details of the sample text and set the new ones

				sampleText.setFont(new Font(selectedFontFamily, currentFontStyleValue, currentFontSize));

				// update the font details and set the new ones

				textArea.setFont(new Font(selectedFontFamily, currentFontStyleValue, currentFontSize));

				// update the config file as per the new font details

				String title = frame.getTitle();

				String currFilePath = "";

				if(title.contains("(Unsaved)"))
				{
					currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - JustNote (Saved/Unsaved)"							
				}
				else if(title.contains("(Saved)"))
				{
					currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - JustNote (Saved/Unsaved)"
				}

				File opened_file = new File(currFilePath);

				String name_of_file = opened_file.getName();

				File configFile = new File("./config/fontConfig/"+name_of_file+"-config.txt");

				String fontConfigData = selectedFontFamily+","+currentFontStyleValue+","+currentFontSize;

				try
				{
					FileOutputStream fout = new FileOutputStream(configFile);

					BufferedOutputStream bout = new BufferedOutputStream(fout);

					byte[] b = fontConfigData.getBytes();

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
		});

		// create a JLabel for the resp. JComboBox

		JLabel fontFamilyLabel = new JLabel("Family: ");

		// add the resp. label to the resp. panel

		fontDialogPanel1.add(fontFamilyLabel);

		// add the respective combo box to the resp. panel

		fontDialogPanel1.add(fontFamilyComboBox);

		// add the resp. panel to the dialog box

		fontDialog.add(fontDialogPanel1);

		// create a panel for the resp. combo box

		JPanel fontDialogPanel2 = new JPanel();

		// create an array of strings of font styles

		String[] fontStyles = {"Plain", "Bold", "Italic", "Bold Italic"};
		
		// create a JComboBox consisting of all the available font styles

		JComboBox<String> fontStyleComboBox = new JComboBox<>(fontStyles);

		// other way to add items to fontStyleComboBox

		// run a for-each loop to add all the font styles to the fontStyleComboBox

		// for(String fontStyle : fontStyles)
		// {
		// 	fontStyleComboBox.addItem(fontStyle);
		// }	

		// add an ActionListener to handle font style selection

		fontStyleComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				// fetch the selected font style

				String selectedFontStyle = (String)fontStyleComboBox.getSelectedItem();

				// convert the Font Style to the Font Style Values

				Integer selectedFontStyleValue = 0;

				switch(selectedFontStyle)
				{
					case "Plain":

						selectedFontStyleValue = 0;

						break;

					case "Bold":
					
						selectedFontStyleValue = 1;

						break;

					case "Italic":
					
						selectedFontStyleValue = 2;

						break;

					case "Bold Italic":

						selectedFontStyleValue = 3;
					
						break;

					default:

						selectedFontStyleValue = 0;
				}

				// System.out.println(selectedFontStyle+" "+selectedFontStyleValue);

				// fetch the current font details

				Font currentFont = textArea.getFont();

				String currentFontFamily = currentFont.getFamily();

				Integer currentFontSize = (Integer)currentFont.getSize();

				// update the font details of the sample text and set the new ones

				sampleText.setFont(new Font(currentFontFamily, selectedFontStyleValue, currentFontSize));

				// update the font details and set the new ones

				textArea.setFont(new Font(currentFontFamily, selectedFontStyleValue, currentFontSize));

				// update the config file as per the new font details

				String title = frame.getTitle();

				String currFilePath = "";

				if(title.contains("(Unsaved)"))
				{
					currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - JustNote (Saved/Unsaved)"							
				}
				else if(title.contains("(Saved)"))
				{
					currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - JustNote (Saved/Unsaved)"
				}

				File opened_file = new File(currFilePath);

				String name_of_file = opened_file.getName();

				File configFile = new File("./config/fontConfig/"+name_of_file+"-config.txt");

				String fontConfigData = currentFontFamily+","+selectedFontStyleValue+","+currentFontSize;

				try
				{
					FileOutputStream fout = new FileOutputStream(configFile);

					BufferedOutputStream bout = new BufferedOutputStream(fout);

					byte[] b = fontConfigData.getBytes();

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
		});

		// create a label for the resp. panel

		JLabel fontStyleLabel = new JLabel("Style: ");

		// add the resp. label to the resp. panel

		fontDialogPanel2.add(fontStyleLabel);

		// add the respective combo box to the resp. panel

		fontDialogPanel2.add(fontStyleComboBox);

		// add the resp. panel to the dialog box

		fontDialog.add(fontDialogPanel2);

		// create a panel for the resp. combo box

		JPanel fontDialogPanel3 = new JPanel();

		// create an array of Integer values, consisting of all the standard font sizes (8 - 28)

		Integer[] fontSizes = new Integer[43];

		Integer fs = 8;

		for(int i = 0; i < fontSizes.length; i++)
		{
			fontSizes[i] = fs++;
		}

		// create a JComboBox consisting of all the standard font sizes (8 - 28)

		JComboBox<Integer> fontSizeComboBox = new JComboBox<>(fontSizes);

		// other way to add items to fontSizeComboBox

		// run a for-each loop to add all the fontSizes to the fontSizeComboBox

		// for(Integer fontSize : fontSizes)
		// {
		// 	fontSizeComboBox.addItem(fontSize);
		// }

		// add an ActionListener to handle the font size selection

		fontSizeComboBox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				// fetch the current font size

				Integer selectedFontSize = (Integer)fontSizeComboBox.getSelectedItem();

				// fetch the current font details

				Font currentFont = textArea.getFont();

				String currentFontFamily = currentFont.getFamily();

				Integer currentFontStyleValue = currentFont.getStyle();

				// update the font details of the sample text and set the new ones

				sampleText.setFont(new Font(currentFontFamily, currentFontStyleValue, selectedFontSize));

				// update the font details and set the new ones

				textArea.setFont(new Font(currentFontFamily, currentFontStyleValue, selectedFontSize));

				// update the config file as per the new font details

				String title = frame.getTitle();

				String currFilePath = "";

				if(title.contains("(Unsaved)"))
				{
					currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"							
				}
				else if(title.contains("(Saved)"))
				{
					currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
				}

				File opened_file = new File(currFilePath);

				String name_of_file = opened_file.getName();

				File configFile = new File("./config/fontConfig/"+name_of_file+"-config.txt");

				String fontConfigData = currentFontFamily+","+currentFontStyleValue+","+selectedFontSize;

				try
				{
					FileOutputStream fout = new FileOutputStream(configFile);

					BufferedOutputStream bout = new BufferedOutputStream(fout);

					byte[] b = fontConfigData.getBytes();

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
		});

		// create a JLabel for the respective JComboBox

		JLabel fontSizeLabel = new JLabel("Size: ");

		// add the resp. label to the resp. panel

		fontDialogPanel3.add(fontSizeLabel);

		// add the resp. combo box to the resp. panel

		fontDialogPanel3.add(fontSizeComboBox);

		// add the fontDialogPanel3 to the fontDialog

		fontDialog.add(fontDialogPanel3);

		// set the current selected items of respective combo boxes

		// Object fontFamily = currentFontFamily;

		fontFamilyComboBox.setSelectedItem(currentFontFamily); // passing a String class object as an actual argument will work as String class is the sub class of Object class 

		fontStyleComboBox.setSelectedItem(currentFontStyleValue);

		fontSizeComboBox.setSelectedItem(currentFontSize);

		// add a keyListener to tweak "Unsaved" and "Saved" in the title bar of the frame

		textArea.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				String title = frame.getTitle();

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
			public boolean containsWord(String s, String word)
			{
				int index = 0;

				while(index < s.length())
				{
					if(s.startsWith(word, index) && s.charAt(index + word.length()) == ' ')
					{
						return true;
					}

					index++;
				}

				return false;
			}

			public void setFontConfig(File file)
			{
				// set the font format as per it's font config file present in the config folder of the application folder

				// read the font configurations from the font config file present in the config folder of the application folder 4732 3762 7708

				boolean config_file_available = true;

				String filename = file.getName();

				String filepath = "./config/fontConfig/"+filename+"-config.txt";

				StringBuilder sb = new StringBuilder();

				try
				{
					FileInputStream fin = new FileInputStream(filepath);

					BufferedInputStream bin = new BufferedInputStream(fin);

					int i = 0;

					while((i = bin.read()) != -1)
					{
						sb.append(String.valueOf((char)i));

						i++;
					}
				}
				
				catch(FileNotFoundException fnfe)
				{
					config_file_available = false;
				}

				catch(Exception e)
				{
					System.out.println(e);
				}

				if(config_file_available == false)
				{
					try
					{
						FileInputStream fin = new FileInputStream("./config/fontConfig/untitled-config.txt");

						BufferedInputStream bin = new BufferedInputStream(fin);

						int i = 0;

						while((i = bin.read()) != -1)
						{
							sb.append(String.valueOf((char)i));

							i++;
						}
					}
					
					catch(Exception e)
					{
						System.out.println(e);
					}	
				}

				String[] fontConfig = sb.toString().split(","); // splits the string using ", " as a wildcard, returns an array of Strings 

				// extract the current font configuration from the array of Strings

				String currentFontFamily = fontConfig[0];

				Integer currentFontStyleValue = Integer.parseInt(fontConfig[1]);

				Integer currentFontSize = Integer.parseInt(fontConfig[2]);

				// set the current font specification to the text area

				textArea.setFont(new Font(currentFontFamily, currentFontStyleValue, currentFontSize));

				// set the current selected items of respective combo boxes

				// Object fontFamily = currentFontFamily;

				fontFamilyComboBox.setSelectedItem(currentFontFamily); // passing a String class object as an actual argument will work, as String class is the subclass of Object class (whose object is required as argument)

				fontStyleComboBox.setSelectedItem(currentFontStyleValue);

				fontSizeComboBox.setSelectedItem(currentFontSize);
			}

			public void openFile()
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

					frame.setTitle(selectedFile.getAbsolutePath()+" - JustNote (Saved)");

					// set the font format as per it's font config file present in the config folder of the application folder

					setFontConfig(selectedFile);

					try
					{
						FileInputStream fin = new FileInputStream(filepath);

						// int bytes_expeceted = fin.available();

						// System.out.println(bytes_expeceted); // returns the expected number of bytes present in that file, available to be read.

						BufferedInputStream bin = new BufferedInputStream(fin);

						int i;

						StringBuilder sb = new StringBuilder();

						while((i = bin.read()) != -1)
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

			@Override
			public void actionPerformed(ActionEvent e)
			{
				String title = frame.getTitle();

				if(title.contains("(Unsaved)"))
				{
					String data = textArea.getText();

					if(containsWord(title, "Untitled")) // this means that the file is not currently present anywhere in the system, as it is having 'Unsaved' and 'Untitled' together in the title
					{
						// prompt the user, asking him whether he/she wants to save the unsaved and untitled file

						int userChoice = JOptionPane.showConfirmDialog(frame, "Do you want to save the Untitled file?", "Confirmation", JOptionPane.YES_NO_OPTION);

						// check the user's choice and display the corresponding message

						if(userChoice == JOptionPane.YES_OPTION)
						{
							// same as save as

							// show the JFileChooser dialog

							int result = fileChooser.showSaveDialog(frame);

							if(result == fileChooser.APPROVE_OPTION)
							{
								// get the selected file

								File selectedFile = fileChooser.getSelectedFile();

								// get the filename

								String filename = selectedFile.getAbsolutePath();

								// add the absolute file path in the title bar of the notepad

								frame.setTitle(filename + " - JustNote (Saved)");

								// write the data from the current text area of the notepad to the file created

								try
								{
									// create an object of FileOutputStream class

									FileOutputStream fout = new FileOutputStream(filename);

									// create an object of BufferedOutputStream class

									BufferedOutputStream bout = new BufferedOutputStream(fout);

									// create a byte array containing the data

									byte[] b = data.getBytes();

									// write the data to the object of ByteOutputStream class

									bout.write(b);

									// flush the BufferedOutputStream

									bout.flush();

									// close the object of BufferedOutputStream class

									bout.close();

									// close the object of FileOutputStream class

									fout.close();
								}

								catch(Exception exc)
								{
									System.out.println(exc);
								}
							}

							openFile();
						}
						else // if the user doesn't want to save the untitled and unsaved file
						{
							openFile();
						}
					}
					else // if the file exists in the system but isn't updated as per the current modification(s)
					{
						// same as save

						String currFilePath = "";

						if(title.contains("(Unsaved)"))
						{
							currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"							
						}
						else if(title.contains("(Saved)"))
						{
							currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}

						// to get the name of the file

						File file = new File(currFilePath);

						String name_of_file = file.getName();

						int userChoice = JOptionPane.showConfirmDialog(frame, "Do you want to save changes to "+name_of_file, "Confirmation", JOptionPane.YES_NO_OPTION);

						if(userChoice == JOptionPane.YES_OPTION)
						{
							frame.setTitle(title.substring(0, title.length() - 8) + "Saved)");

							// write the data from the text area of the notepad to the file currently opened in the notepad

							try
							{
								// create an object of FileOutputStream

								FileOutputStream fout = new FileOutputStream(currFilePath);

								// create an object of BufferedOutputStream

								BufferedOutputStream bout = new BufferedOutputStream(fout);

								// create a byte array containing the String 'data', using the method getBytes()

								byte[] b = data.getBytes();

								// write the data to the object of ByteOutputStream class

								bout.write(b);

								// flush the BufferedOutputStream

								bout.flush();

								// close the object of BufferedOutputStream class

								bout.close();

								// close the object of FileOutputStream class

								fout.close();
							}

							catch(Exception exc)
							{
								System.out.println(exc);
							}

							openFile();
						}
						else // if the user doesn't want to save the currently unsaved file
						{
							openFile();
						}
					}
				}
				else // if the current file is already saved
				{
					openFile();
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
					currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
				}
				else if(title.contains("(Saved)"))
				{
					currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
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

						frame.setTitle(filename+" - JustNote (Saved)");

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

					frame.setTitle(filename+" - JustNote (Saved)");

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
						System.out.println(e);
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
					if(s.startsWith(word, index) && s.charAt(index + word.length()) == ' ')
					{
						return true;
					}

					index++;
				}

				return false;

			}

			public void clearTextArea()
			{
				// clear the current contents of the text area

				textArea.setText("");

				// set the title of the JFrame of the notepad to the program's default Jframe title

				frame.setTitle("Untitled - JustNote (Unsaved)");
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
						// prompt the user, asking him whether he/she wants to save the unsaved and untitled file

						int userChoice = JOptionPane.showConfirmDialog(frame,"Do you want to save the Untitled file?","Confirmation",JOptionPane.YES_NO_OPTION);

						// check the user's choice and display the corresponding message

						if(userChoice == JOptionPane.YES_OPTION)
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

								// get the name of the file

								String name_of_file = selectedFile.getName();

								// add the absolute file path in the title bar of the notepad

								frame.setTitle(filename + " - JustNote (Saved)");

								// write the data from the current text area of the notepad to the file created

								try
								{
									// create an object of FileOutputStream class

									FileOutputStream fout = new FileOutputStream(filename);

									// create an object of BufferedOutputStream class

									BufferedOutputStream bout = new BufferedOutputStream(fout);

									// create a byte array containing the data

									byte[] b = data.getBytes();

									// write the data to the object of BufferedOutputStream

									bout.write(b);

									// flush the BufferedOutputStream

									bout.flush();

									// close the object of BufferedOutputStream class

									bout.close();

									// close the object of FileOutputStream class

									fout.close();
								}

								catch(Exception e)
								{
									System.out.println(e);
								}

								try
								{
									// create a new font config file

									File configFile = new File("./config/fontConfig/"+name_of_file+"-config.txt");

									FileOutputStream fout = new FileOutputStream(configFile);

									BufferedOutputStream bout = new BufferedOutputStream(fout);

									String fontConfigData = "Consolas,0,20";

									byte[] b = fontConfigData.getBytes(); 

									bout.write(b);

									bout.flush();

									bout.close();

									fout.close();
								}

								catch(Exception e)
								{
									System.out.println(e);
								}

								clearTextArea();
							}
						}
						else
						{
							clearTextArea();
						}
					}
					else // if the file exists in the system but isn't updated as per the current modification(s)
					{
						// same as save

						String currFilePath = "";

						if(title.contains("(Unsaved)"))
						{
							currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}
						else if(title.contains("(Saved)"))
						{
							currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}

						// to get the name of the file

						File file = new File(currFilePath);

						String name_of_file = file.getName();

						int userChoice = JOptionPane.showConfirmDialog(frame,"Do you want to save changes to "+name_of_file,"Confirmation",JOptionPane.YES_NO_OPTION);

						if(userChoice == JOptionPane.YES_OPTION)
						{
							frame.setTitle(title.substring(0, title.length() - 8) + "Saved)");

							// write the data from the text area of the notepad to the file currently opened in the notepad

							try 
							{
								// create an object of FileOutputStream

								FileOutputStream fout = new FileOutputStream(currFilePath);

								// create an object of BufferedOutputStream

								BufferedOutputStream bout = new BufferedOutputStream(fout);

								// create a byte array containing the String 'data', using the method getBytes()

								byte[] b = data.getBytes();

								// write the data to the object of ByteOutputStream class

								bout.write(b);

								// flush the BufferedOutputStream

								bout.flush();

								// close the object of BufferedOutputStream class

								bout.close();

								// close the object of FileOutputStream class

								fout.close();
							}

							catch(Exception e)
							{
								System.out.println(e);
							}

							clearTextArea();
						}
						else
						{	
							clearTextArea();
						}
					}
				}
				else // if the current file is already saved
				{
					// let the data in the current pane be saved, if you are using Tabbed panes, and open a new tabbed pane having an empty text area

					clearTextArea();
				}
			}
		});

		exitItem.addActionListener(new ActionListener()
		{
			public boolean containsWord(String s, String word)
			{
				int index = 0;

				while(index < s.length())
				{
					if(s.startsWith(word, index) && s.charAt(index + word.length()) == ' ')
					{
						return true;
					}

					index++;
				}

				return false;

			}

			public void clearTextArea()
			{
				// clear the current contents of the text area

				textArea.setText("");

				// set the title of the JFrame of the notepad to the program's default Jframe title

				frame.setTitle("Untitled - JustNote (Unsaved)");
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
						// prompt the user, asking him whether he/she wants to save the unsaved and untitled file

						int userChoice = JOptionPane.showConfirmDialog(frame,"Do you want to save the Untitled file?","Confirmation",JOptionPane.YES_NO_OPTION);

						// check the user's choice and display the corresponding message

						if(userChoice == JOptionPane.YES_OPTION)
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

								// get the name of the file

								String name_of_file = selectedFile.getName();

								// add the absolute file path in the title bar of the notepad

								frame.setTitle(filename + " - JustNote (Saved)");

								// write the data from the current text area of the notepad to the file created

								try
								{
									// create an object of FileOutputStream class

									FileOutputStream fout = new FileOutputStream(filename);

									// create an object of BufferedOutputStream class

									BufferedOutputStream bout = new BufferedOutputStream(fout);

									// create a byte array containing the data

									byte[] b = data.getBytes();

									// write the data to the object of BufferedOutputStream

									bout.write(b);

									// flush the BufferedOutputStream

									bout.flush();

									// close the object of BufferedOutputStream class

									bout.close();

									// close the object of FileOutputStream class

									fout.close();
								}

								catch(Exception e)
								{
									System.out.println(e);
								}

								try
								{
									// create a new font config file

									File configFile = new File("./config/fontConfig/"+name_of_file+"-config.txt");

									FileOutputStream fout = new FileOutputStream(configFile);

									BufferedOutputStream bout = new BufferedOutputStream(fout);

									String fontConfigData = "Consolas,0,20";

									byte[] b = fontConfigData.getBytes();

									bout.write(b);

									bout.flush();

									bout.close();

									fout.close();
								}

								catch(Exception e)
								{
									System.out.println(e);
								}

								clearTextArea();
							}
						}
						else
						{
							clearTextArea();
						}
					}
					else // if the file exists in the system but isn't updated as per the current modification(s)
					{
						// same as save

						String currFilePath = "";

						if(title.contains("(Unsaved)"))
						{
							currFilePath = title.substring(0, title.length() - 21); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}
						else if(title.contains("(Saved)"))
						{
							currFilePath = title.substring(0, title.length() - 19); // extracts the filename from the title of the frame containing the line "<filename> - Notepad (Saved/Unsaved)"
						}

						// to get the name of the file

						File file = new File(currFilePath);

						String name_of_file = file.getName();

						int userChoice = JOptionPane.showConfirmDialog(frame,"Do you want to save changes to "+name_of_file,"Confirmation",JOptionPane.YES_NO_OPTION);

						if(userChoice == JOptionPane.YES_OPTION)
						{
							frame.setTitle(title.substring(0, title.length() - 8) + "Saved)");

							// write the data from the text area of the notepad to the file currently opened in the notepad

							try
							{
								// create an object of FileOutputStream

								FileOutputStream fout = new FileOutputStream(currFilePath);

								// create an object of BufferedOutputStream

								BufferedOutputStream bout = new BufferedOutputStream(fout);

								// create a byte array containing the String 'data', using the method getBytes()

								byte[] b = data.getBytes();

								// write the data to the object of ByteOutputStream class

								bout.write(b);

								// flush the BufferedOutputStream

								bout.flush();

								// close the object of BufferedOutputStream class

								bout.close();

								// close the object of FileOutputStream class

								fout.close();
							}

							catch(Exception e)
							{
								System.out.println(e);
							}

							clearTextArea();
						}
						else
						{
							clearTextArea();
						}
					}
				}

				// exit from the application (close it)

				System.exit(0); // if 0 is passed as argument (exit code), it indicates normal and successfull termination of the program, whereas 1 and -1 indicate abnormal termination.
			}
		});

		// below given lambda expression defines and represents the actionListener interface 
		// it is used here to define the functional interface (an interface having only one abstract method (here, actionPerformed() method))

		// when an action event is generated, the lambda expression is executed, and the dialog box is displayed.

		// where, e is the parameter of the lambda expression, it represents an object of ActionEvent, which is passed to the actionPerformed() method

		// and, fontDialog.setVisible(true) is the body of the lambda expression, since there is only one statement in the body,
		// therefore, we can skip the curly braces {}.

		fontItem.addActionListener(ae -> fontDialog.setVisible(true));

		// add JMenuItems to the File Menu

		fileMenu.add(newItem);

		fileMenu.addSeparator(); // adds a separator line

		fileMenu.add(openItem);

		fileMenu.addSeparator();

		fileMenu.add(saveItem);

		fileMenu.addSeparator();

		fileMenu.add(saveAsItem);

		fileMenu.addSeparator();

		fileMenu.add(exitItem);

		// add JMenuItems to the Edit Menu

		editMenu.add(findItem);

		// add JMenuItems to the Format Menu

		formatMenu.add(fontItem);

		// add the file menu to the menu bar

		menuBar.add(fileMenu);

		// add the edit menu to the menu bar

		menuBar.add(editMenu);

		// add the format menu to the menu bar

		menuBar.add(formatMenu);

		// set the menu bar for the JFrame

		frame.setJMenuBar(menuBar);

		/* new features */

//		menuBar.setBackground(new Color(64,64,64));
//		fileMenu.setForeground(Color.WHITE);
//		editMenu.setForeground(Color.WHITE);
//		formatMenu.setForeground(Color.WHITE);
//		textArea.setBackground(new Color(28,28,28));
//		textArea.setForeground(Color.WHITE);
//		textArea.setCaretColor(Color.WHITE);
//		UIManager.put("JButton.background", Color.BLACK);
//		UIManager.put("JButton.foreground", Color.WHITE);

//		FlatDarkLaf.setup(); //setting the look and feel
//		JFrame.setDefaultLookAndFeelDecorated(true);
//		frame.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(64,64,64));
//		frame.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.WHITE);

		// set the frame visibility to true

		frame.setVisible(true);
	}
}