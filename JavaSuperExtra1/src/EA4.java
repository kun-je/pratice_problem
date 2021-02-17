import java.util.Scanner;

public class EA4
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double l = sc.nextDouble();
		double r = l *1.59e-8/a;
		System.out.print(r);
	}

}
