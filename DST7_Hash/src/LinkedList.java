import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class LinkedList<T> {

	Node<T> head;
	
	public LinkedList()
	{
		head = new Node<T>();
	}
	
	public void addFirst(T x)
	{
		Node<T> n = new Node<T>();
		n.data = x;
		n.next = head.next;
		head.next = n;
	}
	
	public void addLast(T x)
	{
		Node<T> n = head;
		while(n.next!= null)
		{
			n = n.next;
		}
		n.next = new Node<T>();
		n.next.data = x;
	}
	
	public void insertAt(T x, int i)
	{
		int k = 0;
		Node<T> n = head;
		while(n.next!= null && k < i)
		{
			n = n.next;
			k++;
		}
		
		Node<T> m = n.next;
		n.next = new Node<T>();
		n.next.data = x;
		n.next.next = m;
	}
	
	public void removeAt(int i)
	{
		int k = 0;
		Node<T> n = head;
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
	
	public T get(int i)
	{
		int k  =0;
		Node<T> n = head;
		for(; k< i && n.next != null;k++)
		{
			n = n.next;
		}
		return n.data;
	}
	
	public boolean isContain(T t)
	{
		Node<T> p = head;
		while(p.next !=null)
		{
			p = p.next;
			if(p.data.equals(t))
			{
				return true;
			}
		}
		return false;
	}
	public void draw (Graphics g, int y_offset)
	{
		int i =0;
		Node<T> n = head;
	//	Font fn = new Font("serif", Font.BOLD, 20);
		while(n != null)
		{
			//Draw Oval
			i++;
			g.setColor(Color.pink);
			g.fillOval(50+50*i,y_offset,30,30 );
			g.setColor(Color.black);		
			g.drawString(""+n.data, i*50+50+20, y_offset + 20);
			g.drawLine(50+50*i+30, 15*y_offset, 50+50*i +50, 15*y_offset);
			g.drawLine(50+50*i+40, 15-10+y_offset, i*50 + 50 + 50, 15 + y_offset);
			g.drawLine(50+50*i+40, 15+10+y_offset, i*50 + 50 + 50, 15 + y_offset);


			
			n = n.next;
			
		}
	}
}
