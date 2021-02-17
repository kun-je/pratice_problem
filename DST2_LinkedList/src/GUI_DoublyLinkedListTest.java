import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_DoublyLinkedListTest extends JPanel {
	
	DoublyLinkedList ll;
	public GUI_DoublyLinkedListTest()
	{
		ll = new DoublyLinkedList();
		//ll.addLast(5);
		for(int i =0; i < 5; i++)
		{
			ll.addLast((int)(Math.random()*100));
		}
		
		ll.addLast(99);
		for(int i = 0; i < 5; i++)
		{
			ll.addLast((int)(Math.random()*100));
		}
		ll.addLast(5);
		JFrame f = new JFrame();
		f.add(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,500);
		f.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		ll.draw(g);
	}
	
	public static void main(String[] args)
	{
		new GUI_DoublyLinkedListTest();
	}

}
