import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.InvalidParameterException;

public class DoublyCircularLinkedList
{

	public int size;
	public DNode head, tail;

	public DoublyCircularLinkedList()
	{
		head = new DNode();
		tail = new DNode();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}

	public void addFirst(int x)
	{
		DNode n = new DNode(x);
		n.next = head.next;
		head.next = n;
		n.next.prev = n;
		n.prev = head;
		head.next.prev = tail.prev;
		tail.prev.next = head.next;
		size++;
	}

	public void addLast(int x)
	{
		DNode n = new DNode(x);
		n.prev = tail.prev;
		tail.prev = n;
		n.prev.next = n;
		n.next = tail;
		head.prev = tail.prev;
		size++;
	}

	public void removeAt(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);
		}
		int i = 0;
		DNode p = head;
		while (p.next != tail && i < index)
		{
			p = p.next;
			i++;
		}
		p.next = p.next.next;
		p.next.prev = p;
	}

	public int get(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);
		}
		if (index < size / 2)
		{
			int i = 0;
			DNode p = head;
			while (p.next != null && i <= index)
			{
				p = p.next;
				i++;
			}
			return p.data;
		}
		int i = size;
		DNode p = head;
		while (p.next != null && i <= index)
		{
			p = p.next;
			i--;
		}
		return p.data;
	}

	public void draw(Graphics g)
	{
		DNode p = head;
		int i = 0;
		Font fn = new Font("serif", Font.BOLD, 20);

		while (p != null)
		{
			i++;
			g.setColor(Color.BLACK);
			g.fillOval(50 + 60 * i, 50, 50 + 1, 50 + 1);
			g.setColor(Color.YELLOW);
			g.fillOval(50 + 60 * i, 50, 50, 50);

			// Draw data
			g.setColor(Color.BLACK);
			g.setFont(fn);
			g.drawString("" + p.data, 40 + 60 * i + 25, 80);

			// Draw straight line
			g.drawLine(40 + 60 * i + 50, 55, 40 + 60 * i + 50, 95);

			// Draw arrow Line
			g.drawLine(40 + 60 * i + 50 + 10, 75 + 10, 50 + 60 * (i + 1) + 10, 75 + 10);
			g.drawLine(50 + 60 * (i + 1), 75, 50 + 60 * (i + 1) - 5, 65);
			g.drawLine(50 + 60 * (i + 1), 75, 50 + 60 * (i + 1) - 5, 85);

			p = p.next;
		}
	}

	public void printFront()
	{
		DNode p = head.next;
		DNode x = head.next;
		do
		{
			System.out.println(p.data);
			p = p.next;
		}while (p != x);


	}

	public void printBack()
	{
		DNode p = tail.prev;
		DNode x = tail.prev;
		do
		{
			System.out.println(p.data);
			p = p.prev;
		}while(p != x);

	}

}
