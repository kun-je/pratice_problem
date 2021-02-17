import java.util.Scanner;

public class EA1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double m1 = sc.nextDouble();
		double m2 = sc.nextDouble();
		double R = sc.nextDouble();
		double G = 6.6e-11;
		double f = (G*m1*m2)/(R*R);
		System.out.println(f);
	}

}
