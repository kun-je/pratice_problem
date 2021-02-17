
public class TestCircularLL
{

	public static void main(String[] args)
	{
		CircularLinkedList c = new CircularLinkedList();
		for(int i = 0; i < 5; i++)
		{
			c.addFirst((int)(Math.random()*10));
		}
		c.print();
		
	}

}
