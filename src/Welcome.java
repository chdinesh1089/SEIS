import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1081, 686);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setBounds(305, 24, 434, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Choose what to do");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(450, 117, 171, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Search Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(new searchStudent()).setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(305, 214, 171, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSearchEmployee = new JButton("Search Employee");
		btnSearchEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(new SearchEmployee()).setVisible(true);
				frame.dispose();
			}
		});
		btnSearchEmployee.setBounds(305, 311, 171, 37);
		frame.getContentPane().add(btnSearchEmployee);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(new AddStudent()).setVisible(true);
				frame.dispose();
			}
		});
		btnAddStudent.setBounds(568, 214, 171, 37);
		frame.getContentPane().add(btnAddStudent);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(new AddEmployee()).setVisible(true);
				frame.dispose();
			}
		});
		btnAddEmployee.setBounds(568, 311, 171, 37);
		frame.getContentPane().add(btnAddEmployee);
	}
}
