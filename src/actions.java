import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import keeptoo.KButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class actions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actions frame = new actions();
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
	public actions() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(actions.class.getResource("/res/butter.png")));
		setTitle("actions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1114, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KButton btnAddStudent = new KButton();
		btnAddStudent.setText("Add student");
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
		btnAddStudent.setBounds(64, 308, 185, 45);
		contentPane.add(btnAddStudent);
		
		KButton btnRemoveStudent = new KButton();
		btnRemoveStudent.setText("Remove Student");
		btnRemoveStudent.kStartColor = new Color(47, 79, 79);
		btnRemoveStudent.setkStartColor(new Color(47, 79, 79));
		btnRemoveStudent.kPressedColor = new Color(135, 206, 250);
		btnRemoveStudent.setkPressedColor(new Color(135, 206, 250));
		btnRemoveStudent.kHoverStartColor = new Color(255, 250, 250);
		btnRemoveStudent.setkHoverStartColor(new Color(255, 250, 250));
		btnRemoveStudent.kHoverForeGround = Color.WHITE;
		btnRemoveStudent.setkHoverForeGround(Color.WHITE);
		btnRemoveStudent.kHoverEndColor = new Color(178, 34, 34);
		btnRemoveStudent.setkHoverEndColor(new Color(178, 34, 34));
		btnRemoveStudent.kHoverColor = new Color(64, 224, 208);
		btnRemoveStudent.setkHoverColor(new Color(64, 224, 208));
		btnRemoveStudent.kForeGround = Color.WHITE;
		btnRemoveStudent.setkForeGround(Color.WHITE);
		btnRemoveStudent.kEndColor = new Color(0, 128, 128);
		btnRemoveStudent.setkEndColor(new Color(0, 128, 128));
		btnRemoveStudent.kBorderRadius = 20;
		btnRemoveStudent.setkBorderRadius(20);
		btnRemoveStudent.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnRemoveStudent.setBounds(64, 420, 185, 45);
		contentPane.add(btnRemoveStudent);
		
		JLabel lblNewLabel_2 = new JLabel("Choose any action");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Candara", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(462, 165, 206, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 46));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(452, 74, 260, 72);
		contentPane.add(lblNewLabel_1);
		
		KButton btnSearchStudent = new KButton();
		btnSearchStudent.kHoverColor = new Color(64, 224, 208);
		btnSearchStudent.kForeGround = new Color(255, 255, 255);
		btnSearchStudent.setkHoverColor(new Color(32, 178, 170));
		btnSearchStudent.setText("Search student");
		btnSearchStudent.kStartColor = new Color(47, 79, 79);
		btnSearchStudent.setkStartColor(new Color(47, 79, 79));
		btnSearchStudent.kPressedColor = new Color(135, 206, 250);
		btnSearchStudent.setkPressedColor(new Color(173, 216, 230));
		btnSearchStudent.kHoverStartColor = new Color(255, 250, 250);
		btnSearchStudent.setkHoverStartColor(new Color(102, 205, 170));
		btnSearchStudent.kHoverForeGround = Color.WHITE;
		btnSearchStudent.setkHoverForeGround(Color.WHITE);
		btnSearchStudent.kHoverEndColor = new Color(178, 34, 34);
		btnSearchStudent.setkHoverEndColor(new Color(165, 42, 42));
		btnSearchStudent.kEndColor = new Color(0, 128, 128);
		btnSearchStudent.setkEndColor(new Color(0, 128, 128));
		btnSearchStudent.kBorderRadius = 20;
		btnSearchStudent.setkBorderRadius(30);
		btnSearchStudent.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSearchStudent.setBounds(64, 198, 185, 45);
		contentPane.add(btnSearchStudent);
		
		KButton btnSearchEmployee = new KButton();
		btnSearchEmployee.setText("Search Employee");
		btnSearchEmployee.kStartColor = new Color(47, 79, 79);
		btnSearchEmployee.setkStartColor(new Color(47, 79, 79));
		btnSearchEmployee.kPressedColor = new Color(135, 206, 250);
		btnSearchEmployee.setkPressedColor(new Color(135, 206, 250));
		btnSearchEmployee.kHoverStartColor = new Color(255, 250, 250);
		btnSearchEmployee.setkHoverStartColor(new Color(255, 250, 250));
		btnSearchEmployee.kHoverForeGround = Color.WHITE;
		btnSearchEmployee.setkHoverForeGround(Color.WHITE);
		btnSearchEmployee.kHoverEndColor = new Color(178, 34, 34);
		btnSearchEmployee.setkHoverEndColor(new Color(178, 34, 34));
		btnSearchEmployee.kHoverColor = new Color(64, 224, 208);
		btnSearchEmployee.setkHoverColor(new Color(64, 224, 208));
		btnSearchEmployee.kForeGround = Color.WHITE;
		btnSearchEmployee.setkForeGround(Color.WHITE);
		btnSearchEmployee.kEndColor = new Color(0, 128, 128);
		btnSearchEmployee.setkEndColor(new Color(0, 128, 128));
		btnSearchEmployee.kBorderRadius = 20;
		btnSearchEmployee.setkBorderRadius(20);
		btnSearchEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSearchEmployee.setBounds(851, 198, 185, 45);
		contentPane.add(btnSearchEmployee);
		
		KButton btnAddEmployee = new KButton();
		btnAddEmployee.setText("Add employee");
		btnAddEmployee.kStartColor = new Color(47, 79, 79);
		btnAddEmployee.setkStartColor(new Color(47, 79, 79));
		btnAddEmployee.kPressedColor = new Color(135, 206, 250);
		btnAddEmployee.setkPressedColor(new Color(135, 206, 250));
		btnAddEmployee.kHoverStartColor = new Color(255, 250, 250);
		btnAddEmployee.setkHoverStartColor(new Color(255, 250, 250));
		btnAddEmployee.kHoverForeGround = Color.WHITE;
		btnAddEmployee.setkHoverForeGround(Color.WHITE);
		btnAddEmployee.kHoverEndColor = new Color(178, 34, 34);
		btnAddEmployee.setkHoverEndColor(new Color(178, 34, 34));
		btnAddEmployee.kHoverColor = new Color(64, 224, 208);
		btnAddEmployee.setkHoverColor(new Color(64, 224, 208));
		btnAddEmployee.kForeGround = Color.WHITE;
		btnAddEmployee.setkForeGround(Color.WHITE);
		btnAddEmployee.kEndColor = new Color(0, 128, 128);
		btnAddEmployee.setkEndColor(new Color(0, 128, 128));
		btnAddEmployee.kBorderRadius = 20;
		btnAddEmployee.setkBorderRadius(20);
		btnAddEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAddEmployee.setBounds(851, 308, 185, 45);
		contentPane.add(btnAddEmployee);
		
		KButton btnRemoveEmployee = new KButton();
		btnRemoveEmployee.setText("Remove employee");
		btnRemoveEmployee.kStartColor = new Color(47, 79, 79);
		btnRemoveEmployee.setkStartColor(new Color(47, 79, 79));
		btnRemoveEmployee.kPressedColor = new Color(135, 206, 250);
		btnRemoveEmployee.setkPressedColor(new Color(135, 206, 250));
		btnRemoveEmployee.kHoverStartColor = new Color(255, 250, 250);
		btnRemoveEmployee.setkHoverStartColor(new Color(255, 250, 250));
		btnRemoveEmployee.kHoverForeGround = Color.WHITE;
		btnRemoveEmployee.setkHoverForeGround(Color.WHITE);
		btnRemoveEmployee.kHoverEndColor = new Color(178, 34, 34);
		btnRemoveEmployee.setkHoverEndColor(new Color(178, 34, 34));
		btnRemoveEmployee.kHoverColor = new Color(64, 224, 208);
		btnRemoveEmployee.setkHoverColor(new Color(64, 224, 208));
		btnRemoveEmployee.kForeGround = Color.WHITE;
		btnRemoveEmployee.setkForeGround(Color.WHITE);
		btnRemoveEmployee.kEndColor = new Color(0, 128, 128);
		btnRemoveEmployee.setkEndColor(new Color(0, 128, 128));
		btnRemoveEmployee.kBorderRadius = 20;
		btnRemoveEmployee.setkBorderRadius(20);
		btnRemoveEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnRemoveEmployee.setBounds(851, 420, 185, 45);
		contentPane.add(btnRemoveEmployee);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chaitanya\\Downloads\\Compressed\\SEIS-master\\SEIS-master\\Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg"));
		lblNewLabel.setBounds(0, 0, 1092, 637);
		contentPane.add(lblNewLabel);
	}
}
