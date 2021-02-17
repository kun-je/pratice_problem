import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame
{

	private JPanel contentPane;
	private JTextField textField_value;

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
					GUI frame = new GUI();
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
	LinkedList g = new LinkedList();

	public GUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAddfirst = new JButton("AddFirst");
		btnAddfirst.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				g.addFirst(Integer.parseInt(textField_value.getText()));
			}
		});
		btnAddfirst.setBounds(175, 202, 117, 29);
		contentPane.add(btnAddfirst);

		JButton btnAddlast = new JButton("AddLast");
		btnAddlast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.addLast(Integer.parseInt(textField_value.getText()));
			}
		});
		btnAddlast.setBounds(315, 202, 117, 29);
		contentPane.add(btnAddlast);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.removeAt(Integer.parseInt(textField_value.getText()));

			}
		});
		btnRemove.setBounds(175, 243, 117, 29);
		contentPane.add(btnRemove);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI_LinkedList2();
			}
		});
		btnSearch.setBounds(315, 243, 117, 29);
		contentPane.add(btnSearch);

		textField_value = new JTextField();
		textField_value.setBounds(27, 243, 130, 26);
		contentPane.add(textField_value);
		textField_value.setColumns(10);
	}
	
	public void GUI_LinkedList2()
	{
		//ll.addLast(5);
		for(int i =0; i < 5; i++)
		{
			g.addLast((int)(Math.random()*100));
		}
		
		//ll.addLast(99);
		for(int i = 0; i < 5; i++)
		{
			g.addLast((int)(Math.random()*100));
		}
		
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,500);
		f.setVisible(true);
	}
}
