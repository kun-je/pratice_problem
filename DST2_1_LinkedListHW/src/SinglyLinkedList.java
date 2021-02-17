import java.security.InvalidParameterException;

public class SinglyLinkedList
{
		public Node head;
		public int size;
		
		public SinglyLinkedList()
		{
			head = new Node();
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
			while(p.next!= null && i < index)
			{
				p = p.next;
				i++;
			}
			return p.data;
		}
		
		public void removeAt(int index)
		{
			if(index < 0 || index >= size)
			{
				throw new InvalidParameterException("invaild index : "+index);
			}
			int i = 0;
			Node p = head;
			while(p.next != null && i < index)
			{
				p = p.next;
				i++;
			}
			p.next = p.next.next;
		}
		
		public void search(int i)
		{
			Node n = head;
			while(n != null )
			{
				n = n.next;
				if( n.data == i)
				{
					System.out.println("Find data");
					return;
				}
			}
			System.out.println("doesn't Find data");

		}
		
		public void moveOne(int index)
		{
			Node p = head;
			int i = 0;
			while(p.next!= null && i < index)
			{
				p = p.next;
				i++;
			}
			Node temp = p.next;
			
		}

		public int size()
		{
			return size;
		}
		
		public int[] toArray()
		{
			int []a = new int[size];
			Node p = head.next;
			int i = 0;
			while(p!= null)
			{
				a[i] = p.data;
				p= p.next;
				i++;
			}
			return a;
		}
		
		public String toString()
		{
			int a[] = toArray();
			String s = "";
			for(int i = 0;i < size;i++)
			{
				s += ""+a[i];
			}
			return s;
		}
		
		public boolean equals(SinglyLinkedList c)
		{
			if(this.toString() == c.toString())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		public boolean containsDup()
		{
			int []a=this.toArray();
			for(int i = 0 ; i < size; i++)
			{
				for(int j = i+ 1;j < size-i;j++)
				{
					if(a[i]== a[j])
					{
						return true;
					}
				}
			}
			return false;
		}
		
		public void clear()
		{
			this.clear();
		} 
		
		public int frequency(int e)
		{
			int a[] = this.toArray();
			int count = 0;
			for(int i = 0; i< size;i++)
			{
				if(a[i] == e)
				{
					count++;
				}
			}
			return count;
		}
		
		public void print()
		{
			Node p = head.next;
			while (p != null)
			{
				System.out.println(p.data);
				p = p.next;
			}
		}
		
		public void removeAll(int e)
		{
			Node p = head;
			int count = 0;
			while(p != null)
			{
				if(p.data == e)
				{
					this.removeAt(count-1);
					count--;
				}
				count++;
				p = p.next;

			}
		}
		
		public void removeDup()
		{
			for(int i = 0 ;i < ; )
		}
}
