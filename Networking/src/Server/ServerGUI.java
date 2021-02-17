package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerGUI extends JFrame
{

	private JPanel contentPane;
	private JButton btnOpen;
	private JTextArea textArea;
	private JButton btnSend;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					ServerGUI frame = new ServerGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	Server xServer;
	/**
	 * Create the frame.
	 */
	public ServerGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xServer = new Server(new MsgReceive() {
					public void getMsg(String s)
					{
						textArea.setText(textArea.getText() + "\r\n client : " + s);
					}
				});
			}
		});
		btnOpen.setBounds(19, 20, 117, 29);
		contentPane.add(btnOpen);
		
		textArea = new JTextArea();
		textArea.setBounds(29, 51, 498, 248);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(39, 311, 336, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(xServer == null)
				{
					JOptionPane.showInternalMessageDialog(ServerGUI.this, "Please PUSH OPEN BTN FIRST");
					return;
				}
				xServer.sendAll(textField.getText());
				textField.setText("");
			}
		});
		btnSend.setBounds(399, 311, 117, 29);
		contentPane.add(btnSend);
	}
}
