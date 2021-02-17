import java.util.Scanner;

public class ED5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println(absolute(x));
	}
	
	public static double absolute(double x)
	{
		if(x>= 0) return x;
		return x*-1;
	}

}
