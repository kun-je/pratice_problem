
public class DNode
{
	public int data;
	public DNode next;
	public DNode prev;
	
	public DNode()
	{
		data = 0;
		next = null;
		prev = null;
	}
	
	public DNode(int  x)
	{
		this();
		data =x;
	}
}
