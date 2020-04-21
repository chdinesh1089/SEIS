import java.lang.Thread;

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

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField name_field;
	private JTextField age_field;
	private JTextField salary_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
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
		lblName.setBounds(10, 108, 110, 27);
		contentPane.add(lblName);
		
		name_field = new JTextField();
		name_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		name_field.setColumns(10);
		name_field.setBounds(130, 108, 223, 27);
		contentPane.add(name_field);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAge.setBounds(10, 190, 110, 27);
		contentPane.add(lblAge);
		
		age_field = new JTextField();
		age_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		age_field.setColumns(10);
		age_field.setBounds(130, 190, 223, 27);
		contentPane.add(age_field);
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
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGender.setBounds(10, 275, 110, 27);
		contentPane.add(lblGender);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(130, 290, 109, 23);
		contentPane.add(rdbtnFemale);
		rdbtnFemale.setActionCommand("F");
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(130, 264, 109, 23);
		contentPane.add(rdbtnMale);
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("M");
		
		ButtonGroup GenderBG = new ButtonGroup();
		GenderBG.add(rdbtnFemale);
		GenderBG.add(rdbtnMale);
		
		salary_field = new JTextField();
		salary_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		salary_field.setColumns(10);
		salary_field.setBounds(655, 108, 223, 27);
		contentPane.add(salary_field);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSalary.setBounds(535, 108, 110, 27);
		contentPane.add(lblSalary);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDepartment.setBounds(535, 190, 110, 27);
		contentPane.add(lblDepartment);
	
		String branches[] = { "CSE", "ECE", "EEE", "Mech", "Civil", "MME", "BioTech", "Chemical"}; 		
		JComboBox dep_comboBox = new JComboBox(branches);
		dep_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dep_comboBox.setBounds(655, 190, 223, 28);
		contentPane.add(dep_comboBox);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setVerticalAlignment(SwingConstants.BOTTOM);
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblType.setBounds(535, 274, 110, 27);
		contentPane.add(lblType);
		
		String emp_type[] = {"Permanent", "Temporary"};
		JComboBox type_comboBox = new JComboBox(emp_type);
		type_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		type_comboBox.setBounds(655, 274, 223, 28);
		contentPane.add(type_comboBox);
		
		JLabel lblAddedLabel = new JLabel("");
		lblAddedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddedLabel.setBounds(423, 422, 92, 14);
		contentPane.add(lblAddedLabel);
		
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
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				Employee emp = new Employee(name_field.getText(), Integer.parseInt(age_field.getText()), getGender(GenderBG));
				emp.salary = salary_field.getText();
				emp.type = emp_type[type_comboBox.getSelectedIndex()];
				emp.department = branches[dep_comboBox.getSelectedIndex()];
				emp.print();
				int added = emp.addToDatabase();
				if (added==1){
					lblAddedLabel.setText("Added!");
				}
				else {
					lblAddedLabel.setText("Update Failed");
				}
				lblAddedLabel.setVisible(true);
				contentPane.add(lblAddedLabel);
				dispose();
				(new AddEmployee()).setVisible(true);
			}
			catch(Exception e) {
				lblAddedLabel.setText("Update Failed");
				contentPane.add(lblAddedLabel);
			}
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(423, 374, 92, 37);
		contentPane.add(btnNewButton);
		
		
	}
	
	private char getGender(ButtonGroup g) {
		return g.getSelection().getActionCommand().charAt(0);
	}
}
