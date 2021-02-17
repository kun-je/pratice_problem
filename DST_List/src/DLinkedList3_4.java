import java.security.InvalidParameterException;

public class DLinkedList3_4
{
	public DNode head;
	public DNode tail;

	public int size;

	public DLinkedList3_4()
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
		size++;
	}

	public int get(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);

		}
		int i = 0;
		DNode p = head;
		while (p.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		return p.data;
	}

	public static void main(String[] args)
	{
		DLinkedList3_4 a = new DLinkedList3_4();
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
