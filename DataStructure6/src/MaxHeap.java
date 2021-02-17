
public class MaxHeap
{
	int size = 0;
	int[] x = new int[20];

	private int getIndexLeftChild(int i)
	{
		return i * 2 + 1;
	}

	private int getIndexRightChild(int i)
	{
		return i * 2 + 2;
	}

	private int getIndexParent(int i)
	{
		return (i - 1) / 2;
	}

	public void add(int data)
	{
		x[size] = data;
		size++;
		int n = size - 1;
		int m = getIndexParent(n);//mother node
		while (n > 0 && m >= 0)
		{
			//mother less than us we switch
			if (x[m] < x[n])
			{
				int t = x[m];
				x[m] = x[n];
				x[n] = t;
			} else
			{
				break;
			}
			n = m;
			m = getIndexParent(n);
		}
	}

	private int getMax()
	{
		//if no node return error
		if (size == 0)
		{
			return -1;
		}
		return x[0];
	}

	public void removeMax()
	{
		if (size == 0)
			return;
		//เอาตูดไปทับหัวและกระเทิบลง
		x[0] = x[size - 1];
		size--;
		int n = 0;
		while (true)
		{
			int l = getIndexLeftChild(n);
			int r = getIndexRightChild(n);
			if (r < size)
			{
				if (x[l] >= x[n] && x[l] >= x[r])
				{
					int t = x[l];
					x[l] = x[n];
					x[n] = t;
					n = l;
				} else if (x[r] >= x[n] && x[r] >= x[l])
				{
					int t = x[r];
					x[r] = x[n];
					x[n] = t;
					n = r;
				}
				if (x[n] > x[r] && x[n] > x[l])
				{
					break;
				}
			}
			else if(l < size)
			{
				if(x[l] > x[n])
				{
					int t = x[l];
					x[l] = x[n];
					x[n] = t;
					n = l;
				}
				else
				{
					break;
				}
			}
			else
			{
				break;
			}
		}
	}
	
	public void sort(int [] k)
	{
		MaxHeap h = new MaxHeap();
		for(int i = 0; i < k.length; i++)
		{
			h.add(k[i]);
		}
		for(int i = 0; i < k.length; i++)
		{
			int t = h.getMax();
			h.removeMax();
			k[k.length -1-i] = t;
		}
	}
	

}
