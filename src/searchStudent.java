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

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import keeptoo.KButton;
import java.awt.Toolkit;


public class searchStudent extends JFrame {
	private JTextField textFieldName;
	private JTextField textFieldBranch;
	private JLabel lblYear;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JTable table;
	private JLabel lblNewLabel;
	/**
	 * @wbp.nonvisual location=-28,699
	 */
	private final JLabel label = new JLabel("");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(searchStudent.class.getResource("/res/butter.png")));
		setTitle("Search Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 686);
		getContentPane().setLayout(null);
		
		KButton btnSearchStudent = new KButton();
		btnSearchStudent.setText("Search Student");
		btnSearchStudent.kStartColor = new Color(47, 79, 79);
		btnSearchStudent.setkStartColor(new Color(47, 79, 79));
		btnSearchStudent.kPressedColor = new Color(135, 206, 250);
		btnSearchStudent.setkPressedColor(new Color(135, 206, 250));
		btnSearchStudent.kHoverStartColor = new Color(255, 250, 250);
		btnSearchStudent.setkHoverStartColor(new Color(153, 50, 204));
		btnSearchStudent.kHoverForeGround = Color.WHITE;
		btnSearchStudent.setkHoverForeGround(Color.WHITE);
		btnSearchStudent.kHoverEndColor = new Color(178, 34, 34);
		btnSearchStudent.setkHoverEndColor(new Color(178, 34, 34));
		btnSearchStudent.kHoverColor = new Color(64, 224, 208);
		btnSearchStudent.setkHoverColor(new Color(64, 224, 208));
		btnSearchStudent.kForeGround = Color.WHITE;
		btnSearchStudent.setkForeGround(Color.WHITE);
		btnSearchStudent.kEndColor = new Color(0, 128, 128);
		btnSearchStudent.setkEndColor(new Color(0, 128, 128));
		btnSearchStudent.kBorderRadius = 20;
		btnSearchStudent.setkBorderRadius(20);
		btnSearchStudent.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSearchStudent.setBounds(88, 322, 185, 45);
		getContentPane().add(btnSearchStudent);

		textFieldName = new JTextField();
		textFieldName.setForeground(new Color(255, 255, 255));
		textFieldName.setBackground(new Color(0, 0, 0, 40));
		textFieldName.setBounds(130, 97, 223, 27);
		getContentPane().add(textFieldName);
		textFieldName.setColumns(10);

		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setLabelFor(textFieldName);
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		lblName.setBounds(10, 97, 110, 27);
		getContentPane().add(lblName);

		textFieldBranch = new JTextField();
		textFieldBranch.setForeground(new Color(255, 255, 255));
		textFieldBranch.setBackground(new Color(0, 0, 0, 40));
		textFieldBranch.setBounds(130, 161, 223, 27);
		getContentPane().add(textFieldBranch);
		textFieldBranch.setColumns(10);

		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setForeground(new Color(255, 255, 255));
		lblBranch.setLabelFor(textFieldBranch);
		lblBranch.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBranch.setHorizontalAlignment(SwingConstants.LEFT);
		lblBranch.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		lblBranch.setBounds(10, 161, 110, 27);
		getContentPane().add(lblBranch);

		lblYear = new JLabel("Year:");
		lblYear.setForeground(new Color(255, 255, 255));
		lblYear.setVerticalAlignment(SwingConstants.BOTTOM);

		lblYear.setHorizontalAlignment(SwingConstants.LEFT);
		lblYear.setFont(new Font("Segoe UI Light", Font.PLAIN, 23));
		lblYear.setBounds(10, 224, 110, 27);
		getContentPane().add(lblYear);

		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0, 40));
		textField.setColumns(10);
		textField.setBounds(130, 224, 223, 27);
		getContentPane().add(textField);
		//Object[][] cellData = Student.searchDatabase(lblName.getText(), textFieldBranch.getText(), textField.getText());
		//

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0, 0));
		btnNewButton_1.setIcon(new ImageIcon(searchStudent.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Welcome();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(0, 0, 104, 37);
		getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(searchStudent.class.getResource("/res/Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg")));
		lblNewLabel.setBounds(0, 0, 1059, 636);
		getContentPane().add(lblNewLabel);
		

	}
}
