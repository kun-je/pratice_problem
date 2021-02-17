
public class ArrayQueue
{
	int data[];
	int head;
	int tail;
	int size;

	public ArrayQueue()
	{
		data = new int [10];
		head = 0;
		tail = -1;
		size = 0;
		
	}
	
	public void enqueue(int x)
	{
		tail = (tail+1)%data.length;
		data[tail]= x;
		size++;
	}
	
	public int dequeue()
	{
		int temp = data[head];
		size--;
		head = (head + 1)% data.length;
		return temp;
	}
	public int peek()
	{
		return data[head];
	}
	
	public boolean isEmpty()
	{
		for(int i  = 0; i < data.length;i++)
		{
			if(data[i] != 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean isFull()
	{
		for(int i  = 0; i < data.length;i++)
		{
			if(data[i] == 0)
			{
				return false;
			}
		}
		return true;
	}
}
