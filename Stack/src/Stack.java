import java.awt.Graphics;

public class Stack<T>
{
	private MyArrayListOfT<T> data;
	int size;
	public Stack()
	{
		data = new MyArrayListOfT<T>();
	}
	
	public void push(T x)
	{
		data.add(x);
		size++;
	}
	
	public T pop()
	{
		T t = data.get(data.size()-1);
		data.removeAt(data.size()-1);
		size--;
		return t;
	}
	
	public T top()
	{
		T t = data.get(data.size()-1);
		return t;
	}
	
	public void draw(Graphics g)
	{
		for(int i =0 ; i < data.size();i++)
		{
		g.drawRect(50, 500-40*i, 40, 40);
		g.drawString("" + data.get(i),50+10,500-40*i+30);
		}
	}
	
	public int size()
	{
		return size;
	}
	
	public String toString()
	{
		return data.toString();
	}
	
}
