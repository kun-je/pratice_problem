import java.util.Scanner;

public class Q1
{

	public static void main(String[] args)
	{
		//System.out.println("a");

		Scanner sc = new Scanner(System.in);
		double time = sc.nextDouble();
		double liters = 0;
		while (time > 0)
		{
			liters += 0.5;
			time--;

		}
		liters -= 0.5;
		System.out.println(liters);

	}

}
