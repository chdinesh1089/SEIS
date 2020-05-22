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
import javax.swing.ImageIcon;
import java.awt.Color;
import keeptoo.KButton;
import keeptoo.KTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

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
		setTitle("Add Employee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddEmployee.class.getResource("/keeptoo/resources/icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KButton btnAddStudent = new KButton();
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setFont(new Font("Candara", Font.PLAIN, 23));
		lblDepartment.setBounds(477, 195, 139, 27);
		contentPane.add(lblDepartment);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setVerticalAlignment(SwingConstants.BOTTOM);
		lblType.setHorizontalAlignment(SwingConstants.LEFT);
		lblType.setForeground(Color.WHITE);
		lblType.setFont(new Font("Candara", Font.PLAIN, 23));
		lblType.setBounds(534, 276, 72, 27);
		contentPane.add(lblType);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSalary.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Candara", Font.PLAIN, 23));
		lblSalary.setBounds(534, 111, 72, 27);
		contentPane.add(lblSalary);
		btnAddStudent.setText("Add Employee");
		btnAddStudent.kStartColor = new Color(47, 79, 79);
		btnAddStudent.setkStartColor(new Color(47, 79, 79));
		btnAddStudent.kPressedColor = new Color(135, 206, 250);
		btnAddStudent.setkPressedColor(new Color(135, 206, 250));
		btnAddStudent.kHoverStartColor = new Color(255, 250, 250);
		btnAddStudent.setkHoverStartColor(new Color(139, 0, 0));
		btnAddStudent.kHoverForeGround = Color.WHITE;
		btnAddStudent.setkHoverForeGround(Color.WHITE);
		btnAddStudent.kHoverEndColor = new Color(178, 34, 34);
		btnAddStudent.setkHoverEndColor(new Color(218, 112, 214));
		btnAddStudent.kHoverColor = new Color(64, 224, 208);
		btnAddStudent.setkHoverColor(new Color(64, 224, 208));
		btnAddStudent.kForeGround = Color.WHITE;
		btnAddStudent.setkForeGround(Color.WHITE);
		btnAddStudent.kEndColor = new Color(0, 128, 128);
		btnAddStudent.setkEndColor(new Color(0, 128, 128));
		btnAddStudent.kBorderRadius = 20;
		btnAddStudent.setkBorderRadius(20);
		btnAddStudent.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAddStudent.setBounds(371, 402, 185, 45);
		contentPane.add(btnAddStudent);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setVerticalAlignment(SwingConstants.BOTTOM);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Candara", Font.PLAIN, 23));
		lblGender.setBounds(28, 265, 92, 27);
		contentPane.add(lblGender);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setVerticalAlignment(SwingConstants.BOTTOM);
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Candara", Font.PLAIN, 23));
		lblAge.setBounds(28, 193, 72, 27);
		contentPane.add(lblAge);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Candara", Font.PLAIN, 23));
		lblName.setBounds(28, 109, 72, 27);
		contentPane.add(lblName);
		
		name_field = new JTextField();
		name_field.setBackground( new java.awt.Color(0,0,0,40));
		name_field.setForeground(Color.WHITE);
		name_field.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		name_field.setColumns(10);
		name_field.setBounds(130, 108, 223, 27);
		contentPane.add(name_field);
		
		age_field = new JTextField();
		age_field.setForeground(Color.WHITE);
		age_field.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		age_field.setBackground(new java.awt.Color(0,0,0,40));
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
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		
		
		rdbtnFemale.setForeground(Color.WHITE);
		rdbtnFemale.setBackground(new Color(47, 79, 79));
		rdbtnFemale.setBounds(157, 291, 92, 23);
		contentPane.add(rdbtnFemale);
		rdbtnFemale.setActionCommand("F");
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setForeground(Color.WHITE);
		rdbtnMale.setBackground(new Color(47, 79, 79));
		rdbtnMale.setBounds(275, 291, 92, 23);
		contentPane.add(rdbtnMale);
		rdbtnMale.setSelected(true);
		rdbtnMale.setActionCommand("M");
		
		ButtonGroup GenderBG = new ButtonGroup();
		GenderBG.add(rdbtnFemale);
		GenderBG.add(rdbtnMale);
		
		salary_field = new JTextField();
		salary_field.setBackground(new java.awt.Color(0,0,0,40));
		salary_field.setForeground(Color.WHITE);
		salary_field.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		salary_field.setColumns(10);
		salary_field.setBounds(655, 108, 223, 27);
		contentPane.add(salary_field);
	
		String branches[] = { "CSE", "ECE", "EEE", "Mech", "Civil", "MME", "BioTech", "Chemical"}; 		
		JComboBox dep_comboBox = new JComboBox(branches);
		dep_comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		dep_comboBox.setBounds(655, 190, 223, 28);
		contentPane.add(dep_comboBox);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddEmployee.class.getResource("/res/Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg")));
		lblNewLabel.setBounds(0, 0, 978, 544);
		contentPane.add(lblNewLabel);
		
		
	}
	
	private char getGender(ButtonGroup g) {
		return g.getSelection().getActionCommand().charAt(0);
	}
}
