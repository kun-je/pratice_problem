
public class TestDoublyLL
{

	public static void main(String[] args)
	{
		DoublyLinkedList c = new DoublyLinkedList();
		for(int i = 0; i < 5; i++)
		{
			c.addFirst((int)(Math.random()*10));
		}
		c.printFront();	
		System.out.println("///////");
		c.printBack();	


	}

}
