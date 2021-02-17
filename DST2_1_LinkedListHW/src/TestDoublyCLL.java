
public class TestDoublyCLL
{

	public static void main(String[] args)
	{
		DoublyCircularLinkedList c = new DoublyCircularLinkedList();
		for(int i = 0; i < 5; i++)
		{
			c.addFirst((int)(Math.random()*10));
		}
		c.printFront();	
		System.out.println("///////");
		c.printBack();	


	}

}
