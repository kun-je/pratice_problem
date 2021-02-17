
public class C6
{

	public static void main(String[] args)
	{
		int n  = 10;
		for(int j =1; j <= n ; j++)
		{
			int i = 1;
			while(i <= 10 - j)
			{
				System.out.print("-");
				i++;
			}
			 i = 1;
			while(i <=j )
			{
				System.out.print("x");
				i++;
			}
			i=2;
			while(i <= j )
			{
				System.out.print("x");
				i++;
			}
			System.out.println();
		}
	}

}
