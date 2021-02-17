import java.security.InvalidParameterException;

public class LinkedList3_1
{
	public Node first;
	public int size;

	public LinkedList3_1(int x)
	{
		first = new Node(x);
		size = 0;
	}
	public void addFirst(int x)
	{
		Node n = new Node(x);
		n.next = first.next;
		first.next = n;
		size++;
	}

	public int get(int index)
	{
		if (index < 0 || index >= size)
		{
			throw new InvalidParameterException("invaild index : " + index);

		}
		int i = 0;
		Node p = first;
		while (p.next != null && i < index)
		{
			p = p.next;
			i++;
		}
		return p.data;
	}

	public static void main(String[] args)
	{
		LinkedList3_1 a = new LinkedList3_1((int) (Math.random() * 10));
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
