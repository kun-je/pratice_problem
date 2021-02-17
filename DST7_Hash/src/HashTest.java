import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HashTest extends JPanel
{

	Hash<Integer> h;
	private JTextField textField;

	public HashTest()
	{
		h = new Hash<Integer>();
		for(int i = 0; i < 20 ; i++)
		{
			h.add((int)(Math.random()*1000));
		}
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(270, 31, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textField.getText());
				h.add(x);
				repaint();
			}
		});
		btnOk.setBounds(283, 75, 117, 29);
		add(btnOk);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		h.draw(g);
	}

	public static void main(String[] args)
	{
		new HashTest();
	}
}


