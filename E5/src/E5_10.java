import java.util.Scanner;

public class E5_10
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input frequency");
		double f1 = sc.nextDouble();
		double f0 = 2e10;
		double v = 10.7585e8*((f1-f0)/(f1+f0));
		System.out.println(v);
	}

}
