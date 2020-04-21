import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class searchStudent extends JFrame {
	private JTextField textFieldName;
	private JTextField textFieldBranch;
	private JLabel lblYear;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchStudent frame = new searchStudent();
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
	public searchStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 686);
		getContentPane().setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(130, 97, 223, 27);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setLabelFor(textFieldName);
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(10, 97, 110, 27);
		getContentPane().add(lblName);
		
		textFieldBranch = new JTextField();
		textFieldBranch.setBounds(130, 161, 223, 27);
		getContentPane().add(textFieldBranch);
		textFieldBranch.setColumns(10);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setLabelFor(textFieldBranch);
		lblBranch.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBranch.setHorizontalAlignment(SwingConstants.LEFT);
		lblBranch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBranch.setBounds(10, 161, 110, 27);
		getContentPane().add(lblBranch);
		
		lblYear = new JLabel("Year:");
		lblYear.setVerticalAlignment(SwingConstants.BOTTOM);
		
		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblYear.setBounds(10, 224, 110, 27);
		getContentPane().add(lblYear);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 224, 223, 27);
		getContentPane().add(textField);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(62, 321, 139, 37);
		getContentPane().add(btnNewButton);
		//Object[][] cellData={{"","","","","",""}};
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[][] cellData = Student.searchDatabase(lblName.getText(), textFieldBranch.getText(), textField.getText());
				//cellData[0][2]="j"; 
				
				Object[] columnNames = { "Name", "Age", "Gender", "Roll Number", "Branch", "Year"};
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
		//Object[][] cellData = Student.searchDatabase(lblName.getText(), textFieldBranch.getText(), textField.getText());
		//
	    
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Welcome();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 599, 104, 37);
		getContentPane().add(btnNewButton_1);
		

	}
}
