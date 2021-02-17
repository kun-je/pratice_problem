import java.security.InvalidParameterException;

public class DLinkedList3_3
{
	public DNode first;
	public int size;

	public DLinkedList3_3(int x)
	{
		first = new DNode(x);
		first.next = null;
		first.prev = null;
		size = 0;
	}
	public void addFirst(int x)
	{
		DNode n = new DNode(x);
		n.next = first.next;
		first.next = n;
		if(n.next != null)
		n.next.prev = n;
		n.prev = first;
		size++;
	}

	public int get(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);

		}
		int i = 0;
		DNode p = first;
		while (p.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		return p.data;
	}

	public static void main(String[] args)
	{
		DLinkedList3_3 a = new DLinkedList3_3((int) (Math.random() * 10));
		for (int i = 0; i < 10; i++)
		{
			a.addFirst((int) (Math.random() * 10));
		}

		for (int i = 0; i < 10; i++)
		{
			System.out.println(a.get(i));
		}
	}

}
