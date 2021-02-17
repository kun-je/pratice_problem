import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayList
{

	int size;
	Object[] data;

	public ArrayList()
	{
		size = 0;
		data = new Object[10];

	}

	public void add(Object x)
	{
		if (size >= data.length)
		{
			Object[] a = new Object[size * 2];
			for (int i = 0; i < size; i++)
			{
				a[i] = data[i];
			}
			data = a;
		}
		data[size] = x;
		size++;
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

	public Object getFirst()
	{
		return data[0];
	}

	public Object getLast()
	{
		return data[size - 1];
	}

	public Object get(int i)
	{
		if (i < 0 || i >= size)
		{
			throw new IndexOutOfBoundsException();
		}
		return data[i];
	}

	public void removeFirst()
	{
		Object[] a = new Object[size - 1];
		for (int i = 0; i < size - 1; i++)
		{
			a[i] = data[i + 1];
		}
		data = a;
		size--;
	}

	public void removeLast()
	{
		Object[] a = new Object[size - 1];
		for (int i = 0; i < size - 1; i++)
		{
			a[i] = data[i];
		}
		data = a;
		size--;
	}

	public void removeRange(int from, int to)
	{
		if (from < 0 || to > size)
		{
			throw new InvalidParameterException("invaild index : " + from + "or/and" + to);
		}

		int nsize = size - (to - from + 1);
		int count = 0;
		Object[] a = new Object[nsize];
		for (int i = 0; i < size; i++)
		{
			if (i < from || i > to)
			{
				a[count] = data[i];
				count++;
			}
		}
		data = a;
		size = size - (to - from + 1);
	}

	public int indexOf(Object e)
	{
		int i = 0;
		while (data[i] != e)
		{
			i++;
		}
		return i;
	}

	public int lastIndexOf(Object e)
	{
		int i = size - 1;
		while (data[i] != e)
		{
			i--;
		}
		return i;
	}

	public void shuffle()
	{
		Random r = new Random();

		for (int i = size - 1; i > 0; i--)
		{

			int j = r.nextInt(i);

			Object temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		}
	}
	
	public void reverse()
	{
		Object []a = new Object[size];
		for(int i  =0 ;i < size;i++)
		{
			a[i] = data[size-i-1];
		}
		data = a;
	}

	public Object[] toArray()
	{
		Object[] x = new Object[size];
		for (int i = 0; i < size; i++)
		{
			x[i] = data[i];
		}
		return x;
	}

	public String toString()
	{
		Object[] x = toArray();
		return Arrays.toString(x);
	}

	public void print()
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.println(data[i]);
		}
	}

	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		for (int i = 0; i < 10; i++)
		{
			a.add((int) (Math.random() * 10));
		}

		/*
		 * for(int i =0; i< a.size;i++) { System.out.println(a.get(i)); }
		 */
		a.print();
		System.out.println(a.toString());
		System.out.println("///////");

		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println("//////");
		a.removeFirst();
		a.removeLast();
		a.print();
		System.out.println("//////");

		// System.out.println(a.indexOf(5));
		// System.out.println(a.lastIndexOf(5));

		System.out.println("//////");

		a.removeRange(2, 5);
		a.print();
		
		System.out.println("//////");
		a.shuffle();
		a.print();
		
		System.out.println("//////");
		a.reverse();
		a.print();

	}

}
