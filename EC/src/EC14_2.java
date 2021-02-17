import java.util.Scanner;

public class EC14_2
{

	public static double fac(double n)
	{
		double r = 1;
		for (double i = 1; i <= n; i++)
		{
			r = r * i;
		}
		return r;

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double e = 0;
		for (double i = 0; i <= n; i++)
		{
			e += 1.0 / fac(i);
		}
		System.out.println(e);

	}

}
