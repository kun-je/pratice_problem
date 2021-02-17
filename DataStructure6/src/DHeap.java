public class DHeap
{
	int size = 0;
	int D = 3;
	int[] x = new int[20];

	private int getIndexChild(int i, int n)
	{
		return i * D + n;
	}

	private int getIndexParent(int i)
	{
		return (i - 1) / D;
	}

	public void add(int data)
	{
		x[size] = data;
		size++;
		int n = size - 1;
		int m = getIndexParent(n);
		while (n > 0 && m >= 0)
		{
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
		x[0] = x[size - 1];
		size--;
		int n = 0;
		while (true)
		{
			int max = 0;
			int max_index = -1;
			for (int i = 1; i <= D; i++)
			{
				if (getIndexChild(n, i) < size && max < x[getIndexChild(n, i)])
				{
					max = x[getIndexChild(n, i)];
					max_index = getIndexChild(i, max_index);
				}

			}
			if (max_index == -1 && max > x[n])
			{
				int t = x[n];
				x[n] = x[max_index];
				x[max_index] = t;
				n = max_index;
			} else
			{
				break;
			}

		}
	}

}
