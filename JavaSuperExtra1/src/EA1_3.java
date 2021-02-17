import java.util.Scanner;

public class EA1_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double R = sc.nextDouble();
		double f = sc.nextDouble();
		double G = (f*R*R)/(m1*m2);
		System.out.println(G);
	}

}
