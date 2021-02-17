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

public class GUI5_TestQueue extends JFrame
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
					 GUI5_TestQueue frame = new  GUI5_TestQueue();
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
	public  GUI5_TestQueue()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new MyPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		contentPane.queue = new MyLinkedListQueue<Integer>();
		contentPane.queue.enqueue(1);
		contentPane.queue.enqueue(2);
		contentPane.queue.enqueue(3);
		contentPane.queue.enqueue(4);
		contentPane.queue.enqueue(5);
		contentPane.queue.enqueue(6);
		contentPane.queue.enqueue(7);
		contentPane.queue.enqueue(8);
		contentPane.queue.enqueue(9);


		contentPane.queue.print();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(258, 34, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnPush = new JButton("push");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.queue.enqueue(Integer.parseInt(textField.getText()));
				repaint();

			}
		});
		btnPush.setBounds(271, 92, 117, 29);
		contentPane.add(btnPush);
		
		JButton btnPop = new JButton("Pop");
		btnPop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.queue.dequeue();
				repaint();
			}
		});
		btnPop.setBounds(271, 148, 117, 29);
		contentPane.add(btnPop);
	}
}

class MyPanel extends JPanel
{
	public MyLinkedListQueue<Integer> queue;
	
	public void paint(Graphics g)
	{
		super.paint(g);
		if(queue != null)
		queue.draw(g);
	}
}
