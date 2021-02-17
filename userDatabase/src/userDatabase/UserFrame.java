package userDatabase;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import m.UserDB;
import m.UserDBManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField text_id;
	private JTextField text_username;
	private JPasswordField passwordField;
	private JTable table;

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
					UserFrame frame = new UserFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 19, 325, 421);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int  index = table.getSelectedRow();
				//no one got select
				if(index == -1)
				{
					return;
				}
				DefaultTableModel model =  (DefaultTableModel)table.getModel();
				text_id.setText(""+model.getValueAt(index, 0));
				text_username.setText(""+model.getValueAt(index, 1));
				passwordField.setText(""+model.getValueAt(index, 2));
				comboBox.setSelectedItem(""+model.getValueAt(index, 3));


				
			}
		});
		
		scrollPane.setViewportView(table);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(352, 36, 81, 31);
		contentPane.add(lblId);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(347, 79, 61, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(347, 122, 61, 16);
		contentPane.add(lblPassword);
		
		JLabel lblUsertype = new JLabel("usertype");
		lblUsertype.setBounds(343, 162, 61, 16);
		contentPane.add(lblUsertype);
		
		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"admin", "user"}));
		comboBox.setBounds(423, 158, 106, 27);
		contentPane.add(comboBox);
		
		text_id = new JTextField();
		text_id.setEditable(false);
		text_id.setBounds(416, 38, 130, 26);
		contentPane.add(text_id);
		text_id.setColumns(10);
		
		text_username = new JTextField();
		text_username.setBounds(416, 79, 130, 26);
		contentPane.add(text_username);
		text_username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(420, 117, 109, 26);
		contentPane.add(passwordField);
		
		JButton btnInsertNewUser = new JButton("Insert new user");
		btnInsertNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDB x = new UserDB();//for keeping information
				x.Username = text_username.getText();
				x.Password = new String (passwordField.getPassword());
				x.UserType = (String)comboBox.getSelectedItem();
				
				UserDBManager.addNewUser(x);
				JOptionPane.showMessageDialog(UserFrame.this, "Inser Finsih!!");
				
				load_data();
				
			}
		});
		btnInsertNewUser.setBounds(343, 245, 146, 29);
		contentPane.add(btnInsertNewUser);
		
		JButton btnNewButton = new JButton("edit user");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDB x = new UserDB();//for keeping information
				x.id = Integer.parseInt(text_id.getText());
				x.Username = text_username.getText();
				x.Password = new String (passwordField.getPassword());
				x.UserType = (String)comboBox.getSelectedItem();
				
				UserDBManager.updateUser(x);
				JOptionPane.showMessageDialog(UserFrame.this, "Update Finsih!!");
				
				load_data();
			}
		});
		btnNewButton.setBounds(343, 286, 138, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(UserFrame.this,
						"Please confirm to deltel User?","confirm",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION)
				{
					int k = 0;
					if(!text_id.getText().matches("\\d+"))
					{
						JOptionPane.showMessageDialog(UserFrame.this, "Please select one row table!!!");
						return ;

					}
							
					UserDB x = new UserDB();
					x.id = Integer.parseInt(text_id.getText());
					UserDBManager.deleteUser(x);
					load_data();
				}
			}
		});
		btnNewButton_1.setBounds(352, 324, 117, 29);
		contentPane.add(btnNewButton_1);
	}
	ArrayList<UserDB> allUsers;
	private JComboBox<String> comboBox;
	public void load_data()
	{
		allUsers = UserDBManager.getAllUsers();
		
		//contain info
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("Username");
		model.addColumn("pass");
		model.addColumn("type");
		
		for(UserDB x: allUsers)
		{
			model.addRow(new Object[] {""+x.id,x.Username,x.Password,x.UserType});
		}
		table.setModel(model);
		
	}
}
