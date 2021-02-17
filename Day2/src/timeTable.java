
public class timeTable
{

	public static void main(String[] args)
	{
		System.out.print("* | ");
		int k;
		for(int a =1; a< 10; a++)
		{
			System.out.print(a+" ");

		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");

		for(int i = 1; i < 10; i++)
		{
			System.out.print(i+" | ");
			for(int j = 1; j < 10; j++)
			{
				k = i*j;
				System.out.print(k+" ");

			}
			System.out.println();
		}
	}

}
