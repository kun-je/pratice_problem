
public class TestSinglyLL
{

	public static void main(String[] args)
	{
		SinglyLinkedList s = new SinglyLinkedList();
		for(int i =0;i < 10;i++)
		{
			s.addFirst((int)(Math.random()*10));
		}
		
		s.print();
		System.out.println("////////");
		s.removeAll(5);
		
		s.print();
	}

}
