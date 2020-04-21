import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField departmentField;

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
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(130, 152, 223, 27);
		contentPane.add(nameField);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDepartment.setBounds(10, 216, 110, 27);
		contentPane.add(lblDepartment);
		
		departmentField = new JTextField();
		departmentField.setColumns(10);
		departmentField.setBounds(130, 216, 223, 27);
		contentPane.add(departmentField);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton.setBounds(69, 325, 139, 37);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[][] cellData = Employee.searchDatabase(nameField.getText(), departmentField.getText());
				//cellData[0][2]="j"; 
				
				Object[] columnNames = { "Name", "Age", "Gender", "Department", "Type", "Salary"};
			    JTable table = new JTable(cellData, columnNames);
			    table.setFillsViewportHeight(true);
			    table.setColumnSelectionAllowed(true);
			    table.setCellSelectionEnabled(true);
			    table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			    table.getTableHeader().setFont(new Font("Times New Roman", Font.PLAIN, 20));
			    
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(390, 0, 675, 647);
				scrollPane.setVisible(true);
				getContentPane().add(scrollPane);
			}
		});
		
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
