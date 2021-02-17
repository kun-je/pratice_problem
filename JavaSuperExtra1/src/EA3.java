import java.util.Scanner;

public class EA3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double t = sc.nextDouble();
		double l = sc.nextDouble();
		double g = l/(Math.pow(t/(2*Math.PI), 2));
		System.out.println(g);
		
		
	}

}
