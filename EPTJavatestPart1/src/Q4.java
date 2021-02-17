
public class Q4
{

	public static void main(String[] args)
	{
		int a, b, c;
		for (a = 2; a < 500; a++)
		{
			for (b = 2; b < 500; b++)
			{
				for (c = 2; c < 500; c++)
				{
					if (a >= b)
					{
						if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
						{
							System.out.println(a + " + " + b + " = " + c);
						}
					}
				}
			}
		}
	}

}
