import java.util.Scanner;

public class ED7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(isPrime(x));
	}
	
	public static int isPrime(int x)
	{
		for(int i = 2; i < x; i++)
		{
			if(x%i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

}
