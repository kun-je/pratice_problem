package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import common.GlobalData;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatusFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatusFrame frame = new StatusFrame();
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
	public StatusFrame() {
		setTitle("your booking status");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 137, 598, 321);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		JLabel lblName = new JLabel(GlobalData.CurrentCustomer_name +"   "+ GlobalData.CurrentCustomer_surname);
		lblName.setBounds(38, 29, 536, 16);
		contentPane.add(lblName);
		
		JLabel lblAddress = new JLabel(GlobalData.CurrentCustomer_address);
		lblAddress.setBounds(38, 57, 494, 16);
		contentPane.add(lblAddress);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(504, 485, 117, 29);
		contentPane.add(btnExit);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.setBounds(352, 485, 117, 29);
		contentPane.add(btnPayment);
		
		JButton btnBookARoom = new JButton("Book a Room");
		btnBookARoom.setBounds(23, 485, 117, 29);
		contentPane.add(btnBookARoom);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(184, 485, 117, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblPhone = new JLabel(GlobalData.CurrentCustomer_phone);
		lblPhone.setBounds(38, 85, 555, 16);
		contentPane.add(lblPhone);
	}
}
