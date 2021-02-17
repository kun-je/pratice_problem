
public class C5
{

	public static void main(String[] args)
	{
		for(int i = 0 ; i < 10; i++)
		{
			for(int j = 1 ; j < 10-i; j++)
			{
				System.out.print("-");
			}
			for(int x = 0 ; x <  i+1; x++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
	}

}
