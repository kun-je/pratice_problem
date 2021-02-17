package V;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import M.productDB;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InvoiceFrame extends JFrame
{

	private JPanel contentPane;
	private JPanel panel;
	private JTextField txtSelect;
	private JTextField txtSave;

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
					InvoiceFrame frame = new InvoiceFrame();
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
	public InvoiceFrame()
	{
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				panel.setBounds(0, 69, getWidth()-20, getHeight()-100);

			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		
		setBounds(0, 0, 1000,(int) height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 69, getWidth()-20, getHeight()-100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInvoice = new JLabel("Invoice");
		lblInvoice.setFont(new Font("Lao Sangam MN", Font.PLAIN, 48));
		lblInvoice.setBounds(277, 31, 350, 62);
		panel.add(lblInvoice);
		
		JLabel company_info = new JLabel("New label");
		company_info.setBounds(65, 133, 61, 16);
		panel.add(company_info);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 203, 61, 16);
		panel.add(lblNewLabel);
		
		JButton btnSelectCustomer = new JButton("Select Customer");
		btnSelectCustomer.setBounds(18, 6, 197, 29);
		contentPane.add(btnSelectCustomer);
		
		txtSelect = new JTextField();
		txtSelect.setText("Select Product");
		txtSelect.setBounds(298, 6, 197, 26);
		contentPane.add(txtSelect);
		txtSelect.setColumns(10);
		
		txtSave = new JTextField();
		txtSave.setText("Save");
		txtSave.setBounds(569, 18, 130, 26);
		contentPane.add(txtSave);
		txtSave.setColumns(10);
		
		JButton btnPrint = new JButton("print");
		btnPrint.setBounds(176, 33, 117, 29);
		contentPane.add(btnPrint);
		
		CompanyInfo x = companyInfoManager.getComapnyInfo();
		String CompanyInfo = x.comapany_name + " address" + x.address + "tel " + x.phone;
	}
	
	public void setDetail(productDB xProduct)
	{
		InvoiceDetail x = new InvoiceDetail();
		x.no = detailList.size()+1;
		x.per_per_unit = xProduct.price_per_unit;
		
	}
}

class InvoiceDetail
{
	public int no;
	public String product_name;
	public int qty;
	public double price_per_unit;
	public double totall_price;
	
	public productDB product;
}
