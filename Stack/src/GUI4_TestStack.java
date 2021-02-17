import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI4_TestStack extends JFrame
{

	private MyPanel contentPane;
	private JTextField textField;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					GUI4_TestStack frame = new GUI4_TestStack();
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
	public GUI4_TestStack()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new MyPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.stack = new Stack<Integer>();
		contentPane.stack.push(1);
		contentPane.stack.push(2);
		contentPane.stack.push(3);
		contentPane.stack.push(4);


		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(258, 34, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPush = new JButton("push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.stack.push(Integer.parseInt(textField.getText()));
				repaint();

			}
		});
		btnPush.setBounds(271, 92, 117, 29);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("Pop");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.stack.pop();
				repaint();
			}
		});
		btnPop.setBounds(271, 148, 117, 29);
		contentPane.add(btnPop);
	}
}

class MyPanel extends JPanel
{
	public Stack<Integer> stack;
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if(stack != null)
		stack.draw(g);
	}
}
