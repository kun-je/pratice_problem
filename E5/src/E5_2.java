import java.util.Scanner;

public class E5_2
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input radius");
		double r = sc.nextDouble();
		double Area = Math.PI*(r*r);
		System.out.println(Area);
	}

}
