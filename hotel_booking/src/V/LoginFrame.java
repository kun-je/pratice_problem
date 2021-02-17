package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M.CustomerManager;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_id;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_id = new JTextField();
		textField_id.setBounds(175, 50, 135, 34);
		contentPane.add(textField_id);
		textField_id.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER)
				{
					check();
				}
			}
		});
		passwordField.setBounds(175, 110, 135, 34);
		contentPane.add(passwordField);

		JLabel lblId = new JLabel("id");
		lblId.setBounds(45, 55, 61, 16);
		contentPane.add(lblId);

		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(45, 119, 61, 16);
		contentPane.add(lblPassword);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
			}
		});
		btnNewButton.setBounds(45, 193, 117, 29);
		contentPane.add(btnNewButton);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(238, 193, 117, 29);
		contentPane.add(btnExit);
	}
	
	public void check()
	{
		if (CustomerManager.checkLogin(Integer.parseInt(textField_id.getText()),
				new String(passwordField.getPassword())))
		{
			StatusFrame f = new StatusFrame();
			f.setVisible(true);
			LoginFrame.this.setVisible(false);
		} 
		else
		{
			JOptionPane.showMessageDialog(LoginFrame.this, "your id or password incorrect");
		}
	}
}
