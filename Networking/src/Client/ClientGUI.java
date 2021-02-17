package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Server.MsgReceive;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClientGUI extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_ip;
	private JTextField textField_port;
	JTextArea textArea;

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
					ClientGUI frame = new ClientGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	Client xClient;

	/**
	 * Create the frame.
	 */
	public ClientGUI()
	{
		setTitle("Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnConnect = new JButton("CONNECT");
		btnConnect.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				xClient = new Client(new MsgReceive()
				{
					

					public void getMsg(String s)
					{
						// when we get message
						textArea.setText(textArea.getText() + "\r\n" + s);
					}

				}, textField_ip.getText(), Integer.parseInt(textField_port.getText()) );
			}
		});
		btnConnect.setBounds(6, 6, 117, 29);
		contentPane.add(btnConnect);

		textArea = new JTextArea();
		textArea.setBounds(16, 47, 583, 306);
		contentPane.add(textArea);

		textField = new JTextField();
		textField.setBounds(26, 376, 395, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				xClient.send(textField.getText());
				textField.setText("");
			}
		});
		btnSend.setBounds(448, 376, 117, 29);
		contentPane.add(btnSend);

		textField_ip = new JTextField();
		textField_ip.setText("127.0.0.1");
		textField_ip.setBounds(160, 6, 130, 26);
		contentPane.add(textField_ip);
		textField_ip.setColumns(10);

		textField_port = new JTextField();
		textField_port.setText("1234");
		textField_port.setBounds(384, 6, 130, 26);
		contentPane.add(textField_port);
		textField_port.setColumns(10);
	}

}
