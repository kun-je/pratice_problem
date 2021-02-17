
public class xtox
{

	public static void main(String[] args)
	{
		int n  = 9;
		for(int j =1; j <= n ; j++)
		{
			for(int i =1; i <= n*2; i++)
			{
				if( i == j || i == n -j +1 )
				{
					System.out.print("x");
				}
				else if(i < 10)
				{
					System.out.print("-");
				}
			}
			System.out.println();

		}
	}

}
