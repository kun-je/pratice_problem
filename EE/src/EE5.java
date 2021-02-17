
public class EE5
{

	public static void main(String[] args)
	{
		int prime = 0;
		for (int i = 1; i < 10000000; i++)
		{
			boolean check = true;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					check = false;
				}
	
			}
			if(check == true)
			{
				prime = i;
			}

		}
		System.out.println(prime);
	}

}
