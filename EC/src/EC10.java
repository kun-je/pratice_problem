
public class EC10
{

	public static void main(String[] args)
	{
		for(int i = 1; i <= 10; i++)
		{
			double h =0;
			for(int j = 1; j<= i; j++)
			{
				h += 1.0/j;
			}
			System.out.println(h);
		}
	}

}
