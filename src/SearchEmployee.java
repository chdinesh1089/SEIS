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
import javax.swing.ImageIcon;
import java.awt.Color;
import keeptoo.KButton;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(SearchEmployee.class.getResource("/res/butter.png")));
		setTitle("Search Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 686);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KButton btnSearchEmployee = new KButton();
		btnSearchEmployee.setText("Search Employee");
		btnSearchEmployee.kStartColor = new Color(47, 79, 79);
		btnSearchEmployee.setkStartColor(new Color(47, 79, 79));
		btnSearchEmployee.kPressedColor = new Color(135, 206, 250);
		btnSearchEmployee.setkPressedColor(new Color(135, 206, 250));
		btnSearchEmployee.kHoverStartColor = new Color(255, 250, 250);
		btnSearchEmployee.setkHoverStartColor(new Color(139, 69, 19));
		btnSearchEmployee.kHoverForeGround = Color.WHITE;
		btnSearchEmployee.setkHoverForeGround(Color.WHITE);
		btnSearchEmployee.kHoverEndColor = new Color(178, 34, 34);
		btnSearchEmployee.setkHoverEndColor(new Color(165, 42, 42));
		btnSearchEmployee.kHoverColor = new Color(64, 224, 208);
		btnSearchEmployee.setkHoverColor(new Color(64, 224, 208));
		btnSearchEmployee.kForeGround = Color.WHITE;
		btnSearchEmployee.setkForeGround(Color.WHITE);
		btnSearchEmployee.kEndColor = new Color(0, 128, 128);
		btnSearchEmployee.setkEndColor(new Color(0, 128, 128));
		btnSearchEmployee.kBorderRadius = 20;
		btnSearchEmployee.setkBorderRadius(20);
		btnSearchEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSearchEmployee.setBounds(109, 326, 185, 45);
		contentPane.add(btnSearchEmployee);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		lblName.setBounds(10, 152, 110, 27);
		contentPane.add(lblName);
		
		nameField = new JTextField();
		nameField.setForeground(new Color(255, 255, 255));
		nameField.setBackground(new Color(0, 0, 0, 40));
		nameField.setColumns(10);
		nameField.setBounds(180, 152, 200, 27);
		contentPane.add(nameField);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDepartment.setHorizontalAlignment(SwingConstants.LEFT);
		lblDepartment.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		lblDepartment.setBounds(10, 216, 155, 27);
		contentPane.add(lblDepartment);
		
		departmentField = new JTextField();
		departmentField.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		departmentField.setForeground(new Color(255, 255, 255));
		departmentField.setBackground(new Color(0, 0, 0, 40));
		departmentField.setColumns(10);
		departmentField.setBounds(180, 216, 200, 27);
		contentPane.add(departmentField);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1.setIcon(new ImageIcon(SearchEmployee.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Welcome();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(15, 16, 68, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(SearchEmployee.class.getResource("/res/Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg")));
		lblNewLabel.setBounds(0, 0, 1065, 636);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(414, 0, 651, 630);
		contentPane.add(panel);
	}
}
