import java.util.Scanner;

public class BMI
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double w,h,BMI;
		System.out.println("PLease input your weight(kg)");
		w = sc.nextDouble();
		System.out.println("PLease input your height(cm)");
		h = sc.nextDouble();
		h = h/100;
		BMI = w/(h*h);
		if(BMI > 25)
		{
			System.out.println("fat");
		}
		else if(BMI < 20)
		{
			System.out.println("thin");

		}
		else
		{
			System.out.println("normal");
		}
	}

}
