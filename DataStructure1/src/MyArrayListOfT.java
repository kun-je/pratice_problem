import java.util.Arrays;

public class MyArrayListOfT <T> {
	T []data;
	int size;
	public MyArrayListOfT()
	{
		data =  (T[])(new Object[10]);
		size = 0 ;
	}
	
	public void add(T x)
	{
		if(size >= data.length)
		{
			T []t = (T[])(new Object[size*2]);
			for(int i = 0; i < size; i++)
			{
				t[i] = data[i];
			}
			data = t;
		}
		data[size] = x;
		size++;
	}
	
	public T get(int i)
	{
		if(i < 0 || i >=size)
		{
			throw new IndexOutOfBoundsException();
		}
		return data[i];
	}
	
	public void set(T i,int index)
	{
		if(index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		data[index] = i;
	}
	
	
	public T [] toArray()
	{
		T [] x = (T[])(new Object[size*2]);
		for(int i = 0; i < size; i++)
		{
			x[i] = data[i];
		}
		return x;
		
	}
	
	public String toString()
	{
		T [] x = toArray();
		return Arrays.toString(x);
	}
	
	public int size()
	{
		return size;
	}
	
	public void removeAt(int index)
	{
		if(index  < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i = index ; i < size -1; i++)
		{
			data[i] = data[i+1];
			
		}
		size--;
	}
	
	
 	public void print()
	{
		System.out.println(Arrays.toString(data));
	}


}
