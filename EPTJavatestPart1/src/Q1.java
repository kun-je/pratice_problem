
public class Q1
{

	public static void main(String[] args)
	{
		for (int i =0; i < 10; i++)
		{
			for(int r  = 0; r < 10-i-1; r++)
			{
				System.out.print("-");
			}
			for(int j = 0; j <= i;j++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}

}
