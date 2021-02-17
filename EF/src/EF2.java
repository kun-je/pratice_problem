
public class EF2
{

	public static void main(String[] args)
	{

		for (int i = 2; i < 500; i++)
		{
			for (int j = 2; j < 500; j++)
			{
				for (int k = 2; k < 500; k++)
				{
					if (j > i)
					{
						if (i * i + j * j == k * k)
						{
							System.out.println(i + "," + j + "," + k);
						}
					}
				}
			}
		}
	}

}
