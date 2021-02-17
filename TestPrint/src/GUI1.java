import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI1 extends JFrame
{

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_name;
	private JTextField textField_total_sale;
	private JButton btnAdd;
	private JButton btnPrint;

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
					try
					{
					} catch (Exception e)
					{
						e.printStackTrace();
					}
					GUI1 frame = new GUI1();
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

	ArrayList<Saleman> list = new ArrayList<Saleman>();

	public GUI1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 164, 410, 210);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		textField_name = new JTextField();
		textField_name.setBounds(132, 6, 130, 26);
		contentPane.add(textField_name);
		textField_name.setColumns(10);

		textField_total_sale = new JTextField();
		textField_total_sale.setBounds(132, 69, 130, 26);
		contentPane.add(textField_total_sale);
		textField_total_sale.setColumns(10);

		JLabel lblName = new JLabel("name");
		lblName.setBounds(6, 11, 61, 16);
		contentPane.add(lblName);

		JLabel lblTotalSale = new JLabel("total sale");
		lblTotalSale.setBounds(6, 74, 61, 16);
		contentPane.add(lblTotalSale);

		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//check if this only number 
				if (!textField_total_sale.getText().matches("-?\\d+(\\.\\d+)?"))
				{
					JOptionPane.showMessageDialog(GUI1.this, "input only number");
					textField_total_sale.requestFocus();
					textField_total_sale.selectAll();
					return;
				}
				Saleman s = new Saleman();
				s.name = textField_name.getText();
				s.totalSale = Integer.parseInt(textField_total_sale.getText());
				list.add(s);
				
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("name");
				model.addColumn("totalSale");
				
				//ข้อมูลaddลงtable
				for(Saleman ss : list)
				{
					model.addRow(new Object[] {ss.name, ss.totalSale});
				}
				table.setModel(model);
			}
		});
		btnAdd.setBounds(299, 6, 117, 29);
		contentPane.add(btnAdd);

		btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrinterJob job = PrinterJob.getPrinterJob();
				job.setPrintable(new SalemanPrintable(list));
				boolean doPrint = job.printDialog();
				if (doPrint) {
				    try {
				        job.print();
				    } catch (PrinterException arg0) {
				    }
				}


			}
		});
		btnPrint.setBounds(309, 50, 117, 29);
		contentPane.add(btnPrint);
	}
}
