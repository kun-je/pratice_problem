import java.util.Arrays;

public class MyArrayList
{
	int size;
	int realsize;
	Object[] data;

	public MyArrayList()
	{
		size = 10;
		data = new Object[10];

	}

	public MyArrayList(MyArrayList c)
	{
		size = c.size;
		data = c.data;
	}

	public MyArrayList(int initialCapacity)
	{
		this();
		size = initialCapacity;
	}

	public void add(Object x)
	{
		if (size >= data.length)
		{
			Object[] t = new Object[size * 2];
			for (int i = 0; i < size; i++)
			{
				t[i] = data[i];
			}
			data = t;
		}
		data[size] = x;
		size++;
	}

	public void set(Object i, int index)
	{
		if (index < 0 || index >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		data[index] = i;
	}

	public int checkEmpty(Object[] a)
	{
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == null)
			{
				count++;
			}
		}
		return count;
	}

	public Object get(int i)
	{
		if (i < 0 || i >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		return data[i];
	}

	public void delete(Object e)
	{
		for (int i = 0; i < data.length; i++)
		{
			if (e.equals(this.get(i)))
			{
				this.set(null, i);
				size--;
			}
		}
	}

	public boolean containsDup()
	{
		for (int i = 0; i < size-1; i++)
		{
			for (int j = i+1; j < size; j++)
			{
				//System.out.println(size);
				if (this.get(i).equals(this.get(j)))
				{
					return true;
				}
			}
		}
		return false;

	}

	public void clear()
	{
		for(int i =0;i < size ;i++)
		{
			data[i]= null;
		}
	}

	public int frequency(Object e)
	{
		int count = 0;
		for (int i = 0; i < size; i++)
		{
			if (e.equals(this.get(i)))
			{
				count++;
			}
		}
		return count;
	}

	public void removeAll(Object e)
	{
		for (int i = 0; i < size; i++)
		{
			if (e.equals(this.get(i)))
			{
				this.set(null, i);
			}
		}
	}

	public void removeDup()
	{
		int count = 0;
		for (int i = 0; i < size-1; i++)
		{
			for (int j = i+1; j < size; j++)
			{
				if (this.get(i) == this.get(j))
				{
					
					this.set(null, j);
				
				}
			}
		}
	
		for(int i = 0; i< size; i++)
		{
			if(this.get(i) != null)
			{
				count ++;
			}
		}
		realsize = count;
	}

	public void trimToSize()
	{
		Object[] a = new Object[realsize];
		int count = 0;
		for (int i = 0; i < size; i++)
		{
			if (this.get(i) !=  null)
			{
				a[count] = this.get(i);
				count++;
			}

		}

		data = a;
	}

	public Object mode()
	{
		Object max = this.get(0);
		int maxcount = 0;
		for (int i = 0; i < size; i++)
		{
			int count = 0;
			for (int j = 1 + i; j < size; j++)
			{

				if (this.get(i).equals(this.get(j)))
				{
					count++;
				}
				if (maxcount < count)
				{
					maxcount = count;
					max = this.get(j);
				}

			}

		}
		return max;
	}

	public Object[] toArray()
	{
		Object[] x = new Object[size];
		int count =0;
		for (int i = 0; i < size; i++)
		{
			if (data[i] != null)
			{
				x[count] = data[i];
				count++;
			}
		}
		Object[] y = new Object[count];
		count = 0;
		for (int i = 0; i < size; i++)
		{
			if (x[i] != null)
			{
				y[count] = x[i];
				count++;
			}
		}
		data = y;
		size = count;
		return y;

	}

	public String toString()
	{
		Object[] x = toArray();
		return Arrays.toString(x);
	}

	public void print()
	{
		System.out.println(Arrays.toString(data));
	}

}
