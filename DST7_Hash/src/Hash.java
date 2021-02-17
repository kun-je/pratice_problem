import java.awt.Graphics;
import java.lang.reflect.Array;

//separate chain hashing

public class Hash<T>
{
	int size;
	int capacity;
	LinkedList<T>[] data ;//array of linkedlist
	
	public Hash()
	{
		size = 0;
		capacity = 13;//only prime number cause it can't be divide
		data = (LinkedList<T>[])Array.newInstance(LinkedList.class, capacity) ;
	}
	
	public int hashFunction(T t)
	{
		return t.hashCode()% capacity;
	}
	
	public void add(T t)
	{
		int hc = hashFunction( t);
		if(data[hc] == null)//new first if we don't have linked list
		{
			data[hc] = new LinkedList<T>();
		}
		data[hc].addFirst(t);
	}
	
	public boolean isContain(T t)
	{
		int hc = hashFunction( t);
		if(data[hc] == null)
		{
			return false;
		}
		return data[hc].isContain(t);
	}

	public void draw(Graphics g)
	{
		for(int i = 0; i < data.length; i++)
		{
			if(data[i] != null)
			{
				data[i].draw(g,i*50);
			}
		}
	}
	
	
	
}
