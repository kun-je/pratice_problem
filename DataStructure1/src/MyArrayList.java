import java.util.Arrays;

public class MyArrayList {
	int []data;
	int size;
	public MyArrayList()
	{
		data = new int[10];
		size = 0 ;
	}
	
	public void add(int x)
	{
		if(size >= data.length)
		{
			int []t = new int [size*2];
			for(int i = 0; i < size; i++)
			{
				t[i] = data[i];
			}
			data = t;
		}
		data[size] = x;
		size++;
	}
	
	public int get(int i)
	{
		if(i < 0 || i >=size)
		{
			throw new IndexOutOfBoundsException();
		}
		return data[i];
	}
	
	public void set(int i,int index)
	{
		if(index < 0 || index >=size)
		{
			throw new IndexOutOfBoundsException();
		}
		data[index] = i;
	}
	
	
	public int [] toArray()
	{
		int [] x = new int [size];
		for(int i = 0; i < size; i++)
		{
			if(data[i] != 0)
			x[i] = data[i];
		}
		return x;
		
	}
	
	public String toString()
	{
		int [] x = toArray();
		return Arrays.toString(x);
	}
	
	
 	public void print()
	{
		System.out.println(Arrays.toString(data));
	}


}
