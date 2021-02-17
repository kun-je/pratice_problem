package V;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import M.CustomerDB;
import M.CustomerManager;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

					CustomerFrame frame = new CustomerFrame();
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

	JTable table;

	public CustomerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextField textField_id = new JTextField();
		textField_id.setBackground(Color.ORANGE);
		textField_id.setEditable(false);
		textField_id.setBounds(580, 18, 130, 26);
		contentPane.add(textField_id);
		textField_id.setColumns(10);

		JTextField textField_name = new JTextField();
		textField_name.setBounds(580, 68, 130, 26);
		contentPane.add(textField_name);
		textField_name.setColumns(10);

		JTextField textField_surname = new JTextField();
		textField_surname.setBounds(580, 119, 130, 26);
		contentPane.add(textField_surname);
		textField_surname.setColumns(10);

		JTextField textField_address = new JTextField();
		textField_address.setBounds(580, 169, 130, 26);
		contentPane.add(textField_address);
		textField_address.setColumns(10);

		JTextField textField_phone = new JTextField();
		textField_phone.setBounds(580, 221, 130, 26);
		contentPane.add(textField_phone);
		textField_phone.setColumns(10);

		JTextField textField_pass = new JTextField();
		textField_pass.setBounds(580, 274, 130, 26);
		contentPane.add(textField_pass);
		textField_pass.setColumns(10);

		JLabel lblNewLabel = new JLabel("id");
		lblNewLabel.setBounds(508, 23, 61, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("name");
		lblNewLabel_1.setBounds(508, 73, 61, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("surname");
		lblNewLabel_2.setBounds(508, 124, 61, 16);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("address");
		lblNewLabel_3.setBounds(508, 174, 61, 16);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("phone");
		lblNewLabel_4.setBounds(508, 226, 61, 16);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("password");
		lblNewLabel_5.setBounds(508, 279, 61, 16);
		contentPane.add(lblNewLabel_5);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (table.getSelectedRowCount() < 1) {
					return;
				}
				int index = table.getSelectedRow();
				int id = Integer.parseInt(table.getValueAt(index, 0).toString());
				String name = table.getValueAt(index, 1).toString();
				String surname = table.getValueAt(index, 2).toString();
				String address = table.getValueAt(index, 3).toString();
				String phone = table.getValueAt(index, 4).toString();
				String password = table.getValueAt(index, 5).toString();

				textField_id.setText("" + id);
				textField_name.setText("" + name);
				textField_surname.setText("" + surname);
				textField_address.setText("" + address);
				textField_phone.setText("" + phone);
				textField_pass.setText("" + password);

			}
		});
		table.setBounds(16, 24, 480, 421);
		contentPane.add(table);

		JButton btnSaveNew = new JButton("SAVE NEW");
		btnSaveNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDB x = new CustomerDB(0, textField_name.getText().trim(), textField_surname.getText().trim(),
						textField_address.getText().trim(), textField_phone.getText().trim(),
						textField_pass.getText().trim());
				CustomerManager.saveNewCustomer(x);
				load();


				textField_id.setText("");
				textField_name.setText("");
				textField_surname.setText("");
				textField_address.setText("");
				textField_phone.setText("");
				textField_pass.setText("");
			}
		});
		btnSaveNew.setBounds(559, 322, 117, 29);
		contentPane.add(btnSaveNew);

		JButton btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerDB x = new CustomerDB(Integer.parseInt(textField_id.getText()), textField_name.getText().trim(), textField_surname.getText().trim(),
						textField_address.getText().trim(), textField_phone.getText().trim(),
						textField_pass.getText().trim());
				CustomerManager.editCustomer(x);
				load();


				textField_id.setText("");
				textField_name.setText("");
				textField_surname.setText("");
				textField_address.setText("");
				textField_phone.setText("");
				textField_pass.setText("");

			}
		});
		btnEdit.setBounds(559, 363, 117, 29);
		contentPane.add(btnEdit);

		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(CustomerFrame.this,
						"Do you want to delete this?", "DELETE?", JOptionPane.OK_CANCEL_OPTION))
				{
					System.out.println("a");
					CustomerDB x = new CustomerDB(Integer.parseInt(textField_id.getText()), textField_name.getText().trim(), textField_surname.getText().trim(),
							textField_address.getText().trim(), textField_phone.getText().trim(),
							textField_pass.getText().trim());
					
					CustomerManager.deleteCustomer(x);
					load();
				}


				textField_id.setText("");
				textField_name.setText("");
				textField_surname.setText("");
				textField_address.setText("");
				textField_phone.setText("");
				textField_pass.setText("");
			}
		});
		btnDelete.setBounds(559, 404, 117, 29);
		contentPane.add(btnDelete);

		load();
	}

	ArrayList<CustomerDB> list;

	public void load() {
		list = CustomerManager.getAllCustomer();
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("id");
		model.addColumn("name");
		model.addColumn("surname");
		model.addColumn("address");
		model.addColumn("phone");
		model.addColumn("password");

		for (CustomerDB c : list) {
			model.addRow(new Object[] { c.id, c.name, c.surname, c.address, c.phone, c.password });
		}

		table.setModel(model);
	}
}
