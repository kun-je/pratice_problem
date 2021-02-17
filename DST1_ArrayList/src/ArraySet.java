
public class ArraySet
{

	int []data;
	int size;
	
	
	public ArraySet()
	{
		data = new int[10];
		size = 0;
	}
	
	public void add(int x)
	{
		for(int i = 0; i < data.length; i++)
		{
			if(x == data[i])return;
		}
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
	
	public static void main(String[] args)
	{
		
	}

}
