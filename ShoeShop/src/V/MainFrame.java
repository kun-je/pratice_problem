package V;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame
{

	private JPanel contentPane;

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
					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					}
					catch(UnsupportedLookAndFeelException e)
					{
						
					}
					catch(ClassNotFoundException e){
						
					}
					catch(InstantiationException e)
					{
						
					}
					catch(IllegalAccessException e)
					{
						
					}
					MainFrame frame = new MainFrame();
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
	public MainFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCustomer = new JButton("customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerFrame f = new CustomerFrame();
				f.setVisible(true);
			}
		});
		btnCustomer.setBounds(23, 27, 117, 29);
		contentPane.add(btnCustomer);
		
		JButton btnProduct = new JButton("product");
		btnProduct.setBounds(23, 68, 117, 29);
		contentPane.add(btnProduct);
		
		JButton btnUser = new JButton("user");
		btnUser.setBounds(23, 109, 117, 29);
		contentPane.add(btnUser);
		
		JButton btnInvoice = new JButton("invoice");
		btnInvoice.setBounds(23, 154, 117, 29);
		contentPane.add(btnInvoice);
	}

}
