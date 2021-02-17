import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		height = height/100;
		double bmi = weight / (height*height);
		System.out.println((new IsFat()).isFat(bmi));
		sc.close();
	}

}
