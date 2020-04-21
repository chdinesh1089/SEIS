import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField name_field;
	private JTextField age_field;
	private JTextField roll_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(10, 88, 110, 27);
		contentPane.add(lblName);
		
		name_field = new JTextField();
		name_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		name_field.setColumns(10);
		name_field.setBounds(130, 88, 223, 27);
		contentPane.add(name_field);
		
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAge.setBounds(10, 170, 110, 27);
		contentPane.add(lblAge);
		
		age_field = new JTextField();
		age_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		age_field.setColumns(10);
		age_field.setBounds(130, 170, 223, 27);
		age_field.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyPressed(KeyEvent ke) {
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	               age_field.setEditable(true);
	            } else {
	               age_field.setText("0");
	            }
	        };
	    });
		contentPane.add(age_field);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGender.setBounds(10, 255, 110, 27);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(130, 270, 109, 23);
		contentPane.add(rdbtnFemale);
		rdbtnFemale.setActionCommand("F");
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(130, 244, 109, 23);
		contentPane.add(rdbtnMale);
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("M");
		
		ButtonGroup GenderBG = new ButtonGroup();
		GenderBG.add(rdbtnFemale);
		GenderBG.add(rdbtnMale);
		
		roll_field = new JTextField();
		roll_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		roll_field.setColumns(10);
		roll_field.setBounds(655, 88, 223, 27);
		contentPane.add(roll_field);
		
		JLabel lblRollNumber = new JLabel("Roll Number:");
		lblRollNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRollNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblRollNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRollNumber.setBounds(535, 88, 110, 27);
		contentPane.add(lblRollNumber);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBranch.setHorizontalAlignment(SwingConstants.LEFT);
		lblBranch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBranch.setBounds(535, 170, 110, 27);
		contentPane.add(lblBranch);
		
		String branches[] = { "CSE", "ECE", "EEE", "Mech", "Civil", "MME", "BioTech", "Chemical"}; 
		JComboBox branch_comboBox = new JComboBox(branches);
		branch_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		branch_comboBox.setBounds(655, 170, 223, 28);
		contentPane.add(branch_comboBox);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setVerticalAlignment(SwingConstants.BOTTOM);
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblYear.setBounds(535, 254, 110, 27);
		contentPane.add(lblYear);
		
		String years[] = {"I", "II", "III", "IV"};
		JComboBox year_comboBox = new JComboBox(years);
		year_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		year_comboBox.setBounds(655, 254, 223, 28);
		contentPane.add(year_comboBox);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Welcome();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 599, 104, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblAddedLabel = new JLabel("");
		lblAddedLabel.setBounds(443, 422, 92, 14);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Student std = new Student(name_field.getText(), Integer.parseInt(age_field.getText()), getGender(GenderBG));
				std.roll_number = roll_field.getText();
				std.branch = branches[branch_comboBox.getSelectedIndex()];
				std.year = years[year_comboBox.getSelectedIndex()];
				int added = std.addToDatabase();
				if (added==1){
					lblAddedLabel.setText("Added!");
				}
				else {
					lblAddedLabel.setText("Update Failed");
				}
				lblAddedLabel.setVisible(true);
				contentPane.add(lblAddedLabel);
				dispose();
				(new AddStudent()).setVisible(true);;
				}
				catch(Exception e) {
					lblAddedLabel.setText("Update Failed");
					contentPane.add(lblAddedLabel);
					System.out.println(e);
				}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(416, 388, 110, 37);
		contentPane.add(btnNewButton);
		

	}
	
	private char getGender(ButtonGroup g) {
		return g.getSelection().getActionCommand().charAt(0);
	}
}
