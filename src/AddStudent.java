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
import java.awt.Color;
import keeptoo.KButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class AddStudent extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddStudent.class.getResource("/res/butter.png")));
		setTitle("Add Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		getContentPane().setLayout(null);
		
		KButton btnAddStudent = new KButton();
		btnAddStudent.setText("Add Student");
		btnAddStudent.kStartColor = new Color(47, 79, 79);
		btnAddStudent.setkStartColor(new Color(47, 79, 79));
		btnAddStudent.kPressedColor = new Color(135, 206, 250);
		btnAddStudent.setkPressedColor(new Color(135, 206, 250));
		btnAddStudent.kHoverStartColor = new Color(255, 250, 250);
		btnAddStudent.setkHoverStartColor(new Color(255, 250, 250));
		btnAddStudent.kHoverForeGround = Color.WHITE;
		btnAddStudent.setkHoverForeGround(Color.WHITE);
		btnAddStudent.kHoverEndColor = new Color(178, 34, 34);
		btnAddStudent.setkHoverEndColor(new Color(178, 34, 34));
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
		getContentPane().add(btnAddStudent);
		
		JLabel label = new JLabel("Name:");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Candara", Font.PLAIN, 23));
		label.setBounds(28, 109, 72, 27);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBackground(new Color(0, 0, 0, 40));
		textField.setBounds(130, 108, 223, 27);
		getContentPane().add(textField);
		
		JLabel lblRollNumber = new JLabel("Roll Number :");
		lblRollNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRollNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblRollNumber.setForeground(Color.WHITE);
		lblRollNumber.setFont(new Font("Candara", Font.PLAIN, 23));
		lblRollNumber.setBounds(468, 109, 148, 27);
		getContentPane().add(lblRollNumber);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 0, 40));
		textField_1.setBounds(655, 108, 223, 27);
		getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setBounds(655, 190, 223, 28);
		getContentPane().add(comboBox);
		
		JLabel label_2 = new JLabel("Age:");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Candara", Font.PLAIN, 23));
		label_2.setBounds(28, 193, 72, 27);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Gender:");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Candara", Font.PLAIN, 23));
		label_3.setBounds(28, 265, 92, 27);
		getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(0, 0, 0, 40));
		textField_2.setBounds(130, 190, 223, 27);
		getContentPane().add(textField_2);
		
		JRadioButton radioButton = new JRadioButton("female");
		radioButton.setForeground(Color.WHITE);
		radioButton.setBackground(new Color(47, 79, 79));
		radioButton.setActionCommand("F");
		radioButton.setBounds(157, 291, 92, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("male");
		radioButton_1.setSelected(true);
		radioButton_1.setForeground(Color.WHITE);
		radioButton_1.setBackground(new Color(47, 79, 79));
		radioButton_1.setActionCommand("M");
		radioButton_1.setBounds(275, 291, 92, 23);
		getContentPane().add(radioButton_1);
		
		JLabel lblBran = new JLabel("Year:");
		lblBran.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBran.setHorizontalAlignment(SwingConstants.LEFT);
		lblBran.setForeground(Color.WHITE);
		lblBran.setFont(new Font("Candara", Font.PLAIN, 23));
		lblBran.setBounds(534, 276, 72, 27);
		getContentPane().add(lblBran);
		
		JLabel label_5 = new JLabel("Department :");
		label_5.setVerticalAlignment(SwingConstants.BOTTOM);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Candara", Font.PLAIN, 23));
		label_5.setBounds(477, 195, 139, 27);
		getContentPane().add(label_5);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setBounds(655, 274, 223, 28);
		getContentPane().add(comboBox_1);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(AddStudent.class.getResource("/res/Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg")));
		label_6.setBounds(0, 0, 978, 544);
		getContentPane().add(label_6);
		
		String branches[] = { "CSE", "ECE", "EEE", "Mech", "Civil", "MME", "BioTech", "Chemical"};
		
		String years[] = {"I", "II", "III", "IV"};
		
		JLabel lblAddedLabel = new JLabel("");
		lblAddedLabel.setBounds(443, 422, 92, 14);
		

	}
	
	private char getGender(ButtonGroup g) {
		return g.getSelection().getActionCommand().charAt(0);
	}
}
