//Author Name: George Harrington
//Date: 1/27/2019
//Program Name: Spell Checker
//Purpose: Check a file against a dictionary.

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class appWindow {

	private JFrame frmSpellChecker;
	private JTextField textField;
	private JTextField textField_1;
	public String string01;
	public String string02;
	public ArrayList<String> AL01 = new ArrayList();
	public ArrayList<String> AL02 = new ArrayList();
	public ArrayList<String> AL03 = new ArrayList();
//	public int x = 0; // AL01 index
//	public int y = 0; // AL02 index
//	public int z = 0; // AL03 index

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appWindow window = new appWindow();
					window.frmSpellChecker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public appWindow() {
		initialize();
	}
	
	public void loadDictionary() {
		BufferedReader br01 = null;
		try {
			br01 = new BufferedReader(new FileReader("C:\\Users\\maleh\\Desktop\\module_03\\dictionary.txt"));
			String line;
			
			while ((line = br01.readLine()) != null) {
				AL01.add(line);
//				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br01.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void loadFile2Check() {
		BufferedReader br02 = null;
		try {
			br02 = new BufferedReader(new FileReader("C:\\Users\\maleh\\Desktop\\module_03\\testStates.txt"));
			String line;
			
			while ((line = br02.readLine()) != null) {
				AL02.add(line);
//				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br02.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void spellingError(String word) {
		// when a spelling error is found, the word will be passed here, inserted into AL03, and the index for AL03 will be incremented.
		AL03.add(word);
		System.out.println(word);
	}
	
	public void compareLists() {
		
		for (int y = 0; y < AL02.size(); y++) {
			boolean wordFound = false;
			String checkWord = AL02.get(y);
			
			for (int x = 0; x < AL01.size(); x++) {

				String dictionaryWord = AL01.get(x);
				if (dictionaryWord.equals(checkWord)) {
					wordFound = true;
				}
			}
			
			if (wordFound == false) {
				spellingError(checkWord);
			}
		}
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpellChecker = new JFrame();
		frmSpellChecker.setTitle("Spell Checker");
		frmSpellChecker.setBounds(100, 100, 450, 300);
		frmSpellChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box verticalBox_2 = Box.createVerticalBox();
		frmSpellChecker.getContentPane().add(verticalBox_2, BorderLayout.NORTH);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox);
		
		Box verticalBox = Box.createVerticalBox();
		horizontalBox.add(verticalBox);
		
		JLabel lblDictionary = new JLabel("Dictionary");
		verticalBox.add(lblDictionary);
		
		textField = new JTextField();
		verticalBox.add(textField);
		textField.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalBox.add(horizontalStrut);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox.add(verticalBox_1);
		
		JLabel lblFileCheck = new JLabel("File 2 Check");
		verticalBox_1.add(lblFileCheck);
		
		textField_1 = new JTextField();
		verticalBox_1.add(textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut);
		
		JButton btnCheckFile = new JButton("Check File");
		
		btnCheckFile.setAlignmentY(Component.TOP_ALIGNMENT);
		btnCheckFile.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2.add(btnCheckFile);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_2.add(verticalStrut_2);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		frmSpellChecker.getContentPane().add(panel, BorderLayout.CENTER);
		
		JTextPane txtpnFiller = new JTextPane();
		txtpnFiller.setEditable(false);
		txtpnFiller.setText("Check File to find spelling errors.");
		panel.add(txtpnFiller);
		
		btnCheckFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this is where the code goes that makes everything works.
				
				//open dictionary
				loadDictionary(); //loads file directly into array list
				
				//load file2check
				loadFile2Check(); //loads file directly into array list
				
				//begin compare loop
				compareLists();
				txtpnFiller.setText("Operation Complete.");
			}
		});
	}

}
