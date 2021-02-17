import java.awt.Graphics;

public class MyLinkedListQueue<T>
{
	LinkedListQueue<T> list;
	public MyLinkedListQueue()
	{
		list = new LinkedListQueue<T>();
	}
	
	public void enqueue(T x)
	{
		list.addFirst(x);//O(1)
	}
	
	public T dequeue()
	{
		T t = list.get(list.size-1);
		list.removeAt(list.size-1);
		return t;
	}
	
	public T peek()
	{
		T t = list.get(list.size-1);
		return t;
	}
	
	public int size()
	{
		return list.size;
	}

	/*public void draw(Graphics g)
	{
		for(int i = 0; i < list.size; i++)
		{
			g.drawRect(250*40*i, 300, 40,  40);
			g.drawString(""+list.get(i), 250*40*i +10, 330);
		}
	}*/
	
	public void draw(Graphics g)
	{
		for(int i =0 ; i < list.size;i++)
		{
		g.drawRect(50, 500-40*i, 40, 40);
		g.drawString("" + list.get(i),50+10,500-40*i+30);
		}
	}
	
	
	public void print()
	{
		list.print();
	}
	
	
}
