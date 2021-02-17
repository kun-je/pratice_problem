import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedList
{

	public Node header;
	public int size;

	public LinkedList()
	{
		header = new Node();
		header.next = null;
		size = 0;
	}

	public void addFirst(int x)
	{
		Node n = new Node(x);
		n.next = header.next;
		header.next = n;
		size++;
	}

	public void addAt(int index, int x)
	{
		int count = 0;
		Node p = header;
		while (p != null && count != index)
		{
			p = p.next;
			count++;
		}
		Node n = new Node(x);
		n.next = p.next;
		p.next = n;
	}

	public int getFirst()
	{
		Node p = header.next;
		return p.data;
	}

	public int getLast()
	{
		Node p = header;
		Node prevp = null;
		while (p != null)
		{
			prevp = p;
			p = p.next;
		}
		return prevp.data;
	}

	public int get(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);

		}
		int i = 0;
		Node p = header;
		while (p.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		return p.data;
	}

	public void removeFirst()
	{
		Node p = header.next;
		header.next = p.next;
		size--;
	}

	public void removeLast()
	{
		int index = size - 1;
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);
		}
		int i = 0;
		Node p = header;
		while (p.next.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		p.next = null;
		size--;
	}

	public int indexOf(int e)
	{
		Node p = header;
		int i = 0;
		while (p.data != e)
		{
			p = p.next;
			i++;
		}
		return i - 1;
	}

	public int lastIndexOf(int e)
	{
		Node p = header;
		int i = 0;
		int index = -1;
		while (p != null)
		{
			if (p.data == e)
			{
				index = i;
			}
			p = p.next;
			i++;

		}
		if (index == -1)
		{
			System.out.println("no value of " + 5);
			return 0;
		} else
		{
			return index - 1;
		}
	}

	public void swap(int i, int j)
	{
		int counti = 0;
		int countj = 0;
		if (i < 0 || i >= size || j < 0 || j >= size)
		{
			throw new InvalidParameterException("invaild index : " + i + "or/and" + j);

		}
		Node pi = header;
		Node previ = null;

		while (pi != null && counti != i)
		{
			previ = pi;
			pi = pi.next;
			counti++;
		}

		Node pj = header;
		Node prevj = null;

		while (pj != null && countj != j)
		{
			prevj = pj;
			pj = pj.next;
			countj++;
		}

		if (pi != null && pj != null)
		{

			if (previ != null)
				previ.next = pj;
			else
				header = pj;

			if (prevj != null)
				prevj.next = pi;
			else
				header = pi;

			Node t = pi.next;
			pi.next = pj.next;
			pj.next = t;
		} else
		{
			System.out.println("Swapping is not possible");
		}

	}

	public void removeAt(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);
		}
		int i = 0;
		Node p = header;
		while (p.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		p.next = p.next.next;
	}

	public void removeRange(int from, int to)
	{
		int nsize = size - (from - to + 1);
		int counti = 0;
		int countj = 0;
		if (from < 0 || from >= size || to < 0 || to >= size)
		{
			throw new InvalidParameterException("invaild index : " + from + "or/and" + to);

		}
		Node pi = header;
		Node previ = null;

		while (pi != null && counti != from)
		{
			previ = pi;
			pi = pi.next;
			counti++;
		}

		Node pj = header;

		while (pj != null && countj != to)
		{
			pj = pj.next;
			countj++;
		}

		previ.next = pj.next;
		size = nsize;

	}

	public void shuffle(LinkedList a)
	{

	}

	public void reverse()
	{
		Node prev = null;
		Node next = null;
		Node current = header;

		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			// System.out.println(current.data);
		}
		header = prev;
	}

	public static void cutPaste(LinkedList a, int i, int j, LinkedList b, int k)
	{
		int[] store = new int[j - i + 1];

		int count = 0;
		int counti = 0;
		int countj = 0;
		Node pi = a.header;
		Node previ = null;

		while (pi != null && counti != i)
		{
			previ = pi;
			pi = pi.next;
			counti++;

		}

		Node pj = a.header;

		while (pj != null && countj != j)
		{
			pj = pj.next;
			countj++;

		}

		while (counti!= countj+1)
		{
			System.out.println(pi.data);

			store[count] = pi.data;
			pi = pi.next;
			counti++;
			count++;
		}
		System.out.println(Arrays.toString(store));

		a.removeRange(i, j);
		for (int c = 0; c < store.length; c++)
		{
			b.addAt(k +c, store[c]);

		}
	}
	
	public void zip(LinkedList b)
	{
		
	}

	public void print()
	{
		Node p = header.next;
		while (p != null)
		{
			System.out.println(p.data);
			p = p.next;
		}
	}

	public static void main(String[] args)
	{
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
		LinkedList c = new LinkedList();

		for (int i = 0; i < 10; i++)
		{
			a.addFirst((int) (Math.random() * 10));
		}
		for (int i = 0; i < 10; i++)
		{
			b.addFirst((int) (Math.random() * 10));
		}
		for (int i = 0; i < 10; i++)
		{
			c.addFirst((int) (Math.random() * 10));
		}

		/*
		 * System.out.println("/////////"); // a.swap(3, 6);
		 * 
		 * /* for (int i = 0; i < 10; i++) { System.out.println(a.get(i)); }
		 */
		/*
		 * a.print(); System.out.println("/////////");
		 */

		/*
		 * System.out.println(a.getFirst()); System.out.println(a.getLast());
		 * System.out.println("/////////");
		 */

		/*
		 * a.removeFirst(); a.removeLast();
		 * 
		 * a.print();
		 */

		/*
		 * System.out.println("/////////"); System.out.println(a.indexOf(5));
		 * System.out.println(a.lastIndexOf(5));
		 */

		/*
		 * System.out.println("/////////"); a.removeRange(2,5); a.print();
		 */

		/*
		 * System.out.println("/////////"); a.reverse(); a.print();
		 * 
		 * System.out.println("/////////"); a.shuffle(a); a.print();
		 */
		System.out.println("/////////");

		b.print();
		System.out.println("/////////");

		c.print();

		System.out.println("/////////");
		cutPaste(b,3,7,c,5);

		c.print();

	}

}
