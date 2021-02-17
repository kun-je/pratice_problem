import java.util.Scanner;

public class E5_7
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("please input 3 number");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double sum = a+b+c;
		double avg  = sum/3;
		System.out.println(sum);
		System.out.println(avg);
	}

}
