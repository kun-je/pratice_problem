
public class SelfAdjustingList 
{
	LinkedList ll ;
	Node header = ll.head;
	public boolean contains(Object e)
	{
		Node n = header;
		int i = 0;
		while(n.next!= null)
		{
			n = n.next;
			if(n.next.equals(e))
			{
				add(e);
				ll.removeAt(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
	public void add(Object e)
	{
		ll.addFirst(e);
	}

	public static void main(String[] args)
	{
		
	}

}
