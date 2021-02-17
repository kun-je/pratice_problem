import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class LinkedList {

	Node head;
	
	public LinkedList()
	{
		head = new Node();
	}
	
	public void addFirst(Object x)
	{
		Node n = new Node();
		n.data = x;
		n.next = head.next;
		head.next = n;
	}
	
	public void addLast(Object x)
	{
		Node n = head;
		while(n.next!= null)
		{
			n = n.next;
		}
		n.next = new Node();
		n.next.data = x;
	}
	
	public void insertAt(Object x, int i)
	{
		int k = 0;
		Node n = head;
		while(n.next!= null && k < i)
		{
			n = n.next;
			k++;
		}
		
		Node m = n,next;
		n.next = new Node();
		n.next.data = x;
		n.next.next = m;
	}
	
	public void removeAt(int i)
	{
		int k = 0;
		Node n = head;
		while(n.next!= null && k < i)
		{
			n = n.next;
			k++;
		}
		if(n.next == null)
		{
			return;
		}
		n.next = n.next.next;
	}
	
	public Object get(int i)
	{
		int k  =0;
		Node n = head;
		for(; k< i && n.next != null;k++)
		{
			n = n.next;
		}
		return n.data;
	}
	public void draw (Graphics g)
	{
		int i =0;
		Node n = head;
		Font fn = new Font("serif", Font.BOLD, 20);
		while(n != null)
		{
			//Draw Oval
			i++;
			g.setColor(Color.BLACK);
			g.fillOval(50+60*i,50,50+1,50+1 );
			g.setColor(Color.YELLOW);
			g.fillOval(50+60*i,50,50,50 );


			//Draw data
			g.setColor(Color.BLACK);
			g.setFont(fn);
			g.drawString(""+n.data, 40+60*i+25, 80);
			
			//Draw straight line
			g.drawLine(40+60*i+50, 55, 40+60*i +50, 95);
			
			//Draw arrow Line
			g.drawLine(40+60*i+50, 75, 50+60*(i+1), 75);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 65);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 85);

			
			n = n.next;
			
		}
	}
}
