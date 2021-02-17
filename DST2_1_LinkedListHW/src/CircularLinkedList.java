
public class CircularLinkedList
{
	Node head;
	int size;
	
	public CircularLinkedList()
	{
		head = new Node();
		head.next = head;
		size = 0;
	}
	
	public void addFirst(int x)
	{
		Node n = new Node(x);
		n.next = head.next;
		head.next = n;
		size++;
	}
	
	public int get(int index)
	{
		Node p = head;
		int i = 0;
		while(p.next!= head && i < index)
		{
			p = p.next;
			i++;
		}
		return p.data;
	}

	public int size()
	{
		return size;
	}
	
	public void print()
	{
		Node p = head;
		do
		{
		System.out.println(p.data);
		p = p.next;
		}while(p.next != head);
		System.out.println(p.data);
		p = p.next;
		System.out.println(p.data);

	}
}
