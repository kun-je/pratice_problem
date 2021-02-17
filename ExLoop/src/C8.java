
public class C8
{

	public static void main(String[] args)
	{
		int n = 1;
		for (int j = 1; j <= 10; j++)
		{
			int i = 0;
			while (i <= 10 - j-1)
			{
				System.out.print("-");
				i++;
			}
			if (j % 2 == 0)
			{
				for (int x = 0; x < n; x++)
				{
					System.out.print(x + 1);
				}
			} 
			else
			{
				for (int x = n; x > 0; x -= 1)
				{
					System.out.print(x);
				}
			}
			n += 2;

			System.out.println();
		}
	}

}
