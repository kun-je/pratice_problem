import java.util.Scanner;

public class Q5
{

	public static int max(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		if(b> a)
		{
			return b;
		}
		else
		{
			return 0;
		}
	}
	public static int blackJack(int a, int b)
	{

		if(a > 21 && b > 21)
		{
			return 0;
		}
		else if(a >21)
		{
			return b;
		}
		else if(b> 21)
		{
			return a;
		}
		else
		{
			return max(a,b);
		}

		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(blackJack(a,b));

	}

}
