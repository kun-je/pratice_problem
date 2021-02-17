import java.util.Scanner;

public class E5_11
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input a1");
		double a1 = sc.nextDouble();
		//System.out.println("please input b1");
		double b1 = sc.nextDouble();
		//System.out.println("please input c1");
		double c1 = sc.nextDouble();
		//System.out.println("please input a2");
		double a2 = sc.nextDouble();
		//System.out.println("please input b2");
		double b2 = sc.nextDouble();
		//System.out.println("please input c2");
		double c2 = sc.nextDouble();
		double x = (c1*b2 -b1*c2)/(a1*b2 - b1*a2);
		double y = (a1*c2-c1*a2)/(a1*b2-b1*a2);
		System.out.println(x);
		System.out.println(y);


	}

}
