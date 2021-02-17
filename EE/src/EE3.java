
public class EE3
{

	public static void main(String[] args)
	{

		for(int n =2; n <= 12; n++)
		{
			System.out.printf("**** %d ****\n",n);
			int sum = 0;
			for(int i = 1; i <=12;i++)
			{
				sum = n *i;
				System.out.printf("%d * %d = %d\n",n,i,sum);
			}
		}
	}

}
