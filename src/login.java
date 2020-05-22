import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import keeptoo.KTextField;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import keeptoo.KButton;
import java.awt.Toolkit;

public class login extends JFrame {

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
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/res/butter.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new java.awt.Color(0,0,0,40));
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(491, 59, 421, 439);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(250, 240, 230));
		textField.setBounds(143, 82, 214, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 240, 230));
		textField_1.setBounds(143, 169, 214, 41);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 21));
		lblNewLabel.setBounds(15, 92, 113, 31);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Candara", Font.BOLD, 21));
		lblPassword.setBounds(15, 179, 113, 31);
		panel_1.add(lblPassword);
		
		KButton btnLogin = new KButton();
		btnLogin.setkHoverForeGround(Color.WHITE);
		btnLogin.setkBorderRadius(25);
		btnLogin.setFont(new Font("Segoe UI Historic", Font.PLAIN, 24));
		btnLogin.setText("Login");
		btnLogin.setkHoverStartColor(new Color(139, 0, 0));
		btnLogin.setkHoverEndColor(new Color(218, 112, 214));
		btnLogin.setkEndColor(Color.PINK);
		btnLogin.setBounds(105, 275, 185, 45);
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_1 = new JLabel(" Sign In");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Candara Light", Font.BOLD, 30));
		lblNewLabel_1.setBounds(63, 59, 121, 60);
		panel.add(lblNewLabel_1);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\chaitanya\\Downloads\\Compressed\\SEIS-master\\SEIS-master\\Simple-HD-Wallpapers-Top-Free-Simple-HD-Backgrounds-.jpg"));
		background.setBounds(-26, -12, 1023, 571);
		panel.add(background);
	}
}
