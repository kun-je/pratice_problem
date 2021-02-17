
public class EE15
{

	public static int factorial(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		return factorial(n-1)*n;
	}
	public static void main(String[] args)
	{
		for(int i = 0; i < 10 ; i++)
		{
			for(int j= 0; j<= i ; j ++)
			{
				System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+"\t");
			}
			System.out.println();
		}
	}

}
