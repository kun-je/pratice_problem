
public class Node<T> {
	public T data;
	//link
	public Node<T> next;
	public Node<T> prev;

	public Node(){
		data = null;
		next = null;
		prev = null;
	}
	
	public Node(T x)
	{
		this();
		data =x;
	}
	
	
}
