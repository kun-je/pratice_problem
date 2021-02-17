
public class EA4217
{

	public static void main(String[] args)
	{
		int countstar = 1;
		int countspace = 16;

		for (int i = 1; i <= 9; i++)
		{
			if (i <= 4)
			{
				for (int j = 1; j <= countstar; j++)
				{
					System.out.print("*");

				}
				for (int k = 1; k <= countspace; k++)
				{
					System.out.print("-");
				}
				for (int m = 1; m <= countstar; m++)
				{
					System.out.print("*");
				}
				countstar = countstar+2;
				countspace = countspace -4;
			}
			else
			{
				for(int n =1; n <= countstar;n++)
				{
					System.out.print("*");
				}
				for(int o = 1; o<= countspace; o++)
				{
					System.out.print("-");

				}
				for(int p = 1; p<= countstar; p++)
				{
					System.out.print("*");

				}
				countstar = countstar-2;
				countspace = countspace +4;
			}
			System.out.println();

		}
	}

}
