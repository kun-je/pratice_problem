
public class Q1
{

	public static void main(String[] args)
	{
		long count = 0;
		for(int i = 2; i <= 100000; i++)
		{
			boolean n = true;			
			for(int j = 2; j < i;j++)
			{
				if(i%j == 0)
				{
					n = false;
				}
			
			}
			if(n)
			{
				count ++;
			}
		}
		System.out.println(count);
	}

}
