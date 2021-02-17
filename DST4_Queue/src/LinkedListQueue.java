import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.InvalidParameterException;

public class LinkedListQueue<T>
{
	 public Node<T> head;
	 public Node<T> tail;
	 public int size;
	 
	 public LinkedListQueue()
	 {
		 head = new Node<T>();
		 tail = new Node<T>();
		 head.next = tail;
		 tail.prev = head;
		 size = 0;
	 }
	 
	 public void insert(T x, int i) {
			int k = 0;
			Node<T> n;
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
			Node<T> m = n.next;
			n.next = new Node<T>();
			n.next.data = x;
			n.next.next = m;
			n.prev = n;
			m.prev = n.next;
			size++;
		}

		public void addFirst(T x) {
			Node<T> n = new Node<T>(x);
			n.next = head.next;
			head.next = n;
			n.next.prev = n;
			n.prev = head;
			size++;
		}

		public void addLast(T x) {
			Node<T> n = new Node<T>(x);
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
			Node<T> p = head;
			while (p.next != tail && i < index) {
				p = p.next;
				i++;
			}
			p.next = p.next.next;
			p.next.prev = p;
			size--;
		}

		//ทำถอยหลังด้วย
		public T get(int index) {
			if (index < 0 || index >= size) {
				throw new InvalidParameterException("invaild index : " + index);
			}
			if (index < size / 2) {
				int i = 0;
				Node<T> p = head;
				while (p.next != null && i <= index) {
					p = p.next;
					i++;
				}
				return p.data;
			}
			int i = size;
			Node<T> p = tail;
			while(p.prev != null && i > index)
			{
				p = p.prev;
				i--;
			}
			return p.data;
		}


		public void draw(Graphics g) {
			Node<T> p = head;
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
		
		
		public void print() {
			Node<T> p = head;

			while (p != null) {
				System.out.print(","+p.data);

				
				p = p.next;
			}
		}

	}


	

