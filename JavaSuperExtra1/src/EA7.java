import java.util.Scanner;

public class EA7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double ka = sc.nextDouble();
		double pa = sc.nextDouble();
		double kb = sc.nextDouble();
		double pb = sc.nextDouble();
		double a, b;
		a = ka/pa;
		b = kb/pb;
		if(a>b)
		{
			System.out.println("A is cheaper than B");
		}
		else if(b > a)
		{
			System.out.println("B is cheaper than A");
		}
		else
		{
			System.out.println("Equal price");

		}
	}

}
