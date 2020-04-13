import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEmployee frame = new SearchEmployee();
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
	public SearchEmployee() {
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
		lblName.setBounds(10, 152, 110, 27);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 152, 223, 27);
		contentPane.add(textField);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDepartment.setBounds(10, 216, 110, 27);
		contentPane.add(lblDepartment);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 216, 223, 27);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton.setBounds(69, 325, 139, 37);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(414, 0, 651, 647);
		contentPane.add(panel);
		
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
	}
}
