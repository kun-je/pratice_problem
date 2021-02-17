import java.util.Scanner;

public class E5_3
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input radius");
		double a = sc.nextDouble();
		double r = Math.sqrt(a/(Math.PI));
		System.out.println(r);
	}
}
