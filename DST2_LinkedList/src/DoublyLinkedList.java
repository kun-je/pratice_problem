import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.InvalidParameterException;

public class DoublyLinkedList {
	public int size;
	public DNode head, tail;

	public DoublyLinkedList() {
		head = new DNode();
		tail = new DNode();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}

	public void insert(int x, int i) {
		int k = 0;
		DNode n;
		if (i > size) {
			return;
		}
		if (i > size / 2) {
			n = tail;
			k = size;
			for (; k > i - 1; k--) {
				n = n.prev;
			}
		} else {
			n = head;
			for (k = 0; k < i; k++) {
				n = n.next;
			}
		}
		DNode m = n.next;
		n.next = new DNode();
		n.next.data = x;
		n.next.next = m;
		n.prev = n;
		m.prev = n.next;
	}

	public void addFirst(int x) {
		DNode n = new DNode(x);
		n.next = head.next;
		head.next = n;
		n.next.prev = n;
		n.prev = head;
		size++;
	}

	public void addLast(int x) {
		DNode n = new DNode(x);
		n.prev = tail.prev;
		tail.prev = n;
		n.prev.next = n;
		n.next = tail;
		size++;
	}

	public void removeAt(int index) {
		if (index < 0 || index >= size) {
			throw new InvalidParameterException("invaild index : " + index);
		}
		int i = 0;
		DNode p = head;
		while (p.next != tail && i < index) {
			p = p.next;
			i++;
		}
		p.next = p.next.next;
		p.next.prev = p;
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new InvalidParameterException("invaild index : " + index);
		}
		if (index < size / 2) {
			int i = 0;
			DNode p = head;
			while (p.next != null && i <= index) {
				p = p.next;
				i++;
			}
			return p.data;
		}
		int i = size;
		DNode p = head;
		while(p.next != null && i <= index)
		{
			p = p.next;
			i--;
		}
		return p.data;
	}


	public void draw(Graphics g) {
		DNode p = head;
		int i = 0;
		Font fn = new Font("serif", Font.BOLD, 20);

		while (p != null) {
			i++;
			g.setColor(Color.BLACK);
			g.fillOval(50+60*i,50,50+1,50+1 );
			g.setColor(Color.YELLOW);
			g.fillOval(50+60*i,50,50,50 );


			//Draw data
			g.setColor(Color.BLACK);
			g.setFont(fn);
			g.drawString(""+p.data, 40+60*i+25, 80);
			
			//Draw straight line
			g.drawLine(40+60*i+50, 55, 40+60*i +50, 95);
			
			//Draw arrow Line
			g.drawLine(40+60*i+50+10, 75+10, 50+60*(i+1)+10, 75+10);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 65);
			g.drawLine(50+60*(i+1), 75, 50+60*(i+1)-5, 85);

			
			p = p.next;
		}
	}

}
