
public class DoublyLinkedList {
	public int size;
	public DNode head, tail;
	public DoublyLinkedList()
	{
		head = new DNode();
		tail = new DNode();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	public void insert(int x , int i)
	{
		int k = 0;
		DNode n;
		if(i > size)
		{
			return;
		}
		if(i > size/2)
		{
			n = tail;
			k = size;
			for(; k > i-1;k--)
			{
				n = n.prev;
			}
		}
		else
		{
			n = head;
			for(k = 0 ; k < i;k++)
			{
				n = n.next;
			}
		}
		DNode m = n.next;
		n.next = new DNode();
		n.next.data = x;
		n.next.next = m;
		n.prev = n ;
		m.prev = n.next;
		
		
		
	
	}

}
